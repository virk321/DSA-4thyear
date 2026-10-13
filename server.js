// const{add,sub} = require("./Oct-13");
// console.log(add(5,5));
// console.log(sub(10,4));
// console.log("manjot")

const express = require("express");
const app = express();
const PORT=3000;

app.get("/",(req,res)=>{
    res.send("welcome manjot");
})

app.get("/abc",(req,res)=>{
    res.send("how are you?")
})

app.listen(PORT,()=>{
    console.log(`server is running on ${PORT}`);
})