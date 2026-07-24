package mcframe.serverMABC.MABCL0010;

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
import mcframe.serverMABC.MABCL0010.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverCore.dbc.CoreFunction.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_MstCtlSet"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_MstCtlSet_MC extends MABCL_MstCtlSet_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * マスタ制御情報の検索を行います。<br>
	 */
	public class Srch01 extends MABCL_MstCtlSet_MC_A.Srch01 {
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

			if(builder.getBaseDbc() instanceof MAM_MST_CTL_R){
				dbcCustomizeSub(builder);
			}
		}

		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			MAM_MST_CTL_R t = (MAM_MST_CTL_R) builder.getBaseDbc();
			
			// 部分一致チェックがオンの場合
			if (up0().match_typ1()) {
				up0().addStringColumn("match_typ", "1");
				builder.setWhere(value(0).eq(value(0)));
				builder.addWhereWithAnd(MAC_MST_NM$CONTAINS(t.mst_nm).eq(value("1")));
				builder.addWhereWithCutOffAnd(t.mst_nm.like(bind("1")), getEditString(up0(), Srch01_CndR.$mst_nm));
				builder.addWhereWithCutOffAnd(
						MAC_MST_NM$V2NAME(t.mst_nm, FCPA_CONTEXT$F_GET_LOCALE()).like(
								bind("1")),
						getEditString(up0(), Srch01_CndR.$mst_nm_nm));
				builder.addWhereWithCutOffAnd(t.memo1.like(bind("1")), getEditString(up0(), Srch01_CndR.$memo1));
				builder.addWhereWithCutOffAnd(t.memo2.like(bind("1")), getEditString(up0(), Srch01_CndR.$memo2));
				builder.addWhereWithCutOffAnd(t.memo3.like(bind("1")), getEditString(up0(), Srch01_CndR.$memo3));
			}
			else {
				builder.addWhereWithAnd(MAC_MST_NM$CONTAINS(t.mst_nm).eq(value("1")));
				if(!isNull(up0().mst_nm_nm())) {
					builder.addWhereWithCutOffAnd(
							MAC_MST_NM$V2NAME(t.mst_nm, FCPA_CONTEXT$F_GET_LOCALE()).like(
									bind(Srch01_CndR.$mst_nm_nm)));
				}
			}
			// 属性mst_sortに設定されている値の昇順
			builder.addOrderBy(MAC_MST_NM$MST_SORT(t.mst_nm).asc());
		}
	}
	/**
	 * MstCtl_UpdChk01オペレーション.<p>
	 *
	 * マスタ制御情報の登録前のチェックを行います。<br>
	 */
	public class MstCtl_UpdChk01 extends MABCL_MstCtlSet_MC_A.MstCtl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * MstCtl_Upd01オペレーション.<p>
	 *
	 * マスタ制御情報の登録を行います。<br>
	 */
	public class MstCtl_Upd01 extends MABCL_MstCtlSet_MC_A.MstCtl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			callSub();
		}
		
		protected void callSub(){
			// ＤＢＬＩＮＫ名を取得
			String dbLinkNm = getDbLink().dblink_nm();
			// 更新情報取得
			MAM_MST_CTL_R updInfo = MAM_MST_CTL_R.create();
			selectUpdInfo(updInfo);
			
			// 更新処理
			for(MstCtl_UpdChk01_DtlR row : up0()){
				MAM_MST_CTL_R r = MAM_MST_CTL_R.create();
				copy(r, row, createMap_MAM_MST_CTL_R_MstCtl_UpdChk01_DtlR());
				updateTbl(r, updInfo);
				execMasterProc(r, dbLinkNm);
			}
			// 後処理
			execMasterCheckProc(dbLinkNm) ;
		}
		
		// ＤＢＬＩＮＫ名を取得
		protected MAM_MST_DBLINK_R getDbLink() {
			MAM_MST_DBLINK_R dbLinkR = MAM_MST_DBLINK_R.create();
			MAM_MST_DBLINK_R t = MAM_MST_DBLINK_R.create("T");
			MCQueryApiBuilder dbLinkR_bldr = MCQueryApiBuilder.create(t);
			dbLinkR_bldr.addMax(t.dblink_nm, MAM_MST_DBLINK_R.$dblink_nm);
			dbSelect("MABCL0010_MAM_MST_DBLINK_S01", dbLinkR, dbLinkR_bldr);
			return dbLinkR;
		}
		
		// マスタ制御情報更新
		protected void updateTbl(MAM_MST_CTL_R r, MAM_MST_CTL_R updInfo) {
			MAM_MST_CTL_R t = MAM_MST_CTL_R.create("T");

			MAM_MST_CTL_R l = MAM_MST_CTL_R.create();
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
			dbSelectKeyForUpdateNoWait("MABCL0010_MAM_MST_CTL_S01", l, l_bldr, r);

			r.upd_usr_id(updInfo.upd_usr_id());
			r.upd_usr_nm(updInfo.upd_usr_nm());
			r.upd_func_id(updInfo.upd_func_id());
			r.upd_srv_req_no(updInfo.upd_srv_req_no());

			MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(t);
			r_bldr.addSet(t.upd_usr_id, t.upd_usr_nm, t.upd_func_id, t.upd_srv_req_no);

			dbUpdateKey("MABCL0010_MAM_MST_CTL_U01", r, r_bldr);
		}
		
		// マスタビュー更新（マスタ設定プロシージャの実行）
		protected void execMasterProc(MAM_MST_CTL_R upR, String dbLinkNm) {
			MCRow inbind = MCRow.create();
			inbind.addStringColumn("I_MST_NM", upR.mst_nm());
			inbind.addStringColumn("I_MST_SET_TYP", upR.mst_set_typ());
			inbind.addBooleanColumn("I_LCL_FLG", upR.lcl_flg());
			inbind.addStringColumn("I_DB_LINK_NM", dbLinkNm);
			
			String procId = "MAPA_MASTER$P_MST_CTL";
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId, inbind, null, ":I_MST_NM,:I_MST_SET_TYP,:I_LCL_FLG,:I_DB_LINK_NM");
		}
		
		// 後処理の実行
		protected void execMasterCheckProc(String dbLinkNm) {
			MCRow inbind = MCRow.create();
			inbind.addStringColumn("I_DB_LINK_NM", dbLinkNm);

			String procId = "MAPA_MASTER$P_MST_CTL_CHECK";
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId, inbind, null, ":I_DB_LINK_NM");
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * マスタ制御情報の登録を行います。<br>
	 */
	public class Upd01 extends MABCL_MstCtlSet_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	protected Map_MAM_MST_CTL_R_MstCtl_UpdChk01_DtlR<MAM_MST_CTL_R,MstCtl_UpdChk01_DtlR> createMap_MAM_MST_CTL_R_MstCtl_UpdChk01_DtlR() {
		return new Map_MAM_MST_CTL_R_MstCtl_UpdChk01_DtlR<MAM_MST_CTL_R, MstCtl_UpdChk01_DtlR>();
	}

	public class Map_MAM_MST_CTL_R_MstCtl_UpdChk01_DtlR<D extends MAM_MST_CTL_R, S extends MstCtl_UpdChk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MAM_MST_CTL_R.$mst_nm, MstCtl_UpdChk01_DtlR.$mst_nm);
			addColumnPathMap(MAM_MST_CTL_R.$mst_set_typ, MstCtl_UpdChk01_DtlR.$mst_set_typ);
			addColumnPathMap(MAM_MST_CTL_R.$lcl_flg, MstCtl_UpdChk01_DtlR.$lcl_flg);
			addColumnPathMap(MAM_MST_CTL_R.$memo1, MstCtl_UpdChk01_DtlR.$memo1);
			addColumnPathMap(MAM_MST_CTL_R.$memo2, MstCtl_UpdChk01_DtlR.$memo2);
			addColumnPathMap(MAM_MST_CTL_R.$memo3, MstCtl_UpdChk01_DtlR.$memo3);
			addColumnPathMap(MAM_MST_CTL_R.$upd_ts, MstCtl_UpdChk01_DtlR.$upd_ts);
		}
	}

	//FMCB CUSTOM END
}