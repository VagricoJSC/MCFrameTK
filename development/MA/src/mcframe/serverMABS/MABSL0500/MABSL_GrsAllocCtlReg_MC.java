package mcframe.serverMABS.MABSL0500;

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
import mcframe.serverMABS.MABSL0500.*; // このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_GrsAllocCtlReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_GrsAllocCtlReg_MC extends MABSL_GrsAllocCtlReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * GrsAllocCtl_UpdChk01オペレーション.<p>
	 *
	 * 総量・場所引当制御マスタを登録する前のチェックを行う<br>
	 */
	public class GrsAllocCtl_UpdChk01
			extends MABSL_GrsAllocCtlReg_MC_A.GrsAllocCtl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();

			for (GrsAllocCtl_UpdChk01_DtlR r : up0()) {
				if (r.del_flg()) {
					continue;
				}
				MAM_LOC_R locR = getLocRec(r);
				if (!isNullOrNullVal(r.lg_grp_cd()) && !isNullOrNullVal(r.alloc_grp_cd())
						&& isNullOrNullVal(locR.lg_grp_cd())) {
					msgList.add(new MCMessage(r, GrsAllocCtl_UpdChk01_DtlR.$lg_grp_cd,
							MABSL0191, r.lg_grp_cd(), r.alloc_grp_cd(),
							toDispGUIIndex(r)));
				}
				if (!isNullOrNullVal(r.loc_cd()) && isNullOrNullVal(locR.loc_cd())) {
					if (!isNullOrNullVal(r.alloc_grp_cd())) {
						msgList.add(new MCMessage(r, GrsAllocCtl_UpdChk01_DtlR.$loc_cd,
								MABSL0192, r.loc_cd(), r.alloc_grp_cd(),
								toDispGUIIndex(r)));
					}
					else if (!isNullOrNullVal(r.lg_grp_cd())) {
						msgList.add(new MCMessage(r, GrsAllocCtl_UpdChk01_DtlR.$loc_cd,
								MABSL0193, r.loc_cd(), r.lg_grp_cd(), toDispGUIIndex(r)));
					}
				}
				if (!isNullOrNullVal(r.alloc_grp_cd()) && !isNullOrNullVal(r.lg_grp_cd())
						&& (!MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(r.alloc_scope_typ()))) {
					msgList.add(
							new MCMessage(r, GrsAllocCtl_UpdChk01_DtlR.$alloc_scope_typ,
									MABSL0194, r.alloc_scope_typ(), toDispGUIIndex(r)));
				}
				if (!isNullOrNullVal(r.loc_cd())
						&& (!MAC_ALLOC_SCOPE_TYP.isLOC(r.alloc_scope_typ()))) {
					if (!isNullOrNullVal(r.alloc_grp_cd())) {
						msgList.add(new MCMessage(r,
								GrsAllocCtl_UpdChk01_DtlR.$alloc_scope_typ, MABSL0195,
								r.alloc_scope_typ(), toDispGUIIndex(r)));
					}
					if (!isNullOrNullVal(r.lg_grp_cd())) {
						msgList.add(new MCMessage(r,
								GrsAllocCtl_UpdChk01_DtlR.$alloc_scope_typ, MABSL0196,
								r.alloc_scope_typ(), toDispGUIIndex(r)));
					}
				}
			}
			return msgList;
		}

		// 総量引当場所グループＣＤ、物流グループＣＤ、場所ＣＤを取得
		protected MAM_LOC_R getLocRec(GrsAllocCtl_UpdChk01_DtlR r) {
			MCList<MAM_LOC_R> locL = MCList.create(MAM_LOC_R.class);
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(t);

			if (!isNullOrNullVal(r.alloc_grp_cd())) {
				locL_bldr.addWhereWithCutOffAnd(t.alloc_grp_cd.eq(bind("1")),
						r.alloc_grp_cd());
			}
			if (!isNullOrNullVal(r.lg_grp_cd())) {
				locL_bldr.addWhereWithCutOffAnd(t.lg_grp_cd.eq(bind("1")), r.lg_grp_cd());
			}
			if (!isNullOrNullVal(r.loc_cd())) {
				locL_bldr.addWhereWithCutOffAnd(t.loc_cd.eq(bind("1")), r.loc_cd());
			}
			dbSelect("MABSL0500_MAM_LOC_S01", locL, locL_bldr);
			
			MAM_LOC_R locR = MAM_LOC_R.create();
			if (!locL.isEmpty()) {
				locR = locL.get(0);	
			}
			return locR;
		}
	}

	/**
	 * GrsAllocCtl_Upd01オペレーション.<p>
	 *
	 * 総量・場所引当制御マスタを登録する<br>
	 */
	public class GrsAllocCtl_Upd01 extends MABSL_GrsAllocCtlReg_MC_A.GrsAllocCtl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * GrsAllocCtl_DelChk01オペレーション.<p>
	 *
	 * 総量・場所引当制御マスタを削除する前のチェックを行う<br>
	 */
	public class GrsAllocCtl_DelChk01
			extends MABSL_GrsAllocCtlReg_MC_A.GrsAllocCtl_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * GrsAllocCtl_Del01オペレーション.<p>
	 *
	 * 総量・場所引当制御マスタを削除する<br>
	 */
	public class GrsAllocCtl_Del01 extends MABSL_GrsAllocCtlReg_MC_A.GrsAllocCtl_Del01 {
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
	public class Srch01 extends MABSL_GrsAllocCtlReg_MC_A.Srch01 {
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
	public class Upd01 extends MABSL_GrsAllocCtlReg_MC_A.Upd01 {
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
	public class Del01 extends MABSL_GrsAllocCtlReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}