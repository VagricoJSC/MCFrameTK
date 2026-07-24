package mcframe.serverMABC.MABCL0270;

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
import mcframe.serverMABC.MABCL0270.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_DptMapReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_DptMapReg_MC extends MABCL_DptMapReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理を行う<br>
	 */
	public class Srch01 extends MABCL_DptMapReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_DPT_MAP_R) {
				dbcCustomizeSub(builder);
			}
		}

		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {

			MAM_DPT_BASE_R dpt1 = MAM_DPT_BASE_R.create("DPT1");
			MAM_DPT_R dpt2 = MAM_DPT_R.create("DPT2");
			MAM_DPT_HIS_R dpt_his1 = MAM_DPT_HIS_R.create("DPT_HIS1");
			MAM_DPT_MAP_R t = MAM_DPT_MAP_R.create(builder.getBaseDbcAlias());

			builder.addLeftOuterJoin(dpt1, t.old_dpt_cd.eq(dpt1.dpt_cd));
			builder.addLeftOuterJoin(dpt2, t.new_dpt_cd.eq(dpt2.dpt_cd)
					.and(t.st_dt.eq(dpt2.st_dt)));
			builder.addLeftOuterJoin(dpt_his1, t.st_dt.eq(dpt_his1.st_dt));
			builder.addWhereWithCutOffAnd(t.st_dt.gte(bind(Srch01_CndR.$st_dt_fr)));
			builder.addWhereWithCutOffAnd(t.st_dt.lte(bind(Srch01_CndR.$st_dt_to)));
			builder.addWhereWithCutOffAnd(t.end_dt.gte(bind(Srch01_CndR.$end_dt_fr)));
			builder.addWhereWithCutOffAnd(t.end_dt.lte(bind(Srch01_CndR.$end_dt_to)));
			builder.addWhereWithCutOffAnd(t.old_dpt_cd.like(bind(Srch01_CndR.$old_dpt_cd)));
			builder.addWhereWithCutOffAnd(dpt1.def_dpt_nm.like(bind(Srch01_CndR.$old_dpt_nm)));
			builder.addWhereWithCutOffAnd(t.new_dpt_cd.like(bind(Srch01_CndR.$new_dpt_cd)));
			builder.addWhereWithCutOffAnd(dpt2.dpt_nm.like(bind(Srch01_CndR.$new_dpt_nm)));
			builder.addSelect(dpt_his1.dpt_his_rmrks);
			builder.addSelect(dpt1.def_dpt_nm.as("old_dpt_nm"));
			builder.addSelect(dpt2.dpt_nm.as("new_dpt_nm"));
		}
	}
	/**
	 * DptMap_UpdChk01オペレーション.<p>
	 *
	 * 部門変更対応マスタを登録する前のチェックを行う<br>
	 */
	public class DptMap_UpdChk01 extends MABCL_DptMapReg_MC_A.DptMap_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList =	super.doServerCheckSub();
			for (DptMap_UpdChk01_DtlR r : up0()) {
				// 個別チェック
				if (!isNull(r.old_dpt_cd()) && !isNull(r.new_dpt_cd())) {
					if (isSame(r.old_dpt_cd(), r.new_dpt_cd())) {
						msgList.add(new MCMessage(r, DptMap_UpdChk01_DtlR.$new_dpt_cd, MABCL0318, toDispGUIIndex(r)));
					}
				}
			}

			return msgList;
		}

	}
	/**
	 * DptMap_Upd01オペレーション.<p>
	 *
	 * 部門変更対応マスタを登録する<br>
	 */
	public class DptMap_Upd01 extends MABCL_DptMapReg_MC_A.DptMap_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void beforeUpdate(MCList<R> dbc) {
			// 組織変更履歴マスタのキャッシュ取得
			initDptHisCache(dbc);
			
			if (dbc.createRow() instanceof MAM_DPT_MAP_R) {
				for (R r : dbc) {
					r.setValueNE("end_dt", getDptHisCache().get(r.getDate("st_dt")).end_dt());
				}
			}
			super.beforeUpdate(dbc);
		}
	}
	/**
	 * DptMap_DelChk01オペレーション.<p>
	 *
	 * 部門変更対応マスタを削除する前のチェックを行う<br>
	 */
	public class DptMap_DelChk01 extends MABCL_DptMapReg_MC_A.DptMap_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * DptMap_Del01オペレーション.<p>
	 *
	 * 部門変更対応マスタを削除する<br>
	 */
	public class DptMap_Del01 extends MABCL_DptMapReg_MC_A.DptMap_Del01 {
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
	public class Del01 extends MABCL_DptMapReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録処理を行う<br>
	 */
	public class Upd01 extends MABCL_DptMapReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	protected static final Class<MABCL_DptMapReg> CLAZZ = MABCL_DptMapReg.class;

	/**
	 * MAM_DPT_HISキャッシュ
	 */
	protected static void initDptHisCache(MCList<?> list) {
		object(CLAZZ)._initDptHisCache(list);
	}
	protected FXUCL_MCDbcCache<MAM_DPT_HIS_R> _dptHisCache = null;
	protected void _initDptHisCache(MCList<?> list) {
		MAM_DPT_HIS_R dptR = MAM_DPT_HIS_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dptR);
		builder.setSelect(
				dptR.st_dt,
				dptR.end_dt
		);
		_dptHisCache = new FXUCL_MCDbcCache<MAM_DPT_HIS_R>(builder, list, MAM_DPT_HIS_R.$st_dt);
	}
	protected static FXUCL_MCDbcCache<MAM_DPT_HIS_R> getDptHisCache() {
		if (object(CLAZZ)._dptHisCache == null) {
			object(CLAZZ)._initDptHisCache(MCList.create(MCRow.class));
		}
		return object(CLAZZ)._dptHisCache;
	}
	protected static MAM_DPT_HIS_R getDptHisR(MCDate stDt) {
		return getDptHisCache().get(stDt);
	}

	//FMCB CUSTOM END
}