package tdd;

import Assignment.SevenSegmentDisplay;
import org.junit.jupiter.api.Test;

class SevenSegmentDisplayTest {
        @Test
        public void displayTest() {
            SevenSegmentDisplay sevenSegment = new SevenSegmentDisplay();
            sevenSegment.display();
        }
        @Test
        public void setScreenTest() {
            SevenSegmentDisplay sevenSegment = new SevenSegmentDisplay();
            sevenSegment.setScreen("11111101");
            sevenSegment.display();
        }
    }