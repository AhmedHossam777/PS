1func groupAnagrams(strs []string) [][]string {
2	var result [][]string
3	
4	strMap := make(map[string][]string)
5	
6	for _, str := range strs {
7		chars := []rune(str)
8		sort.Slice(chars, func(i, j int) bool {
9			return chars[i] < chars[j]
10		})
11		key := string(chars)
12		
13		strMap[key] = append(strMap[key], str)
14	}
15	
16	for _, miniArr := range strMap {
17		result = append(result, miniArr)
18	}
19	
20	return result
21}