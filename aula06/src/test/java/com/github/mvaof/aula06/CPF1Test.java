package com.github.mvaof.aula06;

import org.junit.Assert;
import org.junit.Test;




public class CPF1Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        int []a = {2, 3, 5, 6, 7, 8};
        CPF1.Cpf(a);
    }

    @Test
    public void testCasoTrivial() {
        int[] d = {0, 0, 5, 0, 8, 8, 3, 1, 2, 5, 3, 9};
        Assert.assertTrue(CPF1.Cpf(d));
        int[] a = {0, 0, 1, 2, 1, 2, 4, 5, 0, 1, 2, 4};
        Assert.assertTrue(CPF1.Cpf(a));
        int[] b = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        Assert.assertTrue(CPF1.Cpf(b));
        int[] r = {0, 0, 5, 0, 8, 8, 3, 1, 2, 5, 3, 8};
        Assert.assertFalse(CPF1.Cpf(r));
    }
    @Test
    public void testInstanciar() {
        new CPF1();
    }

}