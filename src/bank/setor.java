/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import javax.swing.JOptionPane;

/**
 *
 * @author rongrong
 */
class setor {
    private int saldo;
    public void menabung (int bal, int s){
        if(s%100!=0)
            JOptionPane.showMessageDialog(null,"Mesin ATM BRI tidak menerima uang koin\n"
                    + "Silakan ulangi kembali","Transaksi Gagal",0);
        else if(s<50000)
            JOptionPane.showMessageDialog(null, "Besar minimal setor tunai adalah Rp 50000","Error",0);
        else if(s>=50000){
            saldo=bal+s;
            JOptionPane.showMessageDialog(null, "Saldo Anda saat ini sebesar : "+saldo);
        }
    }
    public int getsaldo(){
        return saldo;
    }

    
}
