class Clock {

    int hours = 12;
    int minutes = 00;

    void next() {
        if (this.minutes == 59 && hours == 11) {
            this.minutes = 0;
            this.hours = 12;
        } else if (this.minutes == 59 && this.hours == 12) {
            this.minutes = 0;
            this.hours = 1;
        } else if (this.minutes == 59 && this.hours < 12) {
            this.minutes = 0;
            this.hours = this.hours + 1;
        } else {
            this.minutes = this.minutes + 1;
        }
    }
}