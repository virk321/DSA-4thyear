let student ={
    "name1":"manjot",
    "age":22
}
const{name1,age}=student;
console.log(name1);
console.log(age);

const fruits= ["apple","mango","kiwi"];
const[first,sec,third]=fruits;
console.log(first);

const[x, ,y]=["pen","copy","pencil"];
console.log(x);
console.log(y);
const[z,...k]=[1,2,3,4,5,6];
console.log(z)
console.log(k)
console.log(z,...k)


let a = "hello";
let b = `hi, ${a}`;
console.log(b);



try {
let result = 10 / 0;
console.log(result); 
let data = JSON.parse("invalid json");
} catch (error) {
console.log("Oops! Something went wrong:");
console.log(error.message); 
} finally {
console.log("This ALWAYS runs!"); 
}