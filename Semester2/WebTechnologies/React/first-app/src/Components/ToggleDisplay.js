import React, { Component } from "react";
class ToggleDisplay extends React.Component {
    constructor() {
        super();
        this.state = { displayBio: false };
        console.log('Component this', this);
        this.toggleDisplayBio = this.toggleDisplayBio.bind(this);
    }
    toggleDisplayBio() {
        this.setState({ displayBio: !this.state.displayBio });
    }
    render() {
        return (
            <div>
                <h1> WELCOME TO CHANGING STATE!!!!</h1>
                {
                    this.state.displayBio ? (
                        <div>
                            <p>
                                <h2> PRACTICING JAVA SCRIPT CAN MAKE YOU PERFECT WEB PROGRAMMER</h2>
                            </p>
                            <button onClick={this.toggleDisplayBio}>Show Less</button>
                        </div>
                    ) : (
                        <div>
                            <button onClick={this.toggleDisplayBio}>Read More</button>
                        </div>
                    )
                }
            </div>
        )
    }
}
export default ToggleDisplay;