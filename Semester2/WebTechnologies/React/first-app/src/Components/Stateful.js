import React, { Component } from "react";
class Stateful extends React.Component {
    constructor() {
        super();
        this.state = { displayBio: true };
    }
    render() {
        const bio = this.state.displayBio ? (
            <div>
                <p>
                    <h2>
                        This is an example of creating stateful component
                    </h2>
                </p>
            </div>
        ) : null;
        return (
            <div>
                <h1> Welcome to JavaScript Learning</h1>
                {bio}
            </div>
        );
    }
}
export default Stateful;