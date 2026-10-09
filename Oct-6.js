// let students = ["Manjot", "Randeep", 1, 45];
// students.push(false);
// students.pop();
// students.unshift("Hello");
// students.shift();
// let x = students.indexOf("Manjot");
// let y = students.includes(1);
// console.log(students)
// console.log(x);
// console.log(y);
// console.log(students.length);



// let studentMap = new Map();
// studentMap.set("name","Manjot");
// studentMap.set("age",22);
// studentMap.set("course", "CSE");
// studentMap.set("id",12);

// console.log(studentMap.get("name"));
// console.log(studentMap.has("name"));
// console.log(studentMap.delete("name"));
// console.log(studentMap.size);
// console.log(studentMap.clear)


//filter
let num = [99,100,200,300,400,500];
let res = num.filter((n)=>{
    if(n>200){
        return n;
    }
});
console.log(res);


//map
let r = num.map((n)=>{
    return n*2;
})
console.log(r);


//reduce
let rr = num.reduce((s,n)=>{
    return s += n;
},0);
console.log(rr);