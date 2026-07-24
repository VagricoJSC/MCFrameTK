package mcframe.serverMSBH.MSBHL5060;

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
import static mcframe.serverMSBH.MSBHL5060.Query.*;
import mcframe.serverMSBH.MSBHL5010.MSBHL_ApUtil;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBHL_PaySchdIfCrtService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBHL_PaySchdIfCrtService_MC extends MSBHL_PaySchdIfCrtService_MC_A{
	//FMCB CUSTOM START

	/**
	 * PaySchdIfCrt_Ins01オペレーション.<p>
	 *
	 * 支払予定、支払手形の情報をもとに支払予定ＩＦを作成する。<br>
	 */
	public class PaySchdIfCrt_Ins01
			extends MSBHL_PaySchdIfCrtService_MC_A.PaySchdIfCrt_Ins01 {
		
		protected MCList<PaySchdIfCrt_Ins01_PaySchdR> _paySchdL;
		protected MCList<MST_PAY_SCHD_IF_R> _paySchdIfL;
		protected MCIndexKey _paySchdLIdx;
		protected MCIndexKey _paySchdIfLIdx;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			write();
		}

		/**
		 * 支払予定データから支払予定IFデータを作成し、テーブルに書き込む
		 * 
		 */
		protected void write() {
			MCList<MST_PAY_SCHD_IF_R> insL = MCList.create(MST_PAY_SCHD_IF_R.class);
			// ワークを作成し、対象の支払予定データを取得する。
			setPaySchdData();
			// 支払予定の支払予定管理先の取引先情報を取得する。
			setBspplBp();
			// 支払予定データ作成
			for (PaySchdIfCrt_Ins01_CndR r : up0()) {
				setIfDataForPaySchd(r, insL);
			}
			// データNO、データ行NOを取得
			setDataNo(insL);
			// 支払予定ＩＦに登録
			MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_PAY_SCHD_IF_R.create("T"));
			dbInsert("MSBHL5060_MST_PAY_SCHD_IF_I01", insL, insL_bldr);
		}
		
		
		/**
		 * ワークを作成し、対象の支払予定データ、支払予定IFデータを取得する。
		 * 
		 */
		protected void setPaySchdData() {
			// 変数の初期化
			MCList<MST_AP_APPL_SCHD_R> bind = MCList.create(MST_AP_APPL_SCHD_R.class);
			_paySchdL = MCList.create(PaySchdIfCrt_Ins01_PaySchdR.class);
			_paySchdIfL = MCList.create(MST_PAY_SCHD_IF_R.class);
			
			// ワークを作成する。
			for (PaySchdIfCrt_Ins01_CndR r : up0()) {
				bind.add().ap_appl_schd_no(r.ap_appl_schd_no());
			}
			MCQueryApiBuilder bind_bldr = MCQueryApiBuilder.create(MST_AP_APPL_SCHD_R.create("T"));
			dbWkDelete("MSBHL5060_MSW_AP_APPL_SCHD_D01", bind_bldr.getBaseDbc());
			dbWkInsert("MSBHL5060_MSW_AP_APPL_SCHD_I01", bind, bind_bldr.getBaseDbc());
			// 対象の支払予定情報を検索
			executeQuery(_paySchdL, MSBHL5060_MST_AP_APPL_SCHD_SO1());
			// 対象の前回の支払予定IFデータを取得
			executeQuery(_paySchdIfL, MSBHL5060_MST_PAY_SCHD_IF_SO1());
			
			// ワーク削除
			dbWkDelete("MSBHL5060_MSW_AP_APPL_SCHD_D02", bind_bldr.getBaseDbc());

			// インデックスを作成
			_paySchdLIdx = _paySchdL.createIndex(PaySchdIfCrt_Ins01_PaySchdR.$ap_appl_schd_no);
			_paySchdIfLIdx = _paySchdIfL.createIndex(PaySchdIfCrt_Ins01_PaySchdR.$ap_appl_schd_no);
		}
		
		/**
		 * 支払予定の支払予定管理先の取引先情報を取得する。
		 * 
		 */
		protected void setBspplBp() {
			MCList<MAM_BP_R> bpL = MCList.create(MAM_BP_R.class);
			MCList<MAM_BP_R> bpCndL = MCList.create(MAM_BP_R.class);
			for (PaySchdIfCrt_Ins01_PaySchdR r : _paySchdL) {
				// 取引先マスタのキャッシュ対象
				bpCndL.add().bp_cd(r.bsppl_cd());
			}

			// 取引先情報をキャッシュする
			MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(MAM_BP_R.create("T"));
			dbSelectKey("MSBHL5060_MAM_BP_S01", bpL, bpL_bldr, bpCndL.groupBy(MAM_BP_R.$bp_cd));
			MSBHL_ApUtil.setBp(bpL);
		}
		

		/**
		 * 支払予定データを作成する。
		 * 
		 * @param r 買掛消込予定データ
		 * @param insL 追加用IFデータリスト
		 */
		protected void setIfDataForPaySchd(PaySchdIfCrt_Ins01_CndR r,
				MCList<MST_PAY_SCHD_IF_R> insL) {
			// 支払予定情報を検索し、paySchdRに格納
			PaySchdIfCrt_Ins01_PaySchdR paySchdR = _paySchdL.getFirst(_paySchdLIdx, r.ap_appl_schd_no());
			
			// 金額がNULLの場合はＩＦデータを作成しない
			if (isNull(paySchdR.trd_cur_amt())) {
				return;
			}
			
			// 債務決済区分が「相殺」「源泉税」の場合、作成しない。
			if(MAC_AP_STTL_TYP.isSETOFF(paySchdR.ap_sttl_typ()) || MAC_AP_STTL_TYP.isWTAX(paySchdR.ap_sttl_typ())) {
				return;
			}

			// 検索結果の承認情報を元にデータ更新区分を設定する。	
			setDataCrudTyp(r, paySchdR);

			// データ更新区分がNULLの場合、データ作成の対象ではないとみなし、処理を終了する。
			if (isNull(r.data_crud_typ())) {
				return;
			}

			// 検索結果をMST_PAY_SCHD_IF_Rに格納
			MST_PAY_SCHD_IF_R dest = MST_PAY_SCHD_IF_R.create();
			copy(dest, paySchdR, createWritePayMapper());

			// 検索結果以外の情報を格納する。
			dest.data_crud_typ(r.data_crud_typ());
			// 支払債務区分を設定する。(前渡金依頼ができるまで債務区分=支払債務区分)
			dest.pay_ap_typ(paySchdR.ap_typ());

			insL.add(dest);
		}

		/**
		 * データ更新区分を設定する。
		 * データを作成しないパターンの場合、データ更新区分はNULLのまま、処理を返す
		 * 
		 * @param r 買掛消込予定データ
		 * @param paySchdR 買掛消込予定データに紐づく支払予定情報
		 */
		protected void setDataCrudTyp(PaySchdIfCrt_Ins01_CndR r,
				PaySchdIfCrt_Ins01_PaySchdR paySchdR) {
			MAC_DATA_CRUD_TYP dataCrudTyp = null;
			MST_PAY_SCHD_IF_R oldSchdIfR = _paySchdIfL.getFirst(_paySchdIfLIdx, r.ap_appl_schd_no());

			if (isNull(oldSchdIfR)) {
				// 前回IFデータが存在しない
				// このとき以下のパターンのとき、データ更新区分を設定する。
				// ・上り電文のデータ更新区分が「新規」かつ対象の支払予定データの承認ステータスが「承認済」相当
				// ・上り電文のデータ更新区分が「更新」かつ対象の支払予定データの承認ステータスが「承認済」相当
				// ・上り電文のデータ更新区分が未設定かつ対象の支払予定データの承認ステータスが「承認済」相当

				// 上り電文のデータ更新区分が「新規」かつ対象の支払予定データの承認ステータスが「承認済」相当
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) && isACPT(paySchdR)) {
					dataCrudTyp = MAC_DATA_CRUD_TYP.CRT;
				}
				// 上り電文のデータ更新区分が「更新」かつ対象の支払予定データの承認ステータスが「承認済」相当
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()) && isACPT(paySchdR)) {
					dataCrudTyp = MAC_DATA_CRUD_TYP.CRT;
				}
				// 上り電文のデータ更新区分が未設定かつ対象の支払予定データの承認ステータスが「承認済」相当
				if (isNull(r.data_crud_typ()) && isACPT(paySchdR)) {
					dataCrudTyp = MAC_DATA_CRUD_TYP.CRT;
				}

			}
			else if (MAC_DATA_CRUD_TYP.isDEL(oldSchdIfR.data_crud_typ())) {
				// 前回IFデータのデータ更新区分が削除
				// このとき以下のパターンのとき、データ更新区分を設定する。
				// ・上り電文のデータ更新区分が「更新」かつ対象の支払予定データの承認ステータスが「承認済」相当
				// ・上り電文のデータ更新区分が未設定かつ対象の支払予定データの承認ステータスが「承認済」相当

				// 上り電文のデータ更新区分が「更新」かつ対象の支払予定データの承認ステータスが「承認済」相当
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()) && isACPT(paySchdR)) {
					dataCrudTyp = MAC_DATA_CRUD_TYP.CRT;
				}
				// 上り電文のデータ更新区分が未設定かつ対象の支払予定データの承認ステータスが「承認済」相当
				if (isNull(r.data_crud_typ()) && isACPT(paySchdR)) {
					dataCrudTyp = MAC_DATA_CRUD_TYP.CRT;
				}

			}
			else if (MAC_DATA_CRUD_TYP.isCRT(oldSchdIfR.data_crud_typ())
					|| MAC_DATA_CRUD_TYP.isUPD(oldSchdIfR.data_crud_typ())) {
				// 前回IFデータのデータ更新区分が新規、更新
				// このとき以下のパターンのとき、データ更新区分を設定する。
				// ・上り電文のデータ更新区分が「更新」かつ対象の支払予定データの承認ステータスが「未承認」相当
				// ・上り電文のデータ更新区分が「更新」かつ対象の支払予定データの承認ステータスが「承認済」相当
				// ・上り電文のデータ更新区分が「削除」かつ対象の支払予定データの承認ステータスが「承認済」相当
				// ・上り電文のデータ更新区分が未設定かつ対象の支払予定データの承認ステータスが「未承認」相当
				// ・上り電文のデータ更新区分が未設定かつ対象の支払予定データの承認ステータスが「却下」相当
				// ・上り電文のデータ更新区分が未設定かつ対象の支払予定データの承認ステータスが「承認済」相当

				// 上り電文のデータ更新区分が「更新」かつ対象の支払予定データの承認ステータスが「未承認」相当
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()) && isOPN(paySchdR)) {
					dataCrudTyp = MAC_DATA_CRUD_TYP.DEL;
				}
				// 上り電文のデータ更新区分が「更新」かつ対象の支払予定データの承認ステータスが「承認済」相当
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()) && isACPT(paySchdR)) {
					dataCrudTyp = MAC_DATA_CRUD_TYP.UPD;
				}
				// 上り電文のデータ更新区分が「削除」かつ対象の支払予定データの承認ステータスが「承認済」相当
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) && isACPT(paySchdR)) {
					dataCrudTyp = MAC_DATA_CRUD_TYP.DEL;
				}
				// 上り電文のデータ更新区分が未設定かつ対象の支払予定データの承認ステータスが「未承認」相当
				if (isNull(r.data_crud_typ()) && isOPN(paySchdR)) {
					dataCrudTyp = MAC_DATA_CRUD_TYP.DEL;
				}
				// 上り電文のデータ更新区分が未設定かつ対象の支払予定データの承認ステータスが「却下」相当
				if (isNull(r.data_crud_typ()) && isRJCT(paySchdR)) {
					dataCrudTyp = MAC_DATA_CRUD_TYP.DEL;
				}
				// 上り電文のデータ更新区分が未設定かつ対象の支払予定データの承認ステータスが「承認済」相当
				if (isNull(r.data_crud_typ()) && isACPT(paySchdR)) {
					dataCrudTyp = MAC_DATA_CRUD_TYP.UPD;
				}
			}
			else {
				// 本来ここには来ない想定
				r.data_crud_typ(null);
				return;
			}
			if (dataCrudTyp == null) {
				r.data_crud_typ(null);
			}
			else {
				r.data_crud_typ(dataCrudTyp.value());
			}
		}

		/**
		 *  データNOとデータ行NOを発番し、追加用IFデータリストに設定する
		 * @param insL 追加用IFデータリスト
		 */
		protected void setDataNo(MCList<MST_PAY_SCHD_IF_R> insL) {
			// 支払予定ＩＦＮＯ発番
			doSeqCache(MSC_NUM_SYS_TYP.PAYSCHDIF, insL.size());
			for (MST_PAY_SCHD_IF_R r : insL) {
				r.pay_schd_if_no(getStrSeq(MSC_NUM_SYS_TYP.PAYSCHDIF));
			}
		}

		/**
		 * 支払予定ＩＦデータ設定用マッパー<br />
		 * このマッパーはMST_PAY_SCHD_IF_R（テーブル）とPaySchdIfCrt_Ins01_PaySchdR(検索結果)のマッパーのため
		 * 検索結果の項目名=テーブルの項目名を想定している。
		 * @return MapWritePay
		 */
		protected MapWritePay<MST_PAY_SCHD_IF_R, PaySchdIfCrt_Ins01_PaySchdR> createWritePayMapper() {
			return new MapWritePay<MST_PAY_SCHD_IF_R, PaySchdIfCrt_Ins01_PaySchdR>();
		}

		/**
		 * 支払予定ＩＦデータ設定用マッパークラス
		 *
		 * @param <D>
		 * @param <S>
		 */
		public class MapWritePay<D extends MST_PAY_SCHD_IF_R, S extends PaySchdIfCrt_Ins01_PaySchdR>
				extends MCRowMapper<D, S> {

			@Override
			protected void setupColumnPathMap() {
				for (String col : MST_PAY_SCHD_IF_R.colnames()) {
					addColumnPathMap(col, col);
				}
			}

			@Override
			public void valueCopy(D dest, S src) {
				// 全処理共通の以下の項目のみ先に設定処理を行う(他は検索結果のコピー)				
				// 自社の仕入為替レートCDを設定する。
				dest.xrate_cd(getCo().purc_xrate_cd());
				// 支払予定管理先部門からワーキンググループCDを設定する。
				dest.wg_cd(MSBHL_ApUtil.getWgCd(src.bsppl_dpt_cd(), src.ac_dt()));
				// 計上日の年月を設定する。
				dest.ac_ym(getAcYm(src.ac_dt()));
				//　基準通貨、基準通貨金額を設定
				dest.base_cur_cd(getCo().base_cur_cd());
				dest.base_cur_amt(convToBaseCur(src.trd_cur_amt(), src.xrate(),
						getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ()));
				// 支払予定管理先から支払い先を設定する。
				dest.psppl_cd(MSBHL_ApUtil.getBp(src.bsppl_cd()).psppl_cd());
				// 支払先から国外フラグを設定する。
				dest.foreign_flg(MSBHL_ApUtil.isForeign(dest.psppl_cd()));
				// 会計IF取込済ＦＬＧを設定
				dest.a_imp_flg(false);

				// 以下は標準では連携対象としないため、NULLを設定
				dest.sub_dpt_cd1(null);
				dest.sub_dpt_cd2(null);
				dest.sub_dpt_cd3(null);
				dest.sub_char1(null);
				dest.sub_char2(null);
				dest.sub_char3(null);
				dest.sub_char4(null);
				dest.sub_char5(null);
				dest.sub_char6(null);
				dest.sub_char7(null);
				dest.sub_char8(null);
				dest.sub_char9(null);
				dest.sub_char10(null);
				dest.sub_num1(null);
				dest.sub_num2(null);
				dest.sub_num3(null);
				dest.sub_dt1(null);
				dest.sub_dt2(null);
				dest.sub_dt3(null);
			}
		}

		/**
		 * 引数のデータが承認済みかどうかを返す
		 * 承認対象外は承認済とみなす。
		 * @param paySchdR 支払予定データ
		 * @return 判定結果
		 */
		protected boolean isACPT(PaySchdIfCrt_Ins01_PaySchdR paySchdR) {
			return !paySchdR.aprv_flg()
					|| MAC_APRV_STS_TYP.isACPT(paySchdR.aprv_sts_typ());
		}

		/**
		 * 引数のデータが未承認、一次承認済みかどうかを返す
		 * 承認対象外は承認済とみなす。
		 * @param paySchdR　支払予定データ
		 * @return　判定結果
		 */
		protected boolean isOPN(PaySchdIfCrt_Ins01_PaySchdR paySchdR) {
			return paySchdR.aprv_flg() && (MAC_APRV_STS_TYP.isFIX(paySchdR.aprv_sts_typ())
					|| MAC_APRV_STS_TYP.isOPN(paySchdR.aprv_sts_typ()));
		}

		/**
		 * 引数のデータが却下、否認かどうかを返す
		 * 承認対象外は承認済とみなす。
		 * @param paySchdR　支払予定データ
		 * @return　判定結果
		 */
		protected boolean isRJCT(PaySchdIfCrt_Ins01_PaySchdR paySchdR) {
			return paySchdR.aprv_flg()
					&& (MAC_APRV_STS_TYP.isRJCT(paySchdR.aprv_sts_typ())
							|| MAC_APRV_STS_TYP.isLAST_RJCT(paySchdR.aprv_sts_typ()));
		}

	}

	//FMCB CUSTOM END
}