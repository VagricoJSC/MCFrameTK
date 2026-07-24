package mcframe.clientMAUB.MAUBP5360;

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
 * 画面"MAUBP_Addr_D"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_Addr_D_MC extends MAUBP_Addr_D_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MCColumnConfig _some_cd = null;
	protected MCColumnConfig _some_nm = null;
	protected MCColumnConfig _sundry_flg = null;
	
	protected boolean _set_relate_some_cd_flg = true;	//some_cd 住所に対応するＣＤ を連携
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_Addr_D_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MAUBP_Addr_D_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * 連携に必要な部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * 
	 * @param some_nm 住所に対応する名称
	 */
	public void setRelateBeans(MCColumnConfig some_nm) {
		_some_nm = some_nm;
		_set_relate_some_cd_flg = false;
	}
	
	/**
	 * 連携に必要な部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * 
	 * @param _some_cd 住所に対応するＣＤ
	 * @param _some_nm 住所に対応する名称
	 */
	public void setRelateBeans(MCColumnConfig some_cd, MCColumnConfig some_nm) {
		_some_cd = some_cd;
		_some_nm = some_nm;
	}

	/**
	 * 連携に必要な部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * 
	 * @param _some_cd 住所に対応するＣＤ
	 * @param _some_nm 住所に対応する名称
	 */
	public void setRelateBeans(MCColumnConfig some_cd, MCColumnConfig some_nm, MCColumnConfig sundry_flg) {
		_some_cd = some_cd;
		_some_nm = some_nm;
		_sundry_flg = sundry_flg;
	}
	
	@Override
	public MCMode getCellMode(int index, MCColumnConfig column) {
		if (isSame(getStatus(), ENABLE)) {
			if (!_set_relate_some_cd_flg){
				if (column == columnAddr_zip_cd
						|| column == columnAddr_addr1
						|| column == columnAddr_addr2
						|| column == columnAddr_addr3
						|| column == columnAddr_addr4
						|| column == columnAddr_cntry_cd
						|| column == columnAddr_tel
						|| column == columnAddr_fax
						|| column == columnAddr_cntct_dpt
						|| column == columnAddr_cntct_psn
						) {
					return MCMode.ENABLE;
				}
			}
			if (_sundry_flg == null || !(Boolean)getBeansValue(_sundry_flg, index)) {
				if (column == columnAddr_zip_cd
						|| column == columnAddr_addr1
						|| column == columnAddr_addr2
						|| column == columnAddr_addr3
						|| column == columnAddr_addr4
						|| column == columnAddr_cntry_cd
						|| column == columnAddr_tel
						|| column == columnAddr_fax
						|| column == columnAddr_cntct_dpt
						|| column == columnAddr_cntct_psn
						) {
					return MCMode.READ_ONLY;
				}
			}
		}
		return super.getCellMode(index, column);
	}

	/**
	 * Panel[Addr]のボタン[show_dtl]の押下時の処理
	 */
	@Override
	public void doAddr_show_dtl(MCEventInfo info) {
		AddrR r = getAddrL().get(info.getEventIndex());
		if (r == null) {
			return;
		}
		AddrR tmpR = r.clone();
		if (_some_cd != null){
			tmpR.setStringNE("some_cd", (String)getBeansValue(_some_cd, info.getEventIndex()));
		}
		if (_some_nm != null){
			tmpR.setStringNE("some_nm", (String)getBeansValue(_some_nm, info.getEventIndex()));
		}
		openChildPanel("MA", "MAUBP0430", T1, tmpR, _some_cd, _some_nm);
	}

}