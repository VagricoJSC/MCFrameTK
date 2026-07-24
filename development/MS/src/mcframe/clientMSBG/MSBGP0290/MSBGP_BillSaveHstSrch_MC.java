package mcframe.clientMSBG.MSBGP0290;

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

import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMSUB.MSUBP0010.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.Map;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBGP_BillSaveHstSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBGP_BillSaveHstSrch_MC extends MSBGP_BillSaveHstSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_BillSaveHstSrch_MC() {
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
	public MSBGP_BillSaveHstSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBGL0290_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0290_Srch01Caller<P extends MSBGP_BillSaveHstSrch, B extends MS_MSBGL0290_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBGL0290_Srch01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMS_MSBGL0290_Srch01();
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		setValueEx(Cnd_latest_flg, true);
	}
	
	@Override
	public void doCnd_latest_flg_NC(MCEventInfo info) {
		super.doCnd_latest_flg_NC(info);
		if (getCndR().latest_flg()) {
			setValueEx(Cnd_bill_rev, null);
			Cnd_bill_rev.setMode(MCMode.ENABLE);
		}
		else {
			setDefaultMode(Cnd_bill_rev);
		}
	}
	
	@Override
	public void doCnd_bill_rev_NC(MCEventInfo info) {
		super.doCnd_bill_rev_NC(info);
		if (!isNull(getCndR().bill_rev())) {
			setValueEx(Cnd_latest_flg, false);
		}
	}
	
	@Override
	public <R extends MCRow> void editListForOpenMBBCP0020(MCRootPanel panel,Map<String, String> args, MCList<R> list) {
		super.editListForOpenMBBCP0020(panel, args, list);
			R row = list.get(0);
			
			if(isNull(row)) {
				return;
			}
			
			if(MAC_BIZ_TYP.isPAY_NTC_RCPT(row.getString(mcframe.clientMBBC.MBBCP0020.RsltR.$biz_typ))) {
				return;
			}
			if(MAC_BIZ_TYP.isBILL(row.getString(mcframe.clientMBBC.MBBCP0020.RsltR.$biz_typ))) {
				String bizTyp = getHdrR().getBoolean(HdrR.$edi_flg) ? MAC_BIZ_TYP.BILL_EDI.value() : MAC_BIZ_TYP.BILL.value();
				row.setStringNE(mcframe.clientMBBC.MBBCP0020.RsltR.$biz_typ, bizTyp);
				return;
			}
	}

}