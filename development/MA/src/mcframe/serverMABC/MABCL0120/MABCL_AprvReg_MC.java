package mcframe.serverMABC.MABCL0120;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMABC.MABCL0120.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.*;
import java.util.Arrays;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_AprvReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_AprvReg_MC extends MABCL_AprvReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Aprv_UpdChk01オペレーション.<p>
	 *
	 * 承認情報マスタの登録前のチェックを行います。<br>
	 */
	public class Aprv_UpdChk01 extends MABCL_AprvReg_MC_A.Aprv_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList =	super.doServerCheckSub();

			for (Aprv_UpdChk01_DtlR r : up0()) {
				if (r.del_flg()) {
					continue ;
				}

				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				// 条件付必須チェック
				// 品目分類区分が設定されている場合、品目分類ＣＤは必須
				if (!isNull(r.itm_grp_typ())) {
					msgList.addAll(check(r, Aprv_UpdChk01_DtlR.$itm_grp_cd, new FXUCL_RequiredValidater()));
				}
				// 取引先分類区分が設定されている場合、取引先分類ＣＤは必須
				if (!isNull(r.bp_grp_typ())) {
					msgList.addAll(check(r, Aprv_UpdChk01_DtlR.$bp_grp_cd, new FXUCL_RequiredValidater()));
				}
				// 結合条件区分１が設定されている場合、通貨ＣＤ２は必須
				if (!isNull(r.bind_cond1())) {
					msgList.addAll(check(r, Aprv_UpdChk01_DtlR.$cur_cd2, new FXUCL_RequiredValidater()));
				}
				// 結合条件区分２が設定されている場合、通貨ＣＤ３は必須
				if (!isNull(r.bind_cond2())) {
					msgList.addAll(check(r, Aprv_UpdChk01_DtlR.$cur_cd3, new FXUCL_RequiredValidater()));
				}

				// 条件付一つだけ入力チェック
				// 品目ＣＤ、品目分類区分 どちらかのみ入力可能
				// 条件：品目が承認対象として評価される承認機能区分が設定されている場合
				if (MAC_APRV_FUNC_TYP.is_using_itm(r.aprv_func_typ())) {
					msgList.addAll(
							check(r, new String[] { Aprv_UpdChk01_DtlR.$itm_cd, Aprv_UpdChk01_DtlR.$itm_grp_typ },
									new MAUDL_TooManyInputsValidater_NULL_VAL()));
				}
				// 取引先ＣＤ、取引先分類区分 どちらかのみ入力可能
				// 条件：取引先が承認対象として評価される承認機能区分が設定されている場合
				if (MAC_APRV_FUNC_TYP.is_using_bp(r.aprv_func_typ())) {
					msgList.addAll(
							check(r, new String[] { Aprv_UpdChk01_DtlR.$bp_cd, Aprv_UpdChk01_DtlR.$bp_grp_typ },
									new MAUDL_TooManyInputsValidater_NULL_VAL()));
				}

				// 条件付一つ以上入力チェック
				// 通貨ＣＤ１が設定されている場合、金額１下限値、上限値 どちらかは必須
				if (!isNull(r.cur_cd1())) {
					msgList.addAll(
							check(r, new String[] { Aprv_UpdChk01_DtlR.$val_min1, Aprv_UpdChk01_DtlR.$val_max1 },
									new MAUDL_AtLeastOneValidater_NULL_VAL()));
				}
				// 通貨ＣＤ２が設定されている場合、金額２下限値、上限値 どちらかは必須
				if (!isNull(r.cur_cd2())) {
					msgList.addAll(
							check(r, new String[] { Aprv_UpdChk01_DtlR.$val_min2, Aprv_UpdChk01_DtlR.$val_max2 },
									new MAUDL_AtLeastOneValidater_NULL_VAL()));
				}
				// 通貨ＣＤ３が設定されている場合、金額３下限値、上限値 どちらかは必須
				if (!isNull(r.cur_cd3())) {
					msgList.addAll(
							check(r, new String[] { Aprv_UpdChk01_DtlR.$val_min3, Aprv_UpdChk01_DtlR.$val_max3 },
									new MAUDL_AtLeastOneValidater_NULL_VAL()));
				}

				// 個別チェック
				if (!(MAC_APRV_FUNC_TYP.is_using_itm(r.aprv_func_typ()))) {
					if (!isNull(r.itm_cd())) {
						msgList.add(new MCMessage(r, null, MABCL0086, toDispGUIIndex(r)));
					}
					if (!isNull(r.itm_grp_typ())) {
						msgList.add(new MCMessage(r, null, MABCL0087, toDispGUIIndex(r)));
					}
				}
				if (!(MAC_APRV_FUNC_TYP.is_using_dpt(r.aprv_func_typ())) && !isNull(r.dpt_cd())) {
					msgList.add(new MCMessage(r, null, MABCL0088, toDispGUIIndex(r)));
				}
				if (!(MAC_APRV_FUNC_TYP.is_using_bp(r.aprv_func_typ()))) {
					if (!isNull(r.bp_cd())) {
						msgList.add(new MCMessage(r, null, MABCL0089, toDispGUIIndex(r)));
					}
					if (!isNull(r.bp_grp_typ())) {
						msgList.add(new MCMessage(r, null, MABCL0090, toDispGUIIndex(r)));
					}
				}
				if (!(MAC_APRV_FUNC_TYP.is_using_amt1(r.aprv_func_typ()))) {
					if (!isNull(r.cur_cd1())) {
						msgList.add(new MCMessage(r, null, MABCL0091, toDispGUIIndex(r)));
					}	
				}
				if (!MAC_APRV_FUNC_TYP.is_using_amt2(r.aprv_func_typ()) || isNull(r.cur_cd1())) {
					if (!isNull(r.bind_cond1())) {
						msgList.add(new MCMessage(r, null, MABCL0092, toDispGUIIndex(r)));
					}
				}
				if (!MAC_APRV_FUNC_TYP.is_using_amt3(r.aprv_func_typ()) || isNull(r.cur_cd1()) || isNull(r.cur_cd2())) {
					if (!isNull(r.bind_cond2())) {
						msgList.add(new MCMessage(r, null, MABCL0093, toDispGUIIndex(r)));
					}
				}
				if (isNull(r.cur_cd1()) && !isNullAnd(r.val_min1(), r.val_max1())) {
					msgList.add(new MCMessage(r, null, MABCL0094, toDispGUIIndex(r)));
				}
				if (isNull(r.cur_cd2()) && !isNullAnd(r.val_min2(), r.val_max2())) {
					msgList.add(new MCMessage(r, null, MABCL0095, toDispGUIIndex(r)));
				}
				if (isNull(r.cur_cd3()) && !isNullAnd(r.val_min3(), r.val_max3())) {
					msgList.add(new MCMessage(r, null, MABCL0096, toDispGUIIndex(r)));
				}
			}
			return msgList;
		}
	}
	/**
	 * Aprv_Upd01オペレーション.<p>
	 *
	 * 承認情報マスタの登録を行います。<br>
	 */
	public class Aprv_Upd01 extends MABCL_AprvReg_MC_A.Aprv_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Aprv_DelChk01オペレーション.<p>
	 *
	 * 承認情報マスタの削除前のチェックを行います。<br>
	 */
	public class Aprv_DelChk01 extends MABCL_AprvReg_MC_A.Aprv_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Aprv_Del01オペレーション.<p>
	 *
	 * 承認情報マスタの削除を行います。<br>
	 */
	public class Aprv_Del01 extends MABCL_AprvReg_MC_A.Aprv_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 承認情報マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_AprvReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}		
	}
		
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 承認情報マスタの検索を行います。<br>
	 */
	public class Sprt01 extends MABCL_AprvReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 承認情報マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABCL_AprvReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 承認情報マスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_AprvReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}