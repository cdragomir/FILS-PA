import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReaderWriter {

	public final String fileName;

	/* Maps the index of a subject in the graph with its real name */
	private Map<Integer, String> map;

	/* Alphanumeric pattern, used at parsing the input */
	private String subjectPattern = "[a-zA-Z0-9]+";

	public ReaderWriter(String fileName) {
		this.fileName = fileName;

		map = new HashMap<>();
	}

	/**
	 * Build the entire name of the subject given a list of string tokens,
	 * which represents parts of the subject's name
	 *
	 * @param tokens
	 * @param from
	 * @param to
	 * @return
	 */
	private String buildSubjectName(String[] tokens, int from, int to) {
		StringBuilder subject = new StringBuilder();
		int i = from;
		for ( ; i < to; i++) {
			subject.append(tokens[i]);
			subject.append(" ");
		}
		subject.append(tokens[i]);

		return subject.toString();
	}

	/**
	 * Parse the input in such a way that all the subjects will have
	 * a corresponding unique key in the graph
	 * @return
	 */
	public List<List<Integer>> parseInput() {
		BufferedReader br = null;

		try {

			br = new BufferedReader(new FileReader(fileName));
			// a temporary map used to give unique positive keys to subjects
			Map<String, Integer> occurences = new HashMap<>();
			// used in order to give the subjects indices within the graph
			int nodesCnt = -1;
			int numNodes, numLines;

			String line = br.readLine();
			String[] tokens = line.split(" ");
			numNodes = Integer.valueOf(tokens[0]);
			numLines = Integer.valueOf(tokens[1]);
			// graph to build and return
			List<List<Integer>> graph = new ArrayList<List<Integer>>(numNodes);
			for (int nodeIdx = 0; nodeIdx < numNodes; nodeIdx++) {
				graph.add(nodeIdx, new ArrayList<Integer>());
			}

			while (numLines-- > 0) {
				line = br.readLine();
				tokens = line.split(" "); // split the line in tokens
				int splitPos = 0;

				// find the split position in the tokens array, between the
				// two subjects, which is given by the position of the arrow
				while (splitPos < tokens.length) {
					if (!tokens[splitPos].matches(subjectPattern)) {
						break;
					}
					splitPos++;
				}
				String subject1 = buildSubjectName(tokens, 0, splitPos - 1);
				String subject2 = buildSubjectName(
						tokens, splitPos + 1, tokens.length - 1);

				if (!occurences.containsKey(subject1)) {
					nodesCnt++;
					occurences.put(subject1, nodesCnt);
					map.put(nodesCnt, subject1);
				}
				if (!occurences.containsKey(subject2)) {
					nodesCnt++;
					occurences.put(subject2, nodesCnt);
					map.put(nodesCnt, subject2);
				}
				
				List<Integer> subj1Neighbors = graph.get(occurences.get(subject1));
				subj1Neighbors.add(occurences.get(subject2));
				graph.set(occurences.get(subject1), subj1Neighbors);
			}

			return graph;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

		return null;
	}

	/**
	 * Write the solution given the list of indices which correspond
	 * to the correct order of the subjects to be studied
	 *
	 * @param subjectsKeys
	 */
	void writeSolution(List<Integer> subjectsKeys) {
		List<String> outputAsStrings = new ArrayList<>();

		for (Integer subjectIdx : subjectsKeys) {
			outputAsStrings.add(map.get(subjectIdx));
		}

		System.out.println("Order to study subjects:");
		for (String subject : outputAsStrings) {
			System.out.println(subject);
		}
	}

}
