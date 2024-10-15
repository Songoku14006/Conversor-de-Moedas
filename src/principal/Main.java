package principal;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        List<String> moedasids = new ArrayList<>();
        String moedaconverter = " ";
        Scanner moedaScanner = new Scanner(System.in);
        System.out.println("""
                Passos para usar o programa:
                1. Digite o ID da moeda da qual deseja converter e aperte enter
                2. Digite o ID da moeda para a qual deseja converter e aperte enter
                3. Digite o valor que deseja converter
                4. Abaixo segue a lista de moedas suportadas
                AFN - Afghan Afghani
                AED - United Arab Emirates Dirham
                ALL - Albanian Lek
                AMD - Armenian Dram
                ANG - Netherlands Antillean Guilder
                AOA - Angolan Kwanza
                ARS - Argentine Peso
                AUD - Australian Dollar
                AWG - Aruban Florin
                AZN - Azerbaijani Manat
                BAM - Bosnia-Herzegovina Convertible Mark
                BBD - Barbadian Dollar
                BDT - Bangladeshi Taka
                BGN - Bulgarian Lev
                BHD - Bahraini Dinar
                BIF - Burundian Franc
                BMD - Bermudian Dollar
                BND - Brunei Dollar
                BOB - Bolivian Boliviano
                BRL - Brazilian Real
                BSD - Bahamian Dollar
                BTN - Bhutanese Ngultrum
                BWP - Botswana Pula
                BYN - Belarusian Ruble
                BZD - Belize Dollar
                CAD - Canadian Dollar
                CDF - Congolese Franc
                CHF - Swiss Franc
                CLP - Chilean Peso
                CNY - Chinese Yuan
                COP - Colombian Peso
                CRC - Costa Rican Colón
                CUP - Cuban Peso
                CVE - Cape Verdean Escudo
                CZK - Czech Koruna
                DJF - Djiboutian Franc
                DKK - Danish Krone
                DOP - Dominican Peso
                DZD - Algerian Dinar
                EGP - Egyptian Pound
                ERN - Eritrean Nakfa
                ETB - Ethiopian Birr
                EUR - Euro
                FJD - Fijian Dollar
                FKP - Falkland Islands Pound
                FOK - Faroese Króna
                GBP - British Pound Sterling
                GEL - Georgian Lari
                GGP - Guernsey Pound
                GHS - Ghanaian Cedi
                GIP - Gibraltar Pound
                GMD - Gambian Dalasi
                GNF - Guinean Franc
                GTQ - Guatemalan Quetzal
                GYD - Guyanese Dollar
                HKD - Hong Kong Dollar
                HNL - Honduran Lempira
                HRK - Croatian Kuna
                HTG - Haitian Gourde
                HUF - Hungarian Forint
                IDR - Indonesian Rupiah
                ILS - Israeli New Shekel
                IMP - Isle of Man Pound
                INR - Indian Rupee
                IQD - Iraqi Dinar
                IRR - Iranian Rial
                ISK - Icelandic Króna
                JEP - Jersey Pound
                JMD - Jamaican Dollar
                JOD - Jordanian Dinar
                JPY - Japanese Yen
                KES - Kenyan Shilling
                KGS - Kyrgyzstani Som
                KHR - Cambodian Riel
                KID - Kiribati Dollar
                KMF - Comorian Franc
                KRW - South Korean Won
                KWD - Kuwaiti Dinar
                KYD - Cayman Islands Dollar
                KZT - Kazakhstani Tenge
                LAK - Lao Kip
                LBP - Lebanese Pound
                LKR - Sri Lankan Rupee
                LRD - Liberian Dollar
                LSL - Lesotho Loti
                LYD - Libyan Dinar
                MAD - Moroccan Dirham
                MDL - Moldovan Leu
                MGA - Malagasy Ariary
                MKD - Macedonian Denar
                MMK - Myanmar Kyat
                MNT - Mongolian Tögrög
                MOP - Macanese Pataca
                MRU - Mauritanian Ouguiya
                MUR - Mauritian Rupee
                MVR - Maldivian Rufiyaa
                MWK - Malawian Kwacha
                MXN - Mexican Peso
                MYR - Malaysian Ringgit
                MZN - Mozambican Metical
                NAD - Namibian Dollar
                NGN - Nigerian Naira
                NIO - Nicaraguan Córdoba
                NOK - Norwegian Krone
                NPR - Nepalese Rupee
                NZD - New Zealand Dollar
                OMR - Omani Rial
                PAB - Panamanian Balboa
                PEN - Peruvian Sol
                PGK - Papua New Guinean Kina
                PHP - Philippine Peso
                PKR - Pakistani Rupee
                PLN - Polish Zloty
                PYG - Paraguayan Guarani
                QAR - Qatari Riyal
                RON - Romanian Leu
                RSD - Serbian Dinar
                RUB - Russian Ruble
                RWF - Rwandan Franc
                SAR - Saudi Riyal
                SBD - Solomon Islands Dollar
                SCR - Seychellois Rupee
                SDG - Sudanese Pound
                SEK - Swedish Krona
                SGD - Singapore Dollar
                SHP - Saint Helena Pound
                SLE - Sierra Leonean Leone
                SLL - Sierra Leonean Leone (Old)
                SOS - Somali Shilling
                SRD - Surinamese Dollar
                SSP - South Sudanese Pound
                STN - São Tomé and Príncipe Dobra
                SYP - Syrian Pound
                SZL - Eswatini Lilangeni
                THB - Thai Baht
                TJS - Tajikistani Somoni
                TMT - Turkmenistani Manat
                TND - Tunisian Dinar
                TOP - Tongan Paʻanga
                TRY - Turkish Lira
                TTD - Trinidad and Tobago Dollar
                TVD - Tuvaluan Dollar
                TWD - New Taiwan Dollar
                TZS - Tanzanian Shilling
                UAH - Ukrainian Hryvnia
                UGX - Ugandan Shilling
                USD - United States Dollar
                UYU - Uruguayan Peso
                UZS - Uzbekistani Som
                VES - Venezuelan Bolívar Soberano
                VND - Vietnamese Đồng
                VUV - Vanuatu Vatu
                WST - Samoan Tala
                XAF - Central African CFA Franc
                XCD - East Caribbean Dollar
                XDR - Special Drawing Rights
                XOF - West African CFA Franc
                XPF - CFP Franc
                YER - Yemeni Rial
                ZAR - South African Rand
                ZMW - Zambian Kwacha
                ZWL - Zimbabwean Dollar
                """);
        System.out.println("Digite o ID da moeda de Origem");
        moedaconverter = moedaScanner.nextLine();
        System.out.println("Digite o ID da moeda de destino");
        String moedaconvertida = moedaScanner.nextLine();
        System.out.println("Digite o valor a ser convertido");
        double valorConverter = moedaScanner.nextDouble();
        String endereco = "https://v6.exchangerate-api.com/v6/585514aed09870677463d442/latest/" + moedaconverter;
        System.out.println(endereco);
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            Gson gson = new Gson();
            Map<String, Object> jsonMap = gson.fromJson(json, Map.class);
            Map<String, Double> conversionRates = (Map<String, Double>) jsonMap.get("conversion_rates");
            double taxa = conversionRates.get(moedaconvertida);
            double valorConvertido = valorConverter * taxa;
            System.out.println("Valor convertido: " + valorConvertido + " " + moedaconvertida);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}