package mcframe.clientMSUC.MSUCP0030;

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
 * 画面"MSUCP_ProdUtil"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSUCP_ProdUtil_MC extends MSUCP_ProdUtil_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	/**
	 * static メソッドのアクセス用フィールド
	 */
	protected static MSUCP_ProdUtil _util = new MSUCP_ProdUtil();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUCP_ProdUtil_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START
	/**
	 * 基準単位指図数量を基準単位出来高数量へ変換します。
	 * @param mst_mfg_inst_qty 製造指図数量（マスタ）
	 * @param mst_yield_schd_qty 出来高予定数量（マスタ）
	 * @param base_unit_inst_qty 基準単位指図数量
	 * @param base_unit_dec_place 基準単位有効桁数
	 * @param mst_fxd_rqmt_qty 固定必要数量（マスタ）
	 * @return 基準単位出来高数量
	 */
	public static MCNumber convQtyInstToYield(MCNumber mst_mfg_inst_qty,
			MCNumber mst_yield_schd_qty, MCNumber base_unit_inst_qty,
			MCNumber base_unit_dec_place, MCNumber mst_fxd_rqmt_qty) {
		return _util._convQtyInstToYield(mst_mfg_inst_qty, mst_yield_schd_qty,
				base_unit_inst_qty, base_unit_dec_place, mst_fxd_rqmt_qty);
	}

	protected MCNumber _convQtyInstToYield(MCNumber mst_mfg_inst_qty,
			MCNumber mst_yield_schd_qty, MCNumber base_unit_inst_qty,
			MCNumber base_unit_dec_place, MCNumber mst_fxd_rqmt_qty) {

		if (isNull(base_unit_inst_qty)) {
			return MCNumber.ZERO;
		}

		MCNumber yieldQty;

		if (isNullOr(mst_mfg_inst_qty, mst_yield_schd_qty) || mst_mfg_inst_qty.isZero()) {
			// 製造指図数量（マスタ）または出来高予定数量（マスタ）のいずれかひとつがＮＵＬＬ
			// もしくは製造指図数量（マスタ）が０の場合、出来高予定数量には基準単位指図数量を設定する
			yieldQty = base_unit_inst_qty;
		}
		else {
			// 上記以外は製造指図数量を出来高予定数量へ変換する
			yieldQty = base_unit_inst_qty.multiply(mst_yield_schd_qty).divide(
					mst_mfg_inst_qty, base_unit_dec_place.intValue(),
					MAC_RND_TYP.toMC(MAC_RND_TYP.CUTOFF.value()));
		}
		// 固定必要数量（マスタ）が存在する場合、出来高予定数量から固定必要数量（マスタ）を減算したものを戻り値とする（マイナス値となる場合はゼロ）
		MCNumber fixQty = nvl(mst_fxd_rqmt_qty, MCNumber.ZERO);
		yieldQty = yieldQty.subtract(fixQty);
		if (yieldQty.isNegative()) {
			return MCNumber.ZERO;
		}
		return yieldQty;
	}

	/**
	 * 基準単位出来高数量を基準単位指図数量へ変換します。
	 * @param mst_mfg_inst_qty 製造指図数量（マスタ）
	 * @param mst_yield_schd_qty 出来高予定数量（マスタ）
	 * @param base_unit_yield_qty 基準単位出来高数量
	 * @param base_unit_dec_place 基準単位有効桁数
	 * @param mst_fxd_rqmt_qty 固定必要数量（マスタ）
	 * @return 基準単位指図数量
	 */
	public static MCNumber convQtyYieldToInst(MCNumber mst_mfg_inst_qty,
			MCNumber mst_yield_schd_qty, MCNumber base_unit_yield_qty,
			MCNumber base_unit_dec_place, MCNumber mst_fxd_rqmt_qty) {
		return _util._convQtyYieldToInst(mst_mfg_inst_qty, mst_yield_schd_qty,
				base_unit_yield_qty, base_unit_dec_place, mst_fxd_rqmt_qty);
	}

	protected MCNumber _convQtyYieldToInst(MCNumber mst_mfg_inst_qty,
			MCNumber mst_yield_schd_qty, MCNumber base_unit_yield_qty,
			MCNumber base_unit_dec_place, MCNumber mst_fxd_rqmt_qty) {

		if (isNull(base_unit_yield_qty)) {
			return MCNumber.ZERO;
		}

		MCNumber instQty;

		if (isNullOr(mst_mfg_inst_qty, mst_yield_schd_qty) || mst_yield_schd_qty.isZero()) {
			// 製造指図数量（マスタ）または出来高予定数量（マスタ）のいずれかひとつがＮＵＬＬ
			// もしくは出来高予定数量（マスタ）が０の場合、指図数量には基準単位出来高数量を設定する
			instQty = base_unit_yield_qty;
		}
		else {
			// 上記以外は出来高予定数量を製造指図数量へ変換する
			instQty = base_unit_yield_qty.multiply(mst_mfg_inst_qty).divide(
					mst_yield_schd_qty, base_unit_dec_place.intValue(),
					MAC_RND_TYP.toMC(MAC_RND_TYP.RNDUP.value()));
		}
		// 固定必要数量（マスタ）が存在する場合、固定必要数量（マスタ）を加算したものを戻り値とする
		MCNumber fixQty = nvl(mst_fxd_rqmt_qty, MCNumber.ZERO);
		return instQty.add(fixQty);
	}

	/**
	 * 基準単位数量を工程単位数量へ変換します。
	 * <br>
	 * 変換が可能な場合、工程単位数量へ変換された値が返されます。
	 * 変換が不可能な場合、nullが返されます。
	 * その場合、呼出元で工程単位数量、工程単位ＣＤ、工程単位名、工程単位小数部有効桁数には基準単位の値を設定し
	 * 工程基準単位数量、工程換算単位数量には固定値として1を設定する必要があります。
	 * @param base_unit_qty 基準単位数量
	 * @param oper_conv_qty 工程換算単位数量
	 * @param oper_std_qty 工程基準単位数量
	 * @param oper_unit_dec_place 工程単位小数部有効桁数
	 * @param oper_unit_conv_rnd_typ 工程単位端数処理区分
	 * @return 工程単位数量
	 */
	public static MCNumber convQtyBaseToOper(MCNumber base_unit_qty,
			MCNumber oper_conv_qty, MCNumber oper_std_qty, MCNumber oper_unit_dec_place,
			String oper_unit_conv_rnd_typ) {
		return _util._convQtyBaseToOper(base_unit_qty, oper_conv_qty, oper_std_qty,
				oper_unit_dec_place, oper_unit_conv_rnd_typ);
	}

	protected MCNumber _convQtyBaseToOper(MCNumber base_unit_qty, MCNumber oper_conv_qty,
			MCNumber oper_std_qty, MCNumber oper_unit_dec_place,
			String oper_unit_conv_rnd_typ) {

		if (isNullOr(oper_std_qty, oper_conv_qty, oper_unit_dec_place,
				oper_unit_conv_rnd_typ, base_unit_qty) || oper_std_qty.isZero()) {
			// 工程基準単位数量、工程換算単位数量、工程単位小数部有効桁数、工程換算端数処理区分のいずれかひとつがＮＵＬＬ
			// もしくは工程基準単位数量が０の場合、nullを返す
			return null;
		}
		else {
			// 上記以外は基準単位数量を工程単位数量へ変換する
			return base_unit_qty.multiply(oper_conv_qty).divide(oper_std_qty,
					oper_unit_dec_place.intValue(),
					MAC_RND_TYP.toMC(oper_unit_conv_rnd_typ));
		}
	}

}