package mcframe.serverMABC.MABCL0290;

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
import mcframe.serverMABC.MABCL0290.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverCore.resource.MCConfig;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_DptLclReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_DptLclReg_MC extends MABCL_DptLclReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * DptLcl_UpdChk01オペレーション.<p>
	 *
	 * 部門名称の登録前のチェックを行います。<br>
	 */
	public class DptLcl_UpdChk01 extends MABCL_DptLclReg_MC_A.DptLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			
			MCMessageList msgList = super.doServerCheckSub();
			for(DptLcl_UpdChk01_DtlR row : up0()){
				// ローケル存在チェック
				msgList.addAll(checkLocaleEntry(row.lcl_cd()));
			}
			return msgList;
		}
	}
	/**
	 * DptLcl_Upd01オペレーション.<p>
	 *
	 * 部門名称の登録を行います。<br>
	 */
	public class DptLcl_Upd01 extends MABCL_DptLclReg_MC_A.DptLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * DptLcl_DelChk01オペレーション.<p>
	 *
	 * 部門名称の削除前のチェックを行います。<br>
	 */
	public class DptLcl_DelChk01 extends MABCL_DptLclReg_MC_A.DptLcl_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			
			MCMessageList msgList = super.doServerCheckSub();
			for(DptLcl_DelChk01_DtlR row : up0()){
				// ローケル存在チェック
				msgList.addAll(checkLocaleEntry(row.lcl_cd()));
			}
			return msgList;
		}
	}
	/**
	 * DptLcl_Del01オペレーション.<p>
	 *
	 * 部門名称の削除を行います。<br>
	 */
	public class DptLcl_Del01 extends MABCL_DptLclReg_MC_A.DptLcl_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 部門名称の検索を行います。<br>
	 */
	public class Srch01 extends MABCL_DptLclReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_DPT_LCL_R) {
				dbcCustomizeSub(builder, rslt);
			}
		}
		
		protected <R extends MCDBContainer> void dbcCustomizeSub(MCQueryApiBuilder builder,
				MCList<R> rslt) {

			MAM_DPT_R dpt1 = MAM_DPT_R.create("DPT1");
			MAM_DPT_LCL_R t = MAM_DPT_LCL_R.create(builder.getBaseDbcAlias());
			
			builder.setWhere(value(0).eq(value(0)));
			if (up0().reg_flg() && !up0().yet_flg()) {
				builder.addInnerJoin(dpt1, bracket( t.dpt_cd.eq(dpt1.dpt_cd)
								.and(t.st_dt.eq(dpt1.st_dt))
								.and(t.end_dt.eq(dpt1.end_dt))));
				
				builder.addWhereWithCutOffAnd(t.lcl_cd.like(bind(Srch01_CndR.$lcl_cd)));
				}
			else {
				MCTempView dptlcl1 = createTempView("DPTLCL1");
				MAM_DPT_LCL_R S1M = MAM_DPT_LCL_R.create("M");
				if (isNull(up0().lcl_cd())){
					builder.addInnerJoin(
							subQuery().select(S1M.prAll()).from(S1M).view(dptlcl1),
							bracket(t.dpt_cd.eq(dptlcl1.pr("dpt_cd"))
									.and(t.st_dt.eq(dptlcl1.pr("st_dt")))
									.and(t.lcl_cd.eq(dptlcl1.pr("lcl_cd")))));
				}
				else {
					builder.removeSelect(MAM_DPT_LCL_R.$lcl_cd);
					builder.addSelect(nvl( dptlcl1.pr(S1M.lcl_cd), value(up0().lcl_cd())).as("lcl_cd"));
					builder.addInnerJoin(
							subQuery().select(S1M.prAll()).from(S1M)
									.where(S1M.lcl_cd.eq(bind(Srch01_CndR.$lcl_cd)))
									.view(dptlcl1),
							bracket(t.dpt_cd.eq(dptlcl1.pr("dpt_cd"))
									.and(t.st_dt.eq(dptlcl1.pr("st_dt")))
									.and(t.end_dt.eq(dptlcl1.pr("end_dt")))
									.and(t.lcl_cd.eq(dptlcl1.pr("lcl_cd")))));
					}
				builder.addFullOuterJoin(dpt1,
						bracket(dptlcl1.pr(S1M.dpt_cd).eq(dpt1.dpt_cd)
								.and(dptlcl1.pr(S1M.st_dt).eq(dpt1.st_dt))
								.and(dptlcl1.pr(S1M.end_dt).eq(dpt1.end_dt))));
				
				if (!up0().reg_flg() && up0().yet_flg()){
					builder.addWhereWithAnd(dptlcl1.pr(S1M.lcl_cd).isNull()) ;
				}
				else {
					builder.addWhereWithAnd(dpt1.dpt_cd.isNotNull());
				}
			}
			
			builder.addWhereWithCutOffAnd(dpt1.st_dt.gte(bind(Srch01_CndR.$st_dt_fr)));
			builder.addWhereWithCutOffAnd(dpt1.st_dt.lte(bind(Srch01_CndR.$st_dt_to)));
			builder.addWhereWithCutOffAnd(dpt1.end_dt.gte(bind(Srch01_CndR.$end_dt_fr)));
			builder.addWhereWithCutOffAnd(dpt1.end_dt.lte(bind(Srch01_CndR.$end_dt_to)));
			builder.addWhereWithCutOffAnd(dpt1.dpt_cd.like(bind(Srch01_CndR.$dpt_cd)));
			builder.addWhereWithCutOffAnd(t.dpt_nm.like(bind(Srch01_CndR.$dpt_nm)));
			builder.addWhereWithCutOffAnd(t.memo1.like(bind(Srch01_CndR.$memo1)));
			builder.addWhereWithCutOffAnd(t.memo2.like(bind(Srch01_CndR.$memo2)));
			builder.addWhereWithCutOffAnd(t.memo3.like(bind(Srch01_CndR.$memo3)));
			
			builder.addWhereWithCutOffAnd(dpt1.base_dpt_nm.like(bind(Srch01_CndR.$dpt_nm_std)));
			
			builder.removeSelect(MAM_DPT_LCL_R.$dpt_cd);
			builder.addSelect(dpt1.dpt_cd);
			builder.removeSelect(MAM_DPT_LCL_R.$st_dt);
			builder.addSelect(dpt1.st_dt);
			builder.removeSelect(MAM_DPT_LCL_R.$end_dt);
			builder.addSelect(dpt1.end_dt);
			builder.addSelect(dpt1.base_dpt_nm.as("dpt_nm_std"));
			
			builder.addSelect(decode( t.dpt_cd, nullValue(), value(true), value(false)).as("yet_flg"));
			rslt.addBooleanColumn("yet_flg");
			
		}
		
		@Override
		protected void down_SELECT_c0_0(Srch01_RsltR r_dest, MAM_DPT_LCL_R r_src) {
			super.down_SELECT_c0_0(r_dest, r_src);

			// ロケール名
			if (!isNull(r_src.lcl_cd())) {
				MCList<MCRow> lclLst = MCConfig.common.getEntryLocaleList("lcl_cd", "lcl_nm");
				MCRow row = lclLst.getFirst("lcl_cd", r_src.lcl_cd());
				if (row != null) {
					r_dest.lcl_nm(row.getStringNE("lcl_nm"));
				}
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 部門名称の登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABCL_DptLclReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 部門名称の削除を行います。<br>
	 */
	public class Del01 extends MABCL_DptLclReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}