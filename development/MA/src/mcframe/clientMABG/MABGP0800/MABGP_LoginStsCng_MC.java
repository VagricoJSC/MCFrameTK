package mcframe.clientMABG.MABGP0800;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;

import mcframe.clientMAUB.MAUBP0230.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABGP_LoginStsCng"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABGP_LoginStsCng_MC extends MABGP_LoginStsCng_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABGP_LoginStsCng_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		if (confirmUpd()) {
			MCMessageList msgList = checkReq(getHdrR());
			if (!msgList.isEmpty()) {
				message(msgList);
			}
			else if (!isChanged(getHdrR())) {
				dialog(msgNoDataChange());
			}
			else {
				setTerm(this, getHdrR().term());
				setCostAmtDispDigit(getHdrR().amt_disp_digit());
				setCostUnitDispDigit(getHdrR().unit_disp_digit());
				setCostStdDispDigit(getHdrR().std_disp_digit());
				setCostRateDispDigit(getHdrR().rate_disp_digit());
				setExcelPlnFlg(getHdrR().excel_pln_flg());
				setExcelActFlg(getHdrR().excel_act_flg());
				setExcelAlcFlg(getHdrR().excel_alc_flg());
				dialog(msgUpdated());
				HdrPanel.focusFirstComponent();
			}
			getHdrR().setStatus(Status.NONE);
		}
	}
	/**
	 * Panel[Btn]のボタン[dflt]の押下時の処理
	 */
	@Override
	public void doBtn_dflt(MCEventInfo info) {
		setTerm(this, null);
		setCostAmtDispDigit(null);
		setCostUnitDispDigit(null);
		setCostStdDispDigit(null);
		setCostRateDispDigit(null);
		setExcelPlnFlg(null);
		setExcelActFlg(null);
		setExcelAlcFlg(null);
		//キャッシュ値をセット
		setCacheValue();

		dialog(MABGP0001);
		HdrPanel.focusFirstComponent();
	}
	/**
	 * データを更新してもよいかダイアログを出す。
	 * 
	 * @return データを更新してもよい場合 true それ以外 false
	 */
	public boolean confirmUpd() {
		return confirm(msgUpdateConfirm()) == MCMessageBox.YES_OPTION;
	}		

	// 画面起動時の初期設定
	@Override
	protected void valueInit() {

		super.valueInit();
		//キャッシュ値をセット
		setCacheValue();
		
	}
	
	protected void setCacheValue(){
		setValueEx(Hdr_term, getTerm(this));
		setValueEx(Hdr_amt_disp_digit, MCNumber.valueOf(getCostAmtDispDigit(this)));
		setValueEx(Hdr_unit_disp_digit, MCNumber.valueOf(getCostUnitDispDigit(this)));
		setValueEx(Hdr_std_disp_digit, MCNumber.valueOf(getCostStdDispDigit(this)));
		setValueEx(Hdr_rate_disp_digit, MCNumber.valueOf(getCostRateDispDigit(this)));
		getHdrR().excel_pln_flg(getExcelPlnFlg(this));
		getHdrR().excel_act_flg(getExcelActFlg(this));
		getHdrR().excel_alc_flg(getExcelAlcFlg(this));
	}

	/**
	 * 小数部有効桁数のチェック
	 */
	@Override
	public boolean doHdr_std_disp_digit_VC(MCEventInfo info) {
		MCNumber n = (MCNumber)info.getNewValue();
		if(!isDecPlace(n)){
			return false;
		}
		return super.doHdr_std_disp_digit_VC(info);
	}
	@Override
	public boolean doHdr_amt_disp_digit_VC(MCEventInfo info) {
		MCNumber n = (MCNumber)info.getNewValue();
		if(!isDecPlace(n)){
			return false;
		}
		return super.doHdr_amt_disp_digit_VC(info);
	}
	@Override
	public boolean doHdr_unit_disp_digit_VC(MCEventInfo info) {
		MCNumber n = (MCNumber)info.getNewValue();
		if(!isDecPlace(n)){
			return false;
		}
		return super.doHdr_unit_disp_digit_VC(info);
	}
	@Override
	public boolean doHdr_rate_disp_digit_VC(MCEventInfo info) {
		MCNumber n = (MCNumber)info.getNewValue();
		if(!isDecPlace(n)){
			return false;
		}
		return super.doHdr_rate_disp_digit_VC(info);
	}
	// 小数部有効桁数のチェック
	protected boolean isDecPlace(MCNumber n){
		return MCNumber.ZERO.lte(n) && new MCNumber(8).gte(n);
	}

}