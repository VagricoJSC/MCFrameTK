package mcframe.serverMSBD.MSBDL5060;

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
import mcframe.serverMAUC.MAUCL5020.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMBBA.MBBAL5020.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBD.MSBDL5060.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBD.MSBDL5200.*;
import mcframe.serverMSLA.MSLAL5020.*;
import mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR;;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBDL_PurcAprvAfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBDL_PurcAprvAfService_MC extends MSBDL_PurcAprvAfService_MC_A{
	//FMCB CUSTOM START
	
	protected MCList<MST_PO_R> _lockPoL = null;

	protected MCIndexKey _poKey = null;



	/**
	 * AppAfService_Upd01オペレーション.<p>
	 *
	 * 発注データ承認後に実行する処理を行う。<br>
	 */
	public class PurcAppAf_Upd01 extends MSBDL_PurcAprvAfService_MC_A.PurcAppAf_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			if (up0().isEmpty()) {
				return;
			}

			lockPo(up0());
			// 発注.承認状況区分更新
			updPoAprv();
			// EDI注文書IFサービス更新
			callEDIPrntIfSrv();
			callPurcPrntUpd01();
			callPurcPrntUpd02();

		}

		/**
		 * キャッシュ作成（発注ヘッダ）
		 * @param r
		 */
		protected void lockPo(MCList<AprvAfter_Upd01_CndR> dtlL) {
			_lockPoL = MCList.create(MST_PO_R.class);
			MST_PO_R t = MST_PO_R.create("T");
			MCQueryApiBuilder lockPoL_bldr = MCQueryApiBuilder.create(t);
			lockPoL_bldr.setSelect(t.po_no);
			lockPoL_bldr.addSelect(t.po_rev);
			lockPoL_bldr.setWhere(t.po_no.eq(bind("aprv_src_no1")));
			lockPoL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelectForUpdateNoWait("MSBDL5060_MST_PO_S01", _lockPoL, lockPoL_bldr, dtlL.groupBy(AprvAfter_Upd01_CndR.$aprv_src_no1));
			// can_flg='0'で最新リビジョンのみ取得
			_poKey = _lockPoL.createIndex(MST_PO_R.$po_no);
		
		}
		protected MST_PO_R getLockPoR(AprvAfter_Upd01_CndR r) {
			return _lockPoL.getFirst(_poKey, r.aprv_src_no1());
		}

		/**
		 * 発注.承認状況区分を更新する
		 */
		protected void updPoAprv() {
			MCList<MST_PO_R> poL = MCList.create(MST_PO_R.class);
			for (AprvAfter_Upd01_CndR r : up0()) {
				MST_PO_R poR = getLockPoR(r);
				poR.aprv_sts_typ(r.aprv_sts_typ());
				poL.add(poR);
			}
			MST_PO_R t = MST_PO_R.create("T");
			MCQueryApiBuilder poL_bldr = MCQueryApiBuilder.create(t);
			poL_bldr.setSet(t.aprv_sts_typ);
			dbUpdateKey("MSBDL5060_MST_PO_U01", poL, poL_bldr);

			// 発注ヘッダ（改訂履歴）登録
			callRevDataServiceIns01(poL);
		
		}

		/**
		 * 改訂履歴データ更新サービスの改訂履歴データ更新リスト登録処理を呼び出す。
		 * 発注ヘッダ改訂履歴テーブルを更新する。
		 * @param poL
		 */
		protected void callRevDataServiceIns01(MCList<MST_PO_R> poL) {
			MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
			for (MST_PO_R r : poL) {
				RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
				opeR.rev_data_src_no(r.po_no());
				opeR.rev_no(r.po_rev());
				opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_PO.value());
				ope.up0().add(opeR);
			}
			ope.exec();
		}

		/**
		 * // EDI注文書IFサービス更新を呼出す
		 */
		protected void callEDIPrntIfSrv() {
			MCList<AprvAfter_Upd01_CndR> tgtL = MCList.create(AprvAfter_Upd01_CndR.class);
			for (AprvAfter_Upd01_CndR tgtR : up0()) {
				// ＩＦデータを送信しない状態から送信しない状態へ遷移する場合は、発注送信ＩＦを実行しない。
				// (ＩＦデータを送信する状態から送信しない状態へ遷移する場合は、取消のデータを送信する場合があるので、発注送信ＩＦを実行する）
				// 未承認 → 一次承認済
				// 一次承認済　→　未承認
				// 未承認 → 却下
				// 一次承認済 → 否認
				// 一次承認済 → 却下
				// 否認　→　一次承認済
				if (MAC_APRV_STS_TYP.isOPN(tgtR.old_aprv_sts_typ()) && MAC_APRV_STS_TYP.isFIX(tgtR.aprv_sts_typ()) ||
						MAC_APRV_STS_TYP.isFIX(tgtR.old_aprv_sts_typ()) && MAC_APRV_STS_TYP.isOPN(tgtR.aprv_sts_typ()) ||
						MAC_APRV_STS_TYP.isOPN(tgtR.old_aprv_sts_typ()) && MAC_APRV_STS_TYP.isRJCT(tgtR.aprv_sts_typ()) ||
						MAC_APRV_STS_TYP.isFIX(tgtR.old_aprv_sts_typ()) && MAC_APRV_STS_TYP.isLAST_RJCT(tgtR.aprv_sts_typ()) ||
						MAC_APRV_STS_TYP.isFIX(tgtR.old_aprv_sts_typ()) && MAC_APRV_STS_TYP.isRJCT(tgtR.aprv_sts_typ()) ||
						MAC_APRV_STS_TYP.isLAST_RJCT(tgtR.old_aprv_sts_typ()) && MAC_APRV_STS_TYP.isFIX(tgtR.aprv_sts_typ())) {
					continue;
				}	
				tgtL.add(tgtR);
			}
			
			MSLAL_PoSendIfService.PoSendIf_Upd01 o = MSLAL_PoSendIfService.crtPoSendIf_Upd01();
			addAll(o.up0(), tgtL, createMapPoSendIf());
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}

		protected MapPoSendIf<PoSendIf_Upd01_DtlR,AprvAfter_Upd01_CndR> createMapPoSendIf() {
			return new MapPoSendIf<PoSendIf_Upd01_DtlR, AprvAfter_Upd01_CndR>();
		}

		public class MapPoSendIf<D extends PoSendIf_Upd01_DtlR, S extends AprvAfter_Upd01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PoSendIf_Upd01_DtlR.$po_no, AprvAfter_Upd01_CndR.$aprv_src_no1);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.is_src_aprvaf_srv_flg(true);
			}
		}
				protected void callPurcPrntUpd01() {
					MSBDL_PurcPrntService.PurcPrnt_Upd01 ope = MSBDL_PurcPrntService.crtPurcPrnt_Upd01();
					for (AprvAfter_Upd01_CndR r : up0()) {
						if (MAC_APRV_STS_TYP.isACPT(r.aprv_sts_typ())
							|| MAC_APRV_STS_TYP.isACPT(r.old_aprv_sts_typ())) {
							
							// 変更後が最終承認済み⇒納品伝票を作成する
							// 変更前が最終承認済み⇒納品伝票を削除する
							copy(ope.up0().add(), r, createMap_PurcPrnt_Upd01_HdrR_AprvAfter_Upd01_CndR());
							ope.up1().indiv_prnt_flg(false);
						}
					}
					ope.exec();
				}
				protected Map_PurcPrnt_Upd01_HdrR_AprvAfter_Upd01_CndR<PurcPrnt_Upd01_HdrR,AprvAfter_Upd01_CndR> createMap_PurcPrnt_Upd01_HdrR_AprvAfter_Upd01_CndR() {
					return new Map_PurcPrnt_Upd01_HdrR_AprvAfter_Upd01_CndR<PurcPrnt_Upd01_HdrR, AprvAfter_Upd01_CndR>();
				}

				public class Map_PurcPrnt_Upd01_HdrR_AprvAfter_Upd01_CndR<D extends PurcPrnt_Upd01_HdrR, S extends AprvAfter_Upd01_CndR> extends MCRowMapper<D,S>{
					@Override
					protected void valueCopy(D dest, S src) {
						super.valueCopy(dest, src);
						dest.peg_no(src.peg_no());
						dest.po_no(src.aprv_src_no1());
						dest.purc_dlv_slip_src_typ(MSC_PURC_DLV_SLIP_SRC_TYP.PO.value());
						if (MAC_APRV_STS_TYP.isACPT(src.aprv_sts_typ())) {
							dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
						}
						else if (MAC_APRV_STS_TYP.isACPT(src.old_aprv_sts_typ())) {
							dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						}
						dest.dlv_slip_prnt_flg(false);
					}
				}
		protected void callPurcPrntUpd02() {
			MSBDL_PurcPrntService.PurcPrnt_Upd02 ope = MSBDL_PurcPrntService.crtPurcPrnt_Upd02();
			for (AprvAfter_Upd01_CndR r : up0()) {
				if (MAC_APRV_STS_TYP.isACPT(r.aprv_sts_typ())
					|| MAC_APRV_STS_TYP.isACPT(r.old_aprv_sts_typ())) {
					
					// 変更後が最終承認済み⇒納品伝票を作成する
					// 変更前が最終承認済み⇒納品伝票を削除する
					copy(ope.up0().add(), r, createMap_PurcPrnt_Upd02_HdrR_AprvAfter_Upd01_CndR());
				}
			}
			ope.exec();
		}
		protected Map_PurcPrnt_Upd02_HdrR_AprvAfter_Upd01_CndR<PurcPrnt_Upd02_HdrR,AprvAfter_Upd01_CndR> createMap_PurcPrnt_Upd02_HdrR_AprvAfter_Upd01_CndR() {
			return new Map_PurcPrnt_Upd02_HdrR_AprvAfter_Upd01_CndR<PurcPrnt_Upd02_HdrR, AprvAfter_Upd01_CndR>();
		}
		public class Map_PurcPrnt_Upd02_HdrR_AprvAfter_Upd01_CndR<D extends PurcPrnt_Upd02_HdrR, S extends AprvAfter_Upd01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.hdr_peg_no(src.peg_no());
				dest.po_no(src.aprv_src_no1());
				
				if (MAC_APRV_STS_TYP.isACPT(src.aprv_sts_typ())) {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if (MAC_APRV_STS_TYP.isACPT(src.old_aprv_sts_typ())) {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				
				dest.dlv_slip_prnt_flg(false);
				dest.indiv_prnt_flg(false);
			}
		}
	}

	//FMCB CUSTOM END
}