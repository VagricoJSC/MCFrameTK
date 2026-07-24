package mcframe.serverMABC.MABCL0240;

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
import mcframe.serverMABC.MABCL0240.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverCore.login.MCLicense;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_UsrReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_UsrReg_MC extends MABCL_UsrReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Usr_UpdChk01オペレーション.<p>
	 *
	 * 担当者マスタの登録前のチェックを行います。<br>
	 */
	public class Usr_UpdChk01 extends MABCL_UsrReg_MC_A.Usr_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(Usr_UpdChk01_DtlR r : up0()){
				if (isNotCd(r.usr_cd())){
					msgList.add(new MCMessage(r, Usr_UpdChk01_DtlR.$usr_cd, MABCL0306, 
									getLabel(r, Usr_UpdChk01_DtlR.$usr_cd), r.usr_cd(), toDispGUIIndex(r)));
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
	 * Usr_Upd01オペレーション.<p>
	 *
	 * 担当者マスタの登録を行います。<br>
	 */
	public class Usr_Upd01 extends MABCL_UsrReg_MC_A.Usr_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void updDbcCustomize(
				MCQueryApiBuilder builder, MCList<R> list) {
			super.updDbcCustomize(builder, list);
			if(builder.getBaseDbc() instanceof MAM_USR_R){
				dbcCustomizeUpdSub(builder);
			}
		}

		protected void dbcCustomizeUpdSub(MCQueryApiBuilder builder) {
			boolean imageFlg = false;
			if (up0().size() != 0) {
				Usr_UpdChk01_DtlR row = up0().get(0);
				if (!isNull(row)) {
					if (row.th_image_flg()) {
						imageFlg = true;
					}
				}
				if(!imageFlg){
					builder.removeSet(MAM_USR_R.$th_image);
				}
			}
		}
		
		@Override
		protected <R extends MCDBContainer> void afterUpdate(MCList<R> dbc) {
			super.afterUpdate(dbc);
			for (R r : dbc) {
				if (dbc.createRow() instanceof MAM_USR_R) {
					insBinary((MAM_USR_R) r);
				}
			}
		}
		
		/**
		 * 担当者マスタを会社共通（別データベース）で管理する場合にサムネイル画像を同期する（共通ＤＢへの反映）
		 * 
		 * @param r ＤＢコンテナ
		 */
		protected <R extends MCRow> void insBinary(MAM_USR_R r) {
			if (!isNull((r.th_image()))) {
				String procId = "MAPA_MASTER$P_INS_BINARY";
				execProc(createSqlId(LOGIC_ID, procId, "01"), procId, r, null, ":th_image");
			}
		}
	}
	/**
	 * UsrLcl_UpdChk01オペレーション.<p>
	 *
	 * 担当者名称マスタの登録前のチェックを行います。<br>
	 */
	public class UsrLcl_UpdChk01 extends MABCL_UsrReg_MC_A.UsrLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * UsrLcl_Upd01オペレーション.<p>
	 *
	 * 担当者名称マスタの登録を行います。<br>
	 */
	public class UsrLcl_Upd01 extends MABCL_UsrReg_MC_A.UsrLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 担当者マスタ、担当者名称マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_UsrReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if(builder.getBaseDbc() instanceof MAM_USR_R){
				dbcCustomizeSub(builder, rslt);
			}
		}

		protected <R extends MCDBContainer> void dbcCustomizeSub(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			
			rslt.addBooleanColumn(Srch01_Rslt1R.$th_image_flg);

			if (!up0().th_image_flg()) {
				builder.removeSelect(MAM_USR_R.$th_image);
				builder.addSelect(value(false).as(Srch01_Rslt1R.$th_image_flg));
			}
			else {
				builder.addSelect(value(true).as(Srch01_Rslt1R.$th_image_flg));
			}
		}

		@Override
		protected void down_SELECT_c0_0(Srch01_Rslt1R r_dest, MAM_USR_R r_src) {
			super.down_SELECT_c0_0(r_dest, r_src);
			r_dest.th_image_flg(r_src.getBooleanNE(Srch01_Rslt1R.$th_image_flg));
			
			MCList<MCRow> list = MCList.create(MCRow.class);
			MCLicense.assignedProductList(r_src.usr_cd(), list, "PROD");
			r_dest.license_flg(!list.isEmpty());
		}

		@Override
		protected void doIt() {

			callProc();

			super.doIt();
		}
		/**
		 * 担当者マスタを会社共通（別データベース）で管理する場合にサムネイル画像を同期する（共通ＤＢからの取得）
		 * 
		 */
		protected void callProc() {
			String procid = "MAPA_MASTER$P_GET_BINARY";
			execProc(createSqlId(LOGIC_ID, procid, "01"), procid);
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 担当者マスタ、担当者名称マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABCL_UsrReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Usr_DelChk01オペレーション.<p>
	 *
	 * 担当者マスタ、担当者名称マスタの削除前のチェックを行います。<br>
	 */
	public class Usr_DelChk01 extends MABCL_UsrReg_MC_A.Usr_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Usr_Del01オペレーション.<p>
	 *
	 * 担当者マスタ、担当者名称マスタの削除を行います。<br>
	 */
	public class Usr_Del01 extends MABCL_UsrReg_MC_A.Usr_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 担当者マスタ、担当者名称マスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_UsrReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}