package mcframe.clientMAUB.MAUBP0430;

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
 * 画面"MAUBP_AddrPnl"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_AddrPnl_MC extends MAUBP_AddrPnl_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_AddrPnl_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MAUBP_AddrPnl_MC(mcframe.clientMAUB.MAUBP0430.AddrR row) {
		super(row);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_ROW_Addr START

		//FMCB CUSTOM_CONSTRUCTOR_ROW_Addr END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Addr]のボタン[close]の押下時の処理
	 */
	@Override
	public void doAddr_close(MCEventInfo info) {
		requestCloseWindow();
	}
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		if (args[0] != null){
			Addr_some_cd_Label.setText(((MCBeans)args[0]).getLabelByLocale());
			Addr_some_cd.setMessageName(((MCBeans)args[0]).getMessageByLocale());
			Addr_some_cd.setLength(bind.getMeta(AddrR.$some_cd).length());
			Addr_some_nm.setMessageName(((MCBeans)args[1]).getMessageByLocale());
			Addr_some_nm.setLength(bind.getMeta(AddrR.$some_nm).length());
		}
		else{
			//some_cd がnull のため some_nm のラベル名をセット
			Addr_some_cd_Label.setText(((MCBeans)args[1]).getLabelByLocale());
			Addr_some_nm.setMessageName(((MCBeans)args[1]).getMessageByLocale());
			Addr_some_nm.setLength(bind.getMeta(AddrR.$some_nm).length());
			//some_nm をリサイズ
			Addr_some_nm.setSize( Addr_some_nm.getSize().width + Addr_some_cd.getSize().width, Addr_some_nm.getSize().height);
			Addr_some_nm.setLocation(Addr_some_cd.getLocation());
			//some_cd を非表示
			setComponentInvisibleAllStatus(Addr_some_cd);
			Addr_some_cd.setSize(0, 0);
			Addr_some_cd.setLocation(0, 0);
		}
		
		getAddrR().some_cd(bind.getStringNE(AddrR.$some_cd));
		getAddrR().some_nm(bind.getStringNE(AddrR.$some_nm));
		getAddrR().cntry_cd(bind.getString(AddrR.$cntry_cd));
		getAddrR().cntry_nm(bind.getString(AddrR.$cntry_nm));
		getAddrR().zip_cd(bind.getString(AddrR.$zip_cd));
		getAddrR().addr1(bind.getString(AddrR.$addr1));
		getAddrR().addr2(bind.getString(AddrR.$addr2));
		getAddrR().addr3(bind.getString(AddrR.$addr3));
		getAddrR().addr4(bind.getString(AddrR.$addr4));
		getAddrR().tel(bind.getString(AddrR.$tel));
		getAddrR().fax(bind.getString(AddrR.$fax));
		getAddrR().cntct_dpt(bind.getString(AddrR.$cntct_dpt));
		getAddrR().cntct_psn(bind.getString(AddrR.$cntct_psn));
		
		relayout();
	}

}