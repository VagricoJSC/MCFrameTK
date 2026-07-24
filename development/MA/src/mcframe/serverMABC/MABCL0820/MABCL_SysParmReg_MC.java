package mcframe.serverMABC.MABCL0820;

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
import mcframe.serverMABC.MABCL0820.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverCore.dbc.CoreFunction.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_SysParmReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_SysParmReg_MC extends MABCL_SysParmReg_MC_A{
	//FMCB CUSTOM START

	protected static final String DEF_WG_CD = "DEF_WG_CD";
	protected static final String DEF_LOC_GRP_CD = "DEF_LOC_GRP_CD";
	protected static final String SNO_TYP = "SNO_TYP";
	protected static final String WRK_ENABLE_FLG = "WRK_ENABLE_FLG";
	/**
	 * SysParm_UpdChk01オペレーション.<p>
	 *
	 * システムパラメータマスタの登録前のチェックを行います。<br>
	 */
	public class SysParm_UpdChk01 extends MABCL_SysParmReg_MC_A.SysParm_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(SysParm_UpdChk01_DtlR r : up0()){
				if (isNotCd(r.parm_key())){
					msgList.add(new MCMessage(r, SysParm_UpdChk01_DtlR.$parm_key, MABCL0306, 
									getLabel(r, SysParm_UpdChk01_DtlR.$parm_key), r.parm_key(), toDispGUIIndex(r)));
					continue;
				}
				if (r.del_flg()) {
					continue ;
				}
				if (r.getBooleanNE("err_flg")) {
					continue;
				}
			}
			return msgList;
		}
	}
	/**
	 * SysParm_Upd01オペレーション.<p>
	 *
	 * システムパラメータマスタの登録を行います。<br>
	 */
	public class SysParm_Upd01 extends MABCL_SysParmReg_MC_A.SysParm_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void afterUpdate(MCList<R> dbc) {
			super.afterUpdate(dbc);

			for (MCDBContainer r : dbc) {
				if (r instanceof MAM_SYS_PARM_R) {
					// DEF_WG_CD存在チェック
					checkDefWgCd((MAM_SYS_PARM_R) r);
					// DEF_LOC_GRP_CD存在チェック
					checkDefLocGrpCd((MAM_SYS_PARM_R) r);
					// SNO_TYP、WRK_ENABLE_FLG整合性チェック
					checkSnoWrk(((MAM_SYS_PARM_R) r));
				}
			}
		}

		/**
		 * SNO_TYPが無効のとき、WRK_ENABLE_FLGが無効かチェックします。
		 * @param r　ＤＢコンテナ
		 */
		protected void checkSnoWrk(MAM_SYS_PARM_R r) {
			if (isSame(r.getStringNE("parm_key"), SNO_TYP)
					|| isSame(r.getStringNE("parm_key"), WRK_ENABLE_FLG)) {
				if (getSnoTyp() == 0 && isWrkEnableFlg()) {
					getMsgList().add(new MCMessage(r, MAM_SYS_PARM_R.$parm_key, MABCL0525, toDispGUIIndex(r)));
				}
			}
		}

		/**
		 * DEF_LOC_GRP_CDの更新時、DEF_WG_CDが登録済みがチェックします。
		 * @param r　ＤＢコンテナ
		 */
		protected void checkDefWgCd(MAM_SYS_PARM_R r) {
			if (isSame(r.getStringNE("parm_key"), DEF_LOC_GRP_CD)) {
				if (!isNull(r.getString("parm_val"))) {
					if (isNull(getSysParmNE(DEF_WG_CD))) {
						getMsgList().add(new MCMessage(r, MAM_SYS_PARM_R.$parm_key, MABCL0522, toDispGUIIndex(r)));
					}
				}
			}
		}
		/**
		 * DEF_WG_CDの値クリア時、DEF_LOC_GRP_CDが登録済みかチェックします。
		 * @param r　ＤＢコンテナ
		 */
		protected void checkDefLocGrpCd(MAM_SYS_PARM_R r) {
			if (isSame(r.getStringNE("parm_key"), DEF_WG_CD)) {
				if (isNull(r.getString("parm_val"))) {
					if (!isNull(getSysParmNE(DEF_LOC_GRP_CD))) {
						getMsgList().add(new MCMessage(r, MAM_SYS_PARM_R.$parm_key, MABCL0523, toDispGUIIndex(r)));
					}
				}
			}
		}
	}
	/**
	 * SysParm_DelChk01オペレーション.<p>
	 *
	 * システムパラメータマスタの削除前のチェックを行います。<br>
	 */
	public class SysParm_DelChk01 extends MABCL_SysParmReg_MC_A.SysParm_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SysParm_Del01オペレーション.<p>
	 *
	 * システムパラメータマスタの削除を行います。<br>
	 */
	public class SysParm_Del01 extends MABCL_SysParmReg_MC_A.SysParm_Del01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void afterUpdate(MCList<R> dbc) {
			super.afterUpdate(dbc);

			for (MCDBContainer r : dbc) {
				if (r instanceof MAM_SYS_PARM_R) {
					// DEF_WG_CD存在チェック
					checkDefLocCd((MAM_SYS_PARM_R) r);
					// SNO_TYP、WRK_ENABLE_FLG整合性チェック
					checkSnoWrk(((MAM_SYS_PARM_R) r));
				}
			}
		}
		/**
		 * DEF_WG_CDの削除時、DEF_LOC_GRP_CDが登録済みかチェックします。
		 * @param r　ＤＢコンテナ
		 */
		protected void checkDefLocCd(MAM_SYS_PARM_R r) {
			if (isSame(r.getStringNE("parm_key"), DEF_WG_CD)) {
				if (!isNull(getSysParmNE(DEF_LOC_GRP_CD))) {
					getMsgList().add(new MCMessage(r, MAM_SYS_PARM_R.$parm_key, MABCL0524, toDispGUIIndex(r)));
				}
			}
		}
		/**
		 * SNO_TYPの削除時、WRK_ENABLE_FLGが無効かチェックします。
		 * @param r　ＤＢコンテナ
		 */
		protected void checkSnoWrk(MAM_SYS_PARM_R r) {
			if (isSame(r.getStringNE("parm_key"), SNO_TYP)) {
				if (isWrkEnableFlg()) {
					getMsgList().add(new MCMessage(r, MAM_SYS_PARM_R.$parm_key, MABCL0525, toDispGUIIndex(r)));
				}
			}
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * システムパラメータマスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_SysParmReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCRow getCond(MCController ctrl) {
			return super.getCond(ctrl);
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if(builder.getBaseDbc() instanceof MAM_SYS_PARM_R){
				dbcCustomizeSub(builder);
			}
		}

		protected <R extends MCDBContainer> void dbcCustomizeSub(MCQueryApiBuilder builder) {
			MAC_SYS_PARM_REMARK_R remark1 = MAC_SYS_PARM_REMARK_R.create("REMARK1");
			MAM_SYS_PARM_R t = MAM_SYS_PARM_R.create(builder.getBaseDbcAlias());

			// Select
			builder.addSelect(remark1.parm_remark);
			builder.addSelect(remark1.parm_biz_grp);

			// Join
			builder.addLeftOuterJoin(remark1, remark1.parm_key.eq(t.parm_key)
					.and(remark1.lcl_cd.eq(FCPA_CONTEXT$F_GET_LOCALE())));
			// Where
			builder.addWhereWithCutOffAnd(remark1.parm_biz_grp.like(bind(Srch01_CndR.$parm_biz_grp)));
			//概要は部分一致
			up0().addStringColumn("match_typ", "1");
			builder.addWhereWithCutOffAnd(remark1.parm_remark.like(bind("1")), getEditString(up0(), Srch01_CndR.$parm_remark));
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * システムパラメータマスタの登録を行います。<br>
	 */
	public class Upd01 extends MABCL_SysParmReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * システムパラメータマスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_SysParmReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}