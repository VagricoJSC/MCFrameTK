package mcframe.serverMABC.MABCL1220;

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
import mcframe.serverMABC.MABCL1220.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.*;
import java.util.ArrayList;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_JnlKeyMapReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_JnlKeyMapReg_MC extends MABCL_JnlKeyMapReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * JnlKeyMap_UpdChk01オペレーション.<p>
	 *
	 * 仕訳キー対応マスタを登録する前のチェックを行う<br>
	 */
	public class JnlKeyMap_UpdChk01 extends MABCL_JnlKeyMapReg_MC_A.JnlKeyMap_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected IfValidater getConstExistValidater(String col, MCAppConst[] constArr) {
			// 会計伝票区分
			if (isSame(col, JnlKeyMap_UpdChk01_DtlR.$ac_slip_typ)) {
				ArrayList<MAC_AC_SLIP_TYP> list = new ArrayList<MAC_AC_SLIP_TYP>();
				for (MAC_AC_SLIP_TYP typ : MAC_AC_SLIP_TYP.array()) {
					if (typ.is_tran_typ() || typ.is_stk_typ() || typ.is_credit_typ()
							|| typ.is_pay_typ()
							|| typ.is_cost_typ()) {
						list.add(typ);
					}
				}
				return new FXUCL_ConstValidater(list.toArray(new MCAppConst[0]));
			}
			// 仕訳キー設定項目区分
			else if (isSame(col, JnlKeyMap_UpdChk01_DtlR.$jnl_key_set_col_typ)) {
				ArrayList<MAC_JNL_KEY_SET_COL_TYP> list = new ArrayList<MAC_JNL_KEY_SET_COL_TYP>();
				for (MAC_JNL_KEY_SET_COL_TYP typ : MAC_JNL_KEY_SET_COL_TYP.array()) {
					if (typ.is_cost() || typ.is_io() || typ.is_stk()
							|| typ.is_pay()
							|| typ.is_rcv()) {
						list.add(typ);
					}
				}
				return new FXUCL_ConstValidater(list.toArray(new MCAppConst[0]));
			}
			// 取引先仕訳キー設定項目区分
			else if (isSame(col, JnlKeyMap_UpdChk01_DtlR.$bp_jnl_key_set_col_typ)) {
				ArrayList<MAC_JNL_KEY_SET_COL_TYP> list = new ArrayList<MAC_JNL_KEY_SET_COL_TYP>();
				for (MAC_JNL_KEY_SET_COL_TYP typ : MAC_JNL_KEY_SET_COL_TYP.array()) {
					if (typ.is_bp()) {
						list.add(typ);
					}
				}
				return new FXUCL_ConstValidater(list.toArray(new MCAppConst[0]));
			}
			return super.getConstExistValidater(col, constArr);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList =	super.doServerCheckSub();

			for (JnlKeyMap_UpdChk01_DtlR r : up0()) {
				if (r.del_flg()) {
					continue ;
				}

				// 条件付必須チェック
				if (MAC_JNL_KEY_SET_COL_TYP.is_bp_grp(r.jnl_key_set_col_typ())){
					msgList.addAll(check(r, JnlKeyMap_UpdChk01_DtlR.$bp_jnl_key_set_col_typ, new FXUCL_RequiredValidater()));
				}
				else {
					if (!isNull(r.bp_jnl_key_set_col_typ())) {
						msgList.add(new MCMessage(r, JnlKeyMap_UpdChk01_DtlR.$bp_jnl_key_set_col_typ, MABCL0508, toDispGUIIndex(r)));
					}
				}

				// 個別チェック
				if (MAC_AC_SLIP_TYP.is_cost_typ(r.ac_slip_typ())
						&& !MAC_AC_SLIP_TYP.is_pay_typ(r.ac_slip_typ())
						&& !MAC_AC_SLIP_TYP.is_tran_typ(r.ac_slip_typ())
						&& !MAC_AC_SLIP_TYP.is_stk_typ(r.ac_slip_typ())
						&& !MAC_AC_SLIP_TYP.is_credit_typ(r.ac_slip_typ())
						&& !r.cost_flg()) {
					msgList.add(new MCMessage(r, JnlKeyMap_UpdChk01_DtlR.$cost_flg, MABCL0509, toDispGUIIndex(r)));
				}
				if (!MAC_AC_SLIP_TYP.is_cost_typ(r.ac_slip_typ())
						&& r.cost_flg()) {
					msgList.add(new MCMessage(r, JnlKeyMap_UpdChk01_DtlR.$cost_flg, MABCL0510, toDispGUIIndex(r)));
				}
				if (r.cost_flg()) {
					if (!MAC_JNL_KEY_SET_COL_TYP.is_cost(r.jnl_key_set_col_typ())) {
						msgList.add(new MCMessage(r,
								JnlKeyMap_UpdChk01_DtlR.$jnl_key_set_col_typ, MABCL0511,
								toDispGUIIndex(r)));
					}
					else {
						if (MAC_JNL_KEY_SET_COL_TYP.is_bp_grp(r.jnl_key_set_col_typ())
								&& !MAC_JNL_KEY_SET_COL_TYP
										.is_cost(r.bp_jnl_key_set_col_typ())) {
							msgList.add(new MCMessage(r,
									JnlKeyMap_UpdChk01_DtlR.$bp_jnl_key_set_col_typ,
									MABCL0511, toDispGUIIndex(r)));
						}
					}
				}
				else {
					if (MAC_AC_SLIP_TYP.is_tran_typ(r.ac_slip_typ())) {
						if (!MAC_JNL_KEY_SET_COL_TYP.is_io(r.jnl_key_set_col_typ())) {
							msgList.add(new MCMessage(r, JnlKeyMap_UpdChk01_DtlR.$jnl_key_set_col_typ, MABCL0512, toDispGUIIndex(r)));
						}
						else {
							if (MAC_JNL_KEY_SET_COL_TYP.is_bp_grp(r.jnl_key_set_col_typ())
									&& !MAC_JNL_KEY_SET_COL_TYP
											.is_io(r.bp_jnl_key_set_col_typ())) {
								msgList.add(new MCMessage(r,
										JnlKeyMap_UpdChk01_DtlR.$bp_jnl_key_set_col_typ,
										MABCL0512, toDispGUIIndex(r)));
							}
						}
					}
					else if (MAC_AC_SLIP_TYP.is_stk_typ(r.ac_slip_typ())) {
						if (!MAC_JNL_KEY_SET_COL_TYP.is_stk(r.jnl_key_set_col_typ())) {
							msgList.add(new MCMessage(r, JnlKeyMap_UpdChk01_DtlR.$jnl_key_set_col_typ, MABCL0513, toDispGUIIndex(r)));
						}
						else {
							if (MAC_JNL_KEY_SET_COL_TYP.is_bp_grp(r.jnl_key_set_col_typ())
									&& !MAC_JNL_KEY_SET_COL_TYP
											.is_stk(r.bp_jnl_key_set_col_typ())) {
								msgList.add(new MCMessage(r,
										JnlKeyMap_UpdChk01_DtlR.$bp_jnl_key_set_col_typ,
										MABCL0513, toDispGUIIndex(r)));
							}
						}
					}
					else if (MAC_AC_SLIP_TYP.is_credit_typ(r.ac_slip_typ())) {
						if (!MAC_JNL_KEY_SET_COL_TYP.is_rcv(r.jnl_key_set_col_typ())) {
							msgList.add(new MCMessage(r, JnlKeyMap_UpdChk01_DtlR.$jnl_key_set_col_typ, MABCL0514, toDispGUIIndex(r)));
						}
						else {
							if (MAC_JNL_KEY_SET_COL_TYP.is_bp_grp(r.jnl_key_set_col_typ())
									&& !MAC_JNL_KEY_SET_COL_TYP
											.is_rcv(r.bp_jnl_key_set_col_typ())) {
								msgList.add(new MCMessage(r,
										JnlKeyMap_UpdChk01_DtlR.$bp_jnl_key_set_col_typ,
										MABCL0514, toDispGUIIndex(r)));
							}
						}
					}
					else if (MAC_AC_SLIP_TYP.is_pay_typ(r.ac_slip_typ())) {
						if (!MAC_JNL_KEY_SET_COL_TYP.is_pay(r.jnl_key_set_col_typ())) {
							msgList.add(new MCMessage(r, JnlKeyMap_UpdChk01_DtlR.$jnl_key_set_col_typ, MABCL0521, toDispGUIIndex(r)));
						}
						else {
							if (MAC_JNL_KEY_SET_COL_TYP.is_bp_grp(r.jnl_key_set_col_typ())
									&& !MAC_JNL_KEY_SET_COL_TYP
											.is_pay(r.bp_jnl_key_set_col_typ())) {
								msgList.add(new MCMessage(r,
										JnlKeyMap_UpdChk01_DtlR.$bp_jnl_key_set_col_typ,
										MABCL0521, toDispGUIIndex(r)));
							}
						}
					}
				}
			}
			return msgList;
		}
	}
	/**
	 * JnlKeyMap_Upd01オペレーション.<p>
	 *
	 * 仕訳キー対応マスタを登録する<br>
	 */
	public class JnlKeyMap_Upd01 extends MABCL_JnlKeyMapReg_MC_A.JnlKeyMap_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * JnlKeyMap_DelChk01オペレーション.<p>
	 *
	 * 仕訳キー対応マスタを削除する前のチェックを行う<br>
	 */
	public class JnlKeyMap_DelChk01 extends MABCL_JnlKeyMapReg_MC_A.JnlKeyMap_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * JnlKeyMap_Del01オペレーション.<p>
	 *
	 * 仕訳キー対応マスタを削除する<br>
	 */
	public class JnlKeyMap_Del01 extends MABCL_JnlKeyMapReg_MC_A.JnlKeyMap_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理を行う<br>
	 */
	public class Srch01 extends MABCL_JnlKeyMapReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void condCustomize(MCRow cond) {
			super.condCustomize(cond);
			if (cond == null) {
				return;
			}
			cond.setStringNE("cost_flg_str",
					getFlgStr(cond, Srch01_CndR.$on_cost_flg, Srch01_CndR.$off_cost_flg));
		}

		protected String getFlgStr(MCRow r, String onFlgNm, String offFlgNm) {
			boolean onFlg = r.getBoolean(onFlgNm);
			boolean offFlg = r.getBoolean(offFlgNm);

			if (onFlg == offFlg) {
				return null;
			}
			if (onFlg) {
				return MCBooleanUtil.booleanToDBString(true);
			}
			else {
				return MCBooleanUtil.booleanToDBString(false);
			}
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			dbcCustomizeSub(builder);
		}

		protected <R extends MCDBContainer> void dbcCustomizeSub(MCQueryApiBuilder builder) {
			MAM_JNL_KEY_MAP_R t = MAM_JNL_KEY_MAP_R.create(builder.getBaseDbcAlias());
			builder.addWhereWithCutOffAnd(t.cost_flg.eq(bind("cost_flg_str")));
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録処理を行う<br>
	 */
	public class Upd01 extends MABCL_JnlKeyMapReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 削除処理を行う<br>
	 */
	public class Del01 extends MABCL_JnlKeyMapReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}