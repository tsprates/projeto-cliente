package com.example.projetomonografia;

import android.telephony.TelephonyManager;

/**
 * Classe para gerenciamento de informações do telefone.
 * <p/>
 * Created by Thiago on 11/08/2014.
 */
public class TelefoneInfo {
    private TelephonyManager telephonyManager;

    /**
     * Construtor.
     *
     * @param telephonyManager
     */
    public TelefoneInfo(TelephonyManager telephonyManager) {
        this.telephonyManager = telephonyManager;
    }

    /**
     * Retorna o IMEI do aparelho.
     * O IMEI pode ser encontrado na caixa do aparelho, no espaço destinado à bateria ou digitando *#06# no celular.
     *
     * @link http://pt.wikipedia.org/wiki/International_Mobile_Equipment_Identity
     * @return IMEI
     */
    public String getId() {
        return telephonyManager.getDeviceId();
    }
}