import React from 'react';
import Layout from "./components/layout/layout";
import UserTable from "./components/admin/userTable";

function App() {
  return (
    <div className="App">
      <Layout>
          <UserTable/>
      </Layout>
    </div>
  );
}

export default App;
