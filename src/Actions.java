public enum Actions {
    EAT{
        @Override
        public String str(){
            return "What eat";
        }
    },
    DRINK{
        @Override
        public String str(){
            return "What drink";
        }

    },
    SEE{
        @Override
        public String str() {
            return "What see";
        }
    },
    LOOK {
        @Override
        public String str() {
            return "How look";
        }
    },
    THINK {
        @Override
        public String str() {
            return "think";
        }
    },
    FEEL {
        @Override
        public String str() {
            return "What feel";
        }
    },
    DO {
        @Override
        public String str() {
            return "What do";
        }
    },
    UNDERSTAND {
        @Override
        public String str() {
            return "understand";
        }
    },
    LIKE {
        @Override
        public String str() {
            return "like";
        }
    };


    public abstract String str();
}
