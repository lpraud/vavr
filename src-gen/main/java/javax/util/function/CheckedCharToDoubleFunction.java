/**    / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
package javax.util.function;

/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*\
   G E N E R A T O R   C R A F T E D
\*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*/

import javaslang.CheckedFunction1;

@FunctionalInterface
public interface CheckedCharToDoubleFunction extends CheckedFunction1<Character, Double> {

    static final long serialVersionUID = 1L;

    double applyAsDouble(char value) throws Throwable;

    @Override
    default Double apply(Character value) throws Throwable {
        return applyAsDouble(value);
    }
}