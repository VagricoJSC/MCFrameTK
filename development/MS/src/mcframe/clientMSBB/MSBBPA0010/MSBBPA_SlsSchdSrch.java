// FMSE PANEL_EI
package mcframe.clientMSBB.MSBBPA0010;

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
import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.commonCore.annotation.EI;
import mcframe.clientFXBA.FXBAP0130.*;
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP5030.*;

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

//FMCB IMPORT START

//FMCB IMPORT END

/**
 * 画面"MSBBPA_SlsSchdSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBBPA_SlsSchdSrch extends MSBBPA_SlsSchdSrch_MC {

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBPA_SlsSchdSrch() {
		super();
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBBPA_SlsSchdSrch(String name) {
		super(name);
	}

	public class MS_MSBBLA0010_Srch01Bridge extends MSBBPA_SlsSchdSrch_MC.MS_MSBBLA0010_Srch01Bridge {
	}

//FMCB CUSTOM START
	/**
	 * [MS_MSBBLA0010_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBLA0010_Srch01Caller<P extends MSBBPA_SlsSchdSrch, B extends MS_MSBBLA0010_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBLA0010_Srch01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBBLA0010_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBBLA0010_Srch01().execDL();
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setOpenBtnMode();
	}

	protected void setOpenBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (isNull(r)) {
			Btn_open_MSBBP1210.setMode(MCMode.DISABLE);
		}
		else {
			Btn_open_MSBBP1210.setMode(MCMode.ENABLE);
		}
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBBP1210]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1210(MCEventInfo info) {
		MCRow bind = MCRow.create();
		MCList<MCRow> list = MCList.create(MCRow.class);
		setMSBBP1210Hdr(bind);
		setMSBBP1210Dtl(list);
		openPanel("MS", "MSBBP1210", T1, bind, list);	
	}
	
	/**
	 * 遷移先(受注登録画面)のヘッダ項目の設定
	 */
	protected void setMSBBP1210Hdr(MCRow bind) {
		int index = RsltTable.getMCSelectedRow();
		 if (index > -1) {
			 RsltR r = getRsltL().get(index);
			 bind.addStringColumn("cst_cd", r.cst_cd());
			 bind.addStringColumn("sls_dpt_cd", r.sls_dpt_cd());
			 bind.addStringColumn("trd_cur_cd", r.cur_cd());
			 bind.addStringColumn("wrk_no", r.wrk_no());
		 }
	}
	
	/**
	 * 遷移先(受注登録画面)の明細項目設定
	 */
	protected void setMSBBP1210Dtl(MCList<MCRow> list) {
		MCList<RsltR> rsltL = getRsltL();
		String prod_itm_cd[] = {null};
		
		int index = RsltTable.getMCSelectedRow();
		if (index > -1) {
			RsltR r = rsltL.get(index);
			
			MCRow row = MCRow.create();
			prod_itm_cd[0] = r.par_itm_cd();
			row.addStringColumn("itm_cd", prod_itm_cd[0]);
			row.addStringColumn("itm_sub1", r.par_itm_sub1());
			row.addStringColumn("itm_sub2", r.par_itm_sub2());
			row.addStringColumn("itm_sub3", r.par_itm_sub3());
			row.addStringColumn("trd_unit_cd", "PC");
			row.addNumberColumn("trd_unit_qty", r.prd_qty());
//			row.addStringColumn("cst_itm_cd", r.cst_itm_cd());
//			row.addStringColumn("cst_itm_nm", r.cst_itm_nm());
//			row.addNumberColumn("base_unit_qty", r.prd_qty());
			
			list.add(row);
		}

		
		rsltL.forEach(r -> {
			if (r.par_itm_cd().equals(prod_itm_cd[0])) {
				MCRow row = MCRow.create();
				row.addStringColumn("itm_cd", r.chd_itm_cd());
				row.addStringColumn("itm_sub1", r.chd_itm_sub1());
				row.addStringColumn("itm_sub2", r.chd_itm_sub2());
				row.addStringColumn("itm_sub3", r.chd_itm_sub3());
				row.addStringColumn("trd_unit_cd", "PC");
				row.addNumberColumn("trd_unit_qty", r.qty());
				
				list.add(row);
			}
		});
	}
//FMCB CUSTOM END
}