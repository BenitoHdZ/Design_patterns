class VideoConversionFacade {
    private VideoConverter converter = new VideoConverter();
    public void convert(String filename, String format){
        System.out.println("Iniciando conversión de " + filename);
        converter.decode();
        converter.mixAudio();
        converter.export(format);
        System.out.println("Conversión completada.");
    }
}