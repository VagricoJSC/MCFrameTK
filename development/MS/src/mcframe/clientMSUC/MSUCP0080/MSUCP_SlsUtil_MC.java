package mcframe.clientMSUC.MSUCP0080;

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

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSUCP_SlsUtil"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSUCP_SlsUtil_MC extends MSUCP_SlsUtil_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/**
	 * static メソッドでのアクセス用フィールド
	 */
	protected static MSUCP_SlsUtil _util = new MSUCP_SlsUtil();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUCP_SlsUtil_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START
	/**
	 * 売上消費税ＣＤを取得する。
	 * <p>
	 * 引数のいずれかが null または空文字の場合は null を返す。
	 * 
	 * @param itm_cd 品目ＣＤ
	 * @param itm_sub1 枝番１
	 * @param itm_sub2 枝番２
	 * @param itm_sub3 枝番３
	 * @param cst_cd 得意先ＣＤ
	 * @param base_dt 基準日
	 * @param panel 画面
	 * @return 売上消費税ＣＤ、またはnull
	 */
	public static String getSlsTaxCd(String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3, String cst_cd, MCDate base_dt, MCRootPanel panel) {
		if (isNullOr(itm_cd, itm_sub1, itm_sub2, itm_sub3, cst_cd, base_dt)) {
			return null;
		}
		return MSUCP_SlsListLogic.getSlsTaxCd(itm_cd, itm_sub1, itm_sub2, itm_sub3, cst_cd, base_dt, panel).getString("tax_cd");
	}

	/**
	 * 基準通貨金額と原価金額から粗利率を取得する
	 * 
	 * @param baseCurAmt 基準通貨金額（値引後、税抜）
	 * @param costUpri 原価金額（原価単価 * 基準単位数量）
	 * 
	 * @return 粗利率
	 */
	public static MCNumber getProfRate(MCNumber baseCurAmt, MCNumber costAmt) {
		return _util._getProfRate(baseCurAmt, costAmt);
	}
	
	/**
	 * 基準通貨金額と原価金額から粗利率を取得する
	 * 
	 * @param baseCurAmt 基準通貨金額（値引後、税抜）
	 * @param costUpri 原価金額（原価単価 * 基準単位数量）
	 * 
	 * @return 粗利率
	 */
	protected MCNumber _getProfRate(MCNumber baseCurAmt, MCNumber costAmt) {
		
		if (isNullOr(baseCurAmt, costAmt)) {
			return null;
		}
		if (baseCurAmt.isZero()) {
			return null;
		}
		
		// (baseCurAmt - costAmt) * 100 / baseCurAmt
		return (baseCurAmt.subtract(costAmt)).multiply(100).divide(baseCurAmt, mcframe.commonMA.meta.MA_META.PER.scale(), MAC_RND_TYP.RNDUP.toMC());
	}

	/**
	 * 原価単価と基準単位数量から原価金額を取得する
	 * 
	 * @param costUpri 原価単価
	 * @param baseUnitQty 基準単位数量
	 * @param baseCurAmtDecPlace 基準通貨金額小数部有効桁数
	 * 
	 * @return 原価金額
	 */
	public static MCNumber getCostAmt(MCNumber costUpri, MCNumber baseUnitQty, MCNumber baseCurAmtDecPlace) {
		return _util._getCostAmt(costUpri, baseUnitQty, baseCurAmtDecPlace);
	}
	
	/**
	 * 原価単価と基準単位数量から原価金額を取得する
	 * 
	 * @param costUpri 原価単価
	 * @param baseUnitQty 基準単位数量
	 * @param baseCurAmtDecPlace 基準通貨金額小数部有効桁数
	 * 
	 * @return 原価金額
	 */
	protected MCNumber _getCostAmt(MCNumber costUpri, MCNumber baseUnitQty, MCNumber baseCurAmtDecPlace) {
		
		if (isNullOr(costUpri, baseUnitQty, baseCurAmtDecPlace)) {
			return null;
		}
		return costUpri.multiply(baseUnitQty, baseCurAmtDecPlace.intValue(), MAC_RND_TYP.RNDOFF.toMC());
	}
	
	/**
	 * 売上部門CDを元に仕入直送中継場所のワーキンググループを取得する。
	 * <p>
	 * 引数のいずれかが null または空文字の場合は null を返す。
	 * 
	 * @param dptCd 売上部門
	 * @param baseDt 基準日
	 * @param panel 画面
	 * @return 仕入直送中継場所のワーキンググループＣＤ、またはnull
	 */
	public static String getMidLocWgCd(String dptCd, MCDate baseDt, MCRootPanel panel) {
		
		if (isNullOr(dptCd, baseDt)) {
			return null;
		}
		
		return MSUCP_SlsListLogic.getMidLocWgCd(dptCd, baseDt, panel).getString("wg_cd");
	}

}