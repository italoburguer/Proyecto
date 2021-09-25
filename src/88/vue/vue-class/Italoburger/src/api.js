//const url = 'https://randomuser.me/api/';
const url = 'https://randomuser.me/api/';
function getUsersPromise() {
    return fetch(url+'')
        .then(res => res.json())
        .then(data => data.results)
        .catch(err => console.log(err))
}

const getUsersAsync = async () => {
    try {


        const res = await fetch(url+'?results=50');
        const data = await res.json();
        return data.results;
    } catch (error) {
        console.log(error);
    }
}

const getUserData = async (id) => {
try {
    //const res = await fetch('${url}?id= +id');
    const res = await fetch(url+'?id='+id);
    const data = await res.json();
    return data.results;
} catch (error) {
    console.log(error);
}
}


export default {
    getUsersPromise,
    getUserData,
    getUsersAsync
}
