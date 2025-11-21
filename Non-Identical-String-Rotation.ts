// 'use strict';
//
// process.stdin.resume();
// process.stdin.setEncoding('utf-8');
//
// let inputString: string = '';
// let inputLines: string[] = [];
// let currentLine: number = 0;
//
// process.stdin.on('data', function (inputStdin: string): void {
// 	inputString += inputStdin;
// });
//
// process.stdin.on('end', function (): void {
// 	inputLines = inputString.split('\n');
// 	inputString = '';
//
// 	main();
// });
//
// function readLine(): string {
// 	return inputLines[currentLine++];
// }


/*
 * Complete the 'isNonTrivialRotation' function below.
 *
 * The function is expected to return a BOOLEAN.
 * The function accepts following parameters:
 *  1. STRING s1
 *  2. STRING s2
 */


function createMap (s :string){
	const obj: { [key: string]: string } = {};
	for (let i = 0 ; i < s.length; i++){
		if (i === s.length-1) {
			obj[s[i]] = s[0];
			break;
		}
		obj[s[i]] = s[i+1]
	}
	
	return obj
}

function isNonTrivialRotation(s1: string, s2: string): boolean {
	if (s1.length !== s2.length) {
		return false;
	}
	const obj1 = createMap(s1);
	const obj2 = createMap(s2)
	
	for (let i = 0; i < s1.length; i++) {
		if (obj1[s1[i]] !== obj2[s1[i]]){
			return false
		}
	}
	
	return true
}

const s1 = "ahmed"
const istrue = isNonTrivialRotation("abcde", "cdeab")
console.log(istrue)
// function main() {
// 	const s1: string = readLine();
//
// 	const s2: string = readLine();
//
// 	const result: boolean = isNonTrivialRotation(s1, s2);
//
// 	process.stdout.write((result ? 1 : 0) + '\n');
// }
