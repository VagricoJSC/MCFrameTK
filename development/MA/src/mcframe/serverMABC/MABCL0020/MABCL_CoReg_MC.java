package mcframe.serverMABC.MABCL0020;

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
import mcframe.serverMABC.MABCL0020.*;	// このimportはFrameManagerの自動生成で追加されました。
import java.util.Map;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_CoReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_CoReg_MC extends MABCL_CoReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Co_UpdChk01オペレーション.<p>
	 *
	 * 会社マスタの更新前のチェックを行います。<br>
	 */
	public class Co_UpdChk01 extends MABCL_CoReg_MC_A.Co_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();

			for(Co_UpdChk01_DtlR r : up0()){
				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				if (!checkDay(r.ac_cl_day())) {
					msgList.add(new MCMessage(r, Co_UpdChk01_DtlR.$ac_cl_day, MABCL0267, 
							getLabel(r, Co_UpdChk01_DtlR.$ac_cl_day), toDispGUIIndex(r)));
				}
				
				if (!isNull(r.ptax_cur_cd()) && (isSame(r.base_cur_cd(), r.ptax_cur_cd()))) {
					msgList.add(new MCMessage(r, Co_UpdChk01_DtlR.$ptax_cur_cd, MABCL0308, toDispGUIIndex(r)));
				}
				if (MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(r.sls_basis_typ())
						&& !MAC_BILL_BASIS_TYP.isARRV(r.bill_basis_typ())) {
					msgList.add(new MCMessage(r, Co_UpdChk01_DtlR.$bill_basis_typ,
							MABCL0602, toDispGUIIndex(r)));
				}
			}
			return msgList;
		}
		
		protected boolean checkDay(MCNumber val) {
			MCNumber min = MCNumber.ONE;
			MCNumber max = new MCNumber(31);
			MCNumber last = new MCNumber(99);
			return isNull(val) || (min.lte(val) && val.lte(max)) || last.eq(val);
		}
	}
	/**
	 * Co_Upd01オペレーション.<p>
	 *
	 * 会社マスタの更新を行います。<br>
	 */
	public class Co_Upd01 extends MABCL_CoReg_MC_A.Co_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CoSub_UpdChk01オペレーション.<p>
	 *
	 * 会社補助マスタの登録前のチェックを行います。<br>
	 */
	public class CoSub_UpdChk01 extends MABCL_CoReg_MC_A.CoSub_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CoSub_Upd01オペレーション.<p>
	 *
	 * 会社補助マスタの登録を行います。<br>
	 */
	public class CoSub_Upd01 extends MABCL_CoReg_MC_A.CoSub_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void selectForUpdateNoWait(MCQueryApiBuilder builder,
				MCList<R> locked, MCList<R> upd) {
			
			upd.sort(builder.getBaseDbc().getKeyColumn());

			// 更新可能キー項目があった場合、変更前キー項目の値をキー項目に設定してからロックを行う。
			// 削除時（＝ステータスがDELETE）は行わない
			MCList<R> b = (MCList<R>) upd.clone();
			for (R r : b) {
				if (!b.isStatusDelete()) {
					for (Map.Entry<String, String> e : getUpdatableKeyMap(r).entrySet()) {
						r.setValue(e.getKey(), r.getValueNE(e.getValue()));
					}
				}
			}

			// ワークテーブルでのロックを行わない
			dbSelectKeyForUpdateNoWait(createSqlId(LOGIC_ID, builder.getBaseDbc(), "S51"), locked, builder, b);
		}


	}
	/**
	 * CoLcl_UpdChk01オペレーション.<p>
	 *
	 * 会社名称マスタの登録前のチェックを行います。<br>
	 */
	public class CoLcl_UpdChk01 extends MABCL_CoReg_MC_A.CoLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CoLcl_Upd01オペレーション.<p>
	 *
	 * 会社名称マスタの登録を行います。<br>
	 */
	public class CoLcl_Upd01 extends MABCL_CoReg_MC_A.CoLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 会社マスタ、会社名称マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_CoReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 会社マスタ、会社補助マスタ、会社名称マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABCL_CoReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}