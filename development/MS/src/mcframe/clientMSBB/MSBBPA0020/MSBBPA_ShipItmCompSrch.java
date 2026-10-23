// FMSE PANEL_EI
package mcframe.clientMSBB.MSBBPA0020;

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
import mcframe.clientMSBB.MSBBP1210.MSBBP_SloReg;
//FMCB IMPORT END

/**
 * 画面"MSBBPA_ShipItmCompSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBBPA_ShipItmCompSrch extends MSBBPA_ShipItmCompSrch_MC {

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBPA_ShipItmCompSrch() {
		super();
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBBPA_ShipItmCompSrch(String name) {
		super(name);
	}

	public class MS_MSBBLA0020_Srch01Bridge extends MSBBPA_ShipItmCompSrch_MC.MS_MSBBLA0020_Srch01Bridge {
	}

//FMCB CUSTOM START
	protected MSBBP_SloReg sloRegPanel = null;
	
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
	}

	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
	}

	/**
	 * Panel[Btn]のボタン[rgst]の押下時の処理
	 */
	@Override
	public void doBtn_rgst(MCEventInfo info) {
		MSBBP_SloReg sloRegPanel = getTargetPanel();
		if (sloRegPanel == null) {
			return;
		}
		
		// 受注登録の明細一覧を更新
		MCTable<?> sloDtlTable = sloRegPanel.getDtlTable();
		updateSloDtlTable(sloDtlTable);
		
		// 画面をクローズ
		statusClear();
		requestCloseWindow();
	}
	

	/**
	 * [MS_MSBBLA0020_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBLA0020_Srch01Caller<P extends MSBBPA_ShipItmCompSrch, B extends MS_MSBBLA0020_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBLA0020_Srch01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBBLA0020_Srch01();
	}
	
	/**
	 * 表示元画面を取得する。
	 *
	 * @return 表示元画面
	 */
	protected MSBBP_SloReg getTargetPanel() {
		if (sloRegPanel == null) {
			// 呼び出し元画面の取得
			MCRootPanel p = null;
			try {
				p = getParentPanel();
			}
			catch (Exception pe) {
				throw new MCAppException(pe, MSBEP0017, getModuleID(), getScreenID());
			}

			// 取得チェック
			if (p == null) {
				throw new MCAppException(MSBEP0017, getModuleID(), getScreenID());
			}
			else if (!(p instanceof MSBBP_SloReg)) {
				throw new MCAppException(MSBEP0018, getModuleID(), getScreenID(), p.getClass().getName());
			}
			else {
				sloRegPanel = (MSBBP_SloReg) p;
			}
		}

		return sloRegPanel;
	}
	
	protected void updateSloDtlTable(MCTable<?> sloDtlTable) {
		// 品目
		MCList<RsltR> list = MCList.create(RsltR.class);
		RsltTable.getList().forEach(i -> {
			if (i.check()) {
				list.add(i);
			}
		});
		
		if (list.isEmpty()) {
			return;
		}
		
		MSBBP_SloReg sloRegPanel = getTargetPanel();
		
		// 現在のデータをクリア
		sloDtlTable.clear();
		
		// 製品の1行を追加
		if (sloDtlTable.getRow(0) == null) {
			insertRow(sloDtlTable);
		}
		RsltR firstRow = list.get(0);
		Comparable<?> parentItmObj = firstRow.getValueNE("par_itm_p");
		if (parentItmObj instanceof mcframe.clientMAUB.MAUBP5030.ItmR) {
			mcframe.clientMAUB.MAUBP5030.ItmR itmR = (mcframe.clientMAUB.MAUBP5030.ItmR)parentItmObj;
			String itmCd = itmR.itm_cd();
			sloRegPanel.setValueEx(sloRegPanel.columnDtl_itm_cd, 0, itmCd);
			sloRegPanel.setValueEx(sloRegPanel.columnDtl_trd_unit_qty, 0, MCNumber.ONE);
		}

		// 構成品目（子品目）の行を追加
		for (int i = 0; i < list.size(); i ++) {
			if (sloDtlTable.getRow(i + 1) == null) {
				insertRow(sloDtlTable);
			}
			
			RsltR row = list.get(i);
			Comparable<?> obj = row.getValueNE("chd_itm_p");
			if (obj instanceof mcframe.clientMAUB.MAUBP5030.ItmR) {
				mcframe.clientMAUB.MAUBP5030.ItmR itmR = (mcframe.clientMAUB.MAUBP5030.ItmR)obj;
				String itmCd = itmR.itm_cd();
				sloRegPanel.setValueEx(sloRegPanel.columnDtl_itm_cd, i + 1, itmCd);
			}
			
		}
		
		sloDtlTable.selectLeftmostColumn(0);
		sloDtlTable.fillSpace();
	}
//FMCB CUSTOM END
}