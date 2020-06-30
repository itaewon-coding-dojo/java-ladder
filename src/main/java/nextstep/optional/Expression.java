package nextstep.optional;

import java.util.stream.Stream;

enum Expression {
    PLUS("+"), MINUS("-"), TIMES("*"), DIVIDE("/");

    private String expression;

    Expression(String expression) {
        this.expression = expression;
    }

    private static boolean matchExpression(Expression e, String expression) {
        return expression.equals(e.expression);
    }

    static Expression of(String expression) {
        return Stream.of(values())
                .filter(v -> matchExpression(v, expression))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
