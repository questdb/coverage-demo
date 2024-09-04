use super::*;

#[test]
fn test_when_true() {
    let result = rust_inc_if_true(1, true);
    assert_eq!(result, 2);
}

#[test]
fn test_when_false() {
    let result = rust_inc_if_true(1, false);
    assert_eq!(result, 1);
}
