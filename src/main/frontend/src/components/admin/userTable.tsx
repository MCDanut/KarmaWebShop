import * as React from "react";
import axios from 'axios';

class UserTable extends React.Component {

    state = {
        users: [{id:0, fullName:"place", email:"holder", phoneNumber:2}]
    };

    componentDidMount(): void {
        axios.get("http://localhost:8080/api/users/getAll").then(res => {
            const users = res.data;
            this.setState({users: users});
        });
    }

    render(): React.ReactElement<any, string | React.JSXElementConstructor<any>> | string | number | {} | React.ReactNodeArray | React.ReactPortal | boolean | null | undefined {
        return (
            <div className="container">
                <h3 className="mb-30">Users</h3>
                <div className="progress-table-wrap">
                    <div className="progress-table">
                        <div className="table-head">
                            <div className="serial">#</div>
                            <div className="fullName">Full Name</div>
                            <div className="email">Email</div>
                            <div className="phoneNumber">Phone Number</div>
                        </div>
                        <div id="table-rows">
                            {/*<div className="table-row">*/}
                            {/*    <div className="serial">01</div>*/}
                            {/*    <div className="country">Canada</div>*/}
                            {/*    <div className="visit">645032</div>*/}
                            {/*</div>*/}
                            {this.state.users.map((us) => (
                                <div key={us.id} className="table-row">
                                    <div className="serial">{us.id}</div>
                                    <div className="fullName">{us.fullName}</div>
                                    <div className="email">{us.email}</div>
                                    <div className="phoneNumber">{us.phoneNumber}</div>
                                </div>
                            ))}
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

    export default UserTable;