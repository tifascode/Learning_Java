package Enum_com_Implements;

import java.sql.SQLOutput;

public enum MyPet implements Pet {
    CAT {
        @Override
        public String talk() {
            return "Meow";
        }
    },
    DOG {
        @Override
        public String talk() {
            return "Wruff";
        }
    },
    PIG {
        @Override
        public String talk() {
            return "Oink";
        }
    },
}
