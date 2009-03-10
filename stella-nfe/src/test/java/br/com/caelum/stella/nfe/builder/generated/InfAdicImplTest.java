package br.com.caelum.stella.nfe.builder.generated;

public final class InfAdicImplTest {
    @org.junit.Test
    public void testInfAdicInterface() {
        InfAdic infAdic = new InfAdicImpl().withInfAdFisco("abc").withInfCpl("abc").withObsCont(new ObsContImpl())
                .withObsFisco(new ObsFiscoImpl()).withProcRef(new ProcessoReferenciadoImpl());
        assertModelWasFilled(infAdic);
    }

    private void assertModelWasFilled(final InfAdic infAdic) {
        new br.com.caelum.stella.nfe.builder.BuilderTestHelper(infAdic).assertModelWasFilled();
    }
}