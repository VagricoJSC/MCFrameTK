package mcframe.serverMSBC.MSBCL6140;

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
import mcframe.serverMB.dbc.*;
import mcframe.serverMS.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START

//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_ReExtHstService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_ReExtHstService_MC extends MSBCL_ReExtHstService_MC_A{
	//FMCB CUSTOM START

	/**
	 * ReExtHst_Chk01オペレーション.<p>
	 *
	 * Upd01更新オペレーションの実行前チェックを行う<br>
	 */
	public class ReExtHst_Chk01 extends MSBCL_ReExtHstService_MC_A.ReExtHst_Chk01 {

		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			for (ReExtHst_Chk01_DtlR r : up0()) {
				// エラーフラグをオフ
				r.err_flg(false);
				// 反映順の大小チェック
				checkRefOrd(r);
				// 下り電文の設定
				setDown();
			}
		}

		/**
		 * 同一製造指図ＮＯで反映順が大きいレコードが存在するかどうかのチェックを行う
		 * @param 上り電文
		 */
		protected void checkRefOrd(ReExtHst_Chk01_DtlR r) {
			// 製造指図再展開履歴の抽出
			MCList<MST_RE_EXT_HST_R> cntL = MCList.create(MST_RE_EXT_HST_R.class);
			MST_RE_EXT_HST_R t = MST_RE_EXT_HST_R.create("T");
			MCQueryApiBuilder cntL_bldr = MCQueryApiBuilder.create(t);
			cntL_bldr.setWhere(t.mfg_inst_no.eq(bind("1")), r.mfg_inst_no());
			cntL_bldr.addWhereWithAnd(t.ref_ord.gt(bind("1")), r.ref_ord());
			dbSelect("MSBCL6140_MST_RE_EXT_HST_S01", cntL, cntL_bldr, r);
			// 自身の反映順より大きな反映順のレコードが存在する場合、メッセージプールに「新しい変更が存在します。再検索してください。」を出力
			if (cntL.size() > 0) {
				MCMessagePool.add(new MCMessage(r, null, MSBCL0029, r.mfg_inst_no(), toDispGUIIndex(r)));
				r.err_flg(true);
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * ReExtHst_Ins01オペレーション.<p>
	 *
	 * 製造再展開履歴を新規登録する<br>
	 */
	public class ReExtHst_Ins01 extends MSBCL_ReExtHstService_MC_A.ReExtHst_Ins01 {

		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			// 製造再展開履歴の登録
			insReExtHst();
		}

		/**
		 * 上り電文の内容で製造再展開履歴を登録
		 */
		protected void insReExtHst() {
			MCList<MST_RE_EXT_HST_R> insL = MCList.create(MST_RE_EXT_HST_R.class);
			addAll(insL, up0(), createMap_MST_RE_EXT_HST_R_ReExtHst_Ins01_DtlR());
			dbInsert("MSBCL6140_MST_RE_EXT_HST_I01", insL,
					MCQueryApiBuilder.create(MST_RE_EXT_HST_R.create("T")));
		}

		protected Map_MST_RE_EXT_HST_R_ReExtHst_Ins01_DtlR<MST_RE_EXT_HST_R,ReExtHst_Ins01_DtlR> createMap_MST_RE_EXT_HST_R_ReExtHst_Ins01_DtlR() {
			return new Map_MST_RE_EXT_HST_R_ReExtHst_Ins01_DtlR<MST_RE_EXT_HST_R, ReExtHst_Ins01_DtlR>();
		}

		public class Map_MST_RE_EXT_HST_R_ReExtHst_Ins01_DtlR<D extends MST_RE_EXT_HST_R, S extends ReExtHst_Ins01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_RE_EXT_HST_R.$mfg_inst_no, ReExtHst_Ins01_DtlR.$mfg_inst_no);
				addColumnPathMap(MST_RE_EXT_HST_R.$ref_ord, ReExtHst_Ins01_DtlR.$ref_ord);
				addColumnPathMap(MST_RE_EXT_HST_R.$re_ext_typ, ReExtHst_Ins01_DtlR.$re_ext_typ);
				addColumnPathMap(MST_RE_EXT_HST_R.$chng_no, ReExtHst_Ins01_DtlR.$chng_no);
				addColumnPathMap(MST_RE_EXT_HST_R.$oper_chng_flg, ReExtHst_Ins01_DtlR.$oper_chng_flg);
				addColumnPathMap(MST_RE_EXT_HST_R.$plm_cnt_rmrks, ReExtHst_Ins01_DtlR.$plm_cnt_rmrks);
				addColumnPathMap(MST_RE_EXT_HST_R.$sub_char1, ReExtHst_Ins01_DtlR.$sub_char1);
				addColumnPathMap(MST_RE_EXT_HST_R.$sub_char2, ReExtHst_Ins01_DtlR.$sub_char2);
				addColumnPathMap(MST_RE_EXT_HST_R.$sub_char3, ReExtHst_Ins01_DtlR.$sub_char3);
			}
		}
	}

	/**
	 * ReExtHst_Upd01オペレーション.<p>
	 *
	 * 製造指図再展開履歴を更新する<br>
	 */
	public class ReExtHst_Upd01 extends MSBCL_ReExtHstService_MC_A.ReExtHst_Upd01 {

		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			// 製造再展開履歴の更新
			updReExtHst();
		}

		/**
		 * 上り電文の内容で製造再展開履歴を更新
		 */
		protected void updReExtHst() {
			MCList<MST_RE_EXT_HST_R> updL = MCList.create(MST_RE_EXT_HST_R.class);
			MST_RE_EXT_HST_R t = MST_RE_EXT_HST_R.create("T");
			MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
			addAll(updL, up0(), createMap_MST_RE_EXT_HST_R_ReExtHst_Upd01_DtlR());
			updL_bldr.setSet(t.mfg_inst_rev, t.re_ext_typ, t.intr_rmrks, t.sub_char1, t.sub_char2, t.sub_char3);
			dbUpdateKey("MSBCL6140_MST_RE_EXT_HST_U01", updL, updL_bldr);
		}

		protected Map_MST_RE_EXT_HST_R_ReExtHst_Upd01_DtlR<MST_RE_EXT_HST_R,ReExtHst_Upd01_DtlR> createMap_MST_RE_EXT_HST_R_ReExtHst_Upd01_DtlR() {
			return new Map_MST_RE_EXT_HST_R_ReExtHst_Upd01_DtlR<MST_RE_EXT_HST_R, ReExtHst_Upd01_DtlR>();
		}

		public class Map_MST_RE_EXT_HST_R_ReExtHst_Upd01_DtlR<D extends MST_RE_EXT_HST_R, S extends ReExtHst_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_RE_EXT_HST_R.$mfg_inst_no, ReExtHst_Upd01_DtlR.$mfg_inst_no);
				addColumnPathMap(MST_RE_EXT_HST_R.$ref_ord, ReExtHst_Upd01_DtlR.$ref_ord);
				addColumnPathMap(MST_RE_EXT_HST_R.$mfg_inst_rev, ReExtHst_Upd01_DtlR.$mfg_inst_rev);
				addColumnPathMap(MST_RE_EXT_HST_R.$re_ext_typ, ReExtHst_Upd01_DtlR.$re_ext_typ);
				addColumnPathMap(MST_RE_EXT_HST_R.$intr_rmrks, ReExtHst_Upd01_DtlR.$intr_rmrks);
				addColumnPathMap(MST_RE_EXT_HST_R.$sub_char1, ReExtHst_Upd01_DtlR.$sub_char1);
				addColumnPathMap(MST_RE_EXT_HST_R.$sub_char2, ReExtHst_Upd01_DtlR.$sub_char2);
				addColumnPathMap(MST_RE_EXT_HST_R.$sub_char3, ReExtHst_Upd01_DtlR.$sub_char3);
			}
		}
	}

	//FMCB CUSTOM END
}