<template>
  <div>
    <UserTable :users="users"></UserTable>
    <Users v-bind:users="users"></Users>
  </div>
</template>
<script>
import api from "@/api";
import Users from "@/views/Users.vue";
//import UsersTable from '@/components/UsersTable';

export default {
  name: "Home",
  components: {
    Users,
  },
  data() {
    return {
      users: [],
    };
  },
  created() {
    //api.getUsersPromise().then(dta => console.log(FormData));
    (async () => {
      this.users = await api.getUsersAsync();
      console.log(this.users);
    })();
  },
};
</script>