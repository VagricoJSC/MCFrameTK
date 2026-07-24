package mcframe.serverMSBB.MSBBL0010;

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
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBB.MSBBL0010.*; // このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBB.MSBBL0010.Query.*;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil;
import mcframe.commonFXUC.FXUCC0030.FXUCC_Divide;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0170.FXUCL_DuplicateValidater;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_CstFrcstReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_CstFrcstReg_MC extends MSBBL_CstFrcstReg_MC_A{
	//FMCB CUSTOM START

	// 品目マスタ・キャッシュ
	protected FXUCL_MCDbcCache<MAM_ITM_R> cacheItm;
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 顧客期間内示ヘッダ、顧客期間内示明細を検索する<br>
	 */
	public class Srch01 extends MSBBL_CstFrcstReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			srchCstFrcstHdr();
			if (down0().isEmpty()) {
				return;
			}

			srchCstFrcstDtl();
			if (down1().isEmpty()) {
				down0().clear();
			}
		}

		/** 顧客期間内示ヘッダを取得する。 */
		protected void srchCstFrcstHdr() {
			executeQuery(down0(), MSBBL0010_MST_CST_FRCST_H_S01(), up0());
		}

		/** 顧客期間内示明細を取得する。 */
		protected void srchCstFrcstDtl() {
			executeQuery(down1(), MSBBL0010_MST_CST_FRCST_D_S01(), up0());
			
			//参考情報を取得
			if (!down1().isEmpty()){
				getSprtInfo();
			}
		}
		
		/** 前回顧客期間内示情報、販売計画数量、受注数量を取得する */
		protected void getSprtInfo(){
			
			MSBBL_CstFrcstReg.Sprt01 ope = MSBBL_CstFrcstReg.crtSprt01();
			copy( ope.up0(), down0() , createMap_Sprt01_HdrR_Srch01_HdrR());
			addAll(ope.up1(), down1(), createMap_Sprt01_DtlR_Srch01_DtlR());
			
			ope.exec();
			
			MCJoinKey<MCList<Sprt01_DtlR>> jk = down1().join(Srch01_DtlR.$cst_frcst_d_no , ope.down0() , Sprt01_DtlR.$cst_frcst_d_no);
			join(down1(),jk, createMap_Srch01_DtlR_Sprt01_DtlR());
		}
		
		/** Srch01_HdrR ⇒  Sprt01_HdrR */
		protected Map_Sprt01_HdrR_Srch01_HdrR<Sprt01_HdrR,Srch01_HdrR> createMap_Sprt01_HdrR_Srch01_HdrR() {
			return new Map_Sprt01_HdrR_Srch01_HdrR<Sprt01_HdrR, Srch01_HdrR>();
		}

		public class Map_Sprt01_HdrR_Srch01_HdrR<D extends Sprt01_HdrR, S extends Srch01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Sprt01_HdrR.$cst_cd, Srch01_HdrR.$cst_cd);
				addColumnPathMap(Sprt01_HdrR.$dlv_cd, Srch01_HdrR.$dlv_cd);
				addColumnPathMap(Sprt01_HdrR.$frcst_dpt_cd, Srch01_HdrR.$frcst_dpt_cd);
				addColumnPathMap(Sprt01_HdrR.$wrk_no, Srch01_HdrR.$wrk_no);
				addColumnPathMap(Sprt01_HdrR.$rcpt_dt, Srch01_HdrR.$rcpt_dt);
				addColumnPathMap(Sprt01_HdrR.$cst_frcst_no, Srch01_HdrR.$cst_frcst_no);

			}
		}
		
		/** Srch01_DtlR ⇒  Sprt01_DtlR */
		protected Map_Sprt01_DtlR_Srch01_DtlR<Sprt01_DtlR,Srch01_DtlR> createMap_Sprt01_DtlR_Srch01_DtlR() {
			return new Map_Sprt01_DtlR_Srch01_DtlR<Sprt01_DtlR, Srch01_DtlR>();
		}

		public class Map_Sprt01_DtlR_Srch01_DtlR<D extends Sprt01_DtlR, S extends Srch01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Sprt01_DtlR.$itm_cd, Srch01_DtlR.$itm_cd);
				addColumnPathMap(Sprt01_DtlR.$itm_sub1, Srch01_DtlR.$itm_sub1);
				addColumnPathMap(Sprt01_DtlR.$itm_sub2, Srch01_DtlR.$itm_sub2);
				addColumnPathMap(Sprt01_DtlR.$itm_sub3, Srch01_DtlR.$itm_sub3);
				addColumnPathMap(Sprt01_DtlR.$frcst_period_typ, Srch01_DtlR.$frcst_period_typ);
				addColumnPathMap(Sprt01_DtlR.$frcst_st_dt, Srch01_DtlR.$frcst_st_dt);
				addColumnPathMap(Sprt01_DtlR.$frcst_end_dt, Srch01_DtlR.$frcst_end_dt);
				addColumnPathMap(Sprt01_DtlR.$frcst_dt, Srch01_DtlR.$frcst_dt);
				addColumnPathMap(Sprt01_DtlR.$trd_unit_cd, Srch01_DtlR.$trd_unit_cd);
				addColumnPathMap(Sprt01_DtlR.$cst_itm_cd, Srch01_DtlR.$cst_itm_cd);
				addColumnPathMap(Sprt01_DtlR.$cst_frcst_d_no, Srch01_DtlR.$cst_frcst_d_no);

			}
		}
		
		/** Sprt01_DtlR ⇒  Srch01_DtlR */
		protected Map_Srch01_DtlR_Sprt01_DtlR<Srch01_DtlR,Sprt01_DtlR> createMap_Srch01_DtlR_Sprt01_DtlR() {
			return new Map_Srch01_DtlR_Sprt01_DtlR<Srch01_DtlR, Sprt01_DtlR>();
		}

		public class Map_Srch01_DtlR_Sprt01_DtlR<D extends Srch01_DtlR, S extends Sprt01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_DtlR.$cst_frcst_d_no, Sprt01_DtlR.$cst_frcst_d_no);
				addColumnPathMap(Srch01_DtlR.$last_qty, Sprt01_DtlR.$last_qty);
				addColumnPathMap(Srch01_DtlR.$last_rcpt_dt, Sprt01_DtlR.$last_rcpt_dt);
				addColumnPathMap(Srch01_DtlR.$last_cst_frcst_prnt_dt, Sprt01_DtlR.$last_cst_frcst_prnt_dt);
				addColumnPathMap(Srch01_DtlR.$spln_qty, Sprt01_DtlR.$spln_qty);
				addColumnPathMap(Srch01_DtlR.$slo_qty, Sprt01_DtlR.$slo_qty);
				
			}
		}
	}

	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 顧客期間内示明細に対する参考情報（前回情報、販売計画数量、受注数量）を取得する<br>
	 */
	public class Sprt01 extends MSBBL_CstFrcstReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 上り電文編集
			editUp();

			//前回内示、販売計画数、受注数量を取得する
			getFrcstRefInfo();

			// 下り電文設定
			setDown();
		}
		
		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			setPegNo(Sprt01_HdrR.$peg_no, up0());
			setPegNo(Sprt01_DtlR.$peg_no, up1());
		}
		
		/**
		 * 前回内示、販売計画数、受注数量を取得する
		 */
		protected void getFrcstRefInfo(){

			MCList<Sprt01_DtlR> srchL = MCList.create(Sprt01_DtlR.class);
			MCList<Sprt01_DtlR> downL = MCList.create(Sprt01_DtlR.class);
			for (Sprt01_DtlR upR : up1()){
				upR.addStringColumn(Sprt01_HdrR.$cst_cd, up0().cst_cd());
				upR.addStringColumn(Sprt01_HdrR.$dlv_cd, up0().dlv_cd());
				upR.addStringColumn(Sprt01_HdrR.$frcst_dpt_cd, up0().frcst_dpt_cd());
				upR.addStringColumn(Sprt01_HdrR.$wrk_no, up0().wrk_no());
				upR.addDateColumn(Sprt01_HdrR.$rcpt_dt, up0().rcpt_dt());
			
				executeQuery(srchL, MSBBL0010_MST_CST_FRCST_D_S02(), upR);
				downL.addAll(srchL);
			}
			String[] Cols = {
					Sprt01_DtlR.$last_qty , Sprt01_DtlR.$last_rcpt_dt , Sprt01_DtlR.$last_cst_frcst_prnt_dt ,
					Sprt01_DtlR.$spln_qty,	Sprt01_DtlR.$slo_qty};
			copyByPegNo(up1(), Cols, downL, Cols);
		}
		
		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			down0().setAll(up1());
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 顧客期間内示ヘッダ、顧客期間内示明細、顧客期間内示情報を登録・訂正可能かチェックする<br>
	 */
	public class Chk01 extends MSBBL_CstFrcstReg_MC_A.Chk01 {
		protected MST_CST_FRCST_H_R _hdrR = MST_CST_FRCST_H_R.create();
		protected MCList<MST_CST_FRCST_D_R> _dtlL =
			MCList.create(MST_CST_FRCST_D_R.class);

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			// ・lockAndCheckBaseで更新カウンタチェック対象、補完に必要なトランザクションデータを検索する
			// ・エラーがなければcompBaseでトランザクションデータから補完する
			msgL.addAll(lockAndCheckBase());

			if (!msgL.isEmpty()) {
				return msgL;
			}

			compBase();

			return msgL;
		}

		protected MCMessageList lockAndCheckBase() {
			MCMessageList msgL = new MCMessageList();

			// 更新カウンタチェック、更新前データのDACチェック、トランザクションデータの検索
			if (!isNull(up0().cst_frcst_no())) {
				MST_CST_FRCST_H_R t = MST_CST_FRCST_H_R.create("T");
				MCQueryApiBuilder hdrR_bldr = MCQueryApiBuilder.create(t);
				if (!up0().file_imp_flg()){
					dbSelectKeyForUpdateNoWait("MSBBL0010_MST_CST_FRCST_H_S01", _hdrR, hdrR_bldr, up0());
					
					msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$upd_cntr, _hdrR));
					msgL.addAll(checkWritableDptCdDac(_hdrR, MST_CST_FRCST_H_R.$frcst_dpt_cd));
				}
				else {
					dbSelectKey("MSBBL0010_MST_CST_FRCST_H_S02", _hdrR, hdrR_bldr, up0());
					// 存在チェック
					if (isNull(_hdrR.cst_frcst_no())) {
						MCList<MST_CST_FRCST_H_R> dbcHL = MCList.create(MST_CST_FRCST_H_R.class);
						dbcHL.add(_hdrR);
						msgL.add(msgNotExistInTable(t, up0(), Chk01_HdrR.$cst_frcst_no));
					}
					else {
						up0().upd_cntr(_hdrR.upd_cntr());
					}
				}

				if (msgL.size() > 0) {
					return msgL;
				}

				// 明細の検索
				MST_CST_FRCST_D_R t1 = MST_CST_FRCST_D_R.create("T");
				MCQueryApiBuilder dtlL_bldr = MCQueryApiBuilder.create(t1);
				if (!up0().file_imp_flg()){
					dtlL_bldr.setWhere(t1.cst_frcst_no.eq(bind("cst_frcst_no")), up0());
					dbSelectForUpdate("MSBBL0010_MST_CST_FRCST_D_S01", _dtlL, dtlL_bldr);
				}
				else{
					dtlL_bldr.setWhere(t1.cst_frcst_no.eq(bind("cst_frcst_no")), up0());
					dbSelect("MSBBL0010_MST_CST_FRCST_D_S02", _dtlL, dtlL_bldr);
					MCIndexKey idxkey = _dtlL.createIndex(MST_CST_FRCST_D_R.$cst_frcst_d_no);
					for (Chk01_DtlR row : up1()){
						if (!isNull(row.cst_frcst_d_no())){
							MST_CST_FRCST_D_R selectR = _dtlL.getFirst(idxkey, row.cst_frcst_d_no());
							// 存在チェック
							if (selectR == null) {
								msgL.add(msgNotExistInTable(t1, row, Chk01_DtlR.$cst_frcst_d_no));
							}
						}
					}
				}
			}
			else if (up0().file_imp_flg()){
				for (Chk01_DtlR row : up1()){
					if (!isNull(row.cst_frcst_d_no())){
						msgL.add(new MCMessage(row, null, MSBBL0207, toDispGUIIndex(row)));
					}
				}
			}
			
			
			if(!up0().file_imp_flg()){
				msgL.addAll(checkWritableDptCdDac(up0(), Chk01_HdrR.$frcst_dpt_cd));
			}
			return msgL;
		}

		protected void compBase() {
			// トランザクションデータからの補完処理はここに実装する
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			msgL.addAll(checkSub());
			if (!msgL.isEmpty() || hasErrFlgOn(up0(), up1())) {
				return msgL;
			}

			compSub();

			return msgL;
		}

		protected MCMessageList checkSub() {
			MCMessageList msgL = new MCMessageList();
			
			//同一「受付日」の存在チェック
			MCList<MST_CST_FRCST_H_R> selectL = MCList.create(MST_CST_FRCST_H_R.class);
			MST_CST_FRCST_H_R t = MST_CST_FRCST_H_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.cst_frcst_no);
			selectL_bldr.setWhere(t.cst_cd.eq(bind("cst_cd")));
			selectL_bldr.addWhereWithAnd(bracket(t.dlv_cd.isNull()
					.and(bind("dlv_cd").isNull())
					.or(t.dlv_cd.eq(bind("dlv_cd")))));
			selectL_bldr.addWhereWithAnd(t.frcst_dpt_cd.eq(bind("frcst_dpt_cd")));
			selectL_bldr.addWhereWithAnd(
					bracket(t.frcst_usr_cd.isNull()
							.and(bind("frcst_usr_cd").isNull())
							.or(t.frcst_usr_cd.eq(bind("frcst_usr_cd")))));
			selectL_bldr.addWhereWithAnd(bracket(t.wrk_no.isNull()
					.and(bind("wrk_no").isNull())
					.or(t.wrk_no.eq(bind("wrk_no")))));
			selectL_bldr.addWhereWithAnd(t.rcpt_dt.eq(bind("rcpt_dt")));
			selectL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			selectL_bldr.addWhereWithAnd(bracket(bind("cst_frcst_no").isNull()
					.or(t.cst_frcst_no.neq(bind("cst_frcst_no")))));
			int cnt = dbSelect("MSBBL0010_MST_CST_FRCST_H_S03", selectL, selectL_bldr, up0());
			if (!isSame(cnt, 0)){
				msgL.add(new MCMessage(up0(), null, MSBBL0219,
						up0().cst_cd(), up0().dlv_cd(), up0().frcst_dpt_cd(),
						up0().frcst_usr_cd(), up0().wrk_no(), up0().rcpt_dt()));
			}

			if (!up0().err_flg()) {
				// 明細0件チェックはエラー行も対象とする
				msgL.addAll(checkAtLeastOneDtl(up0(), up1()));

				MCList<Chk01_DtlR> notErrL = getChkList(up1());
				msgL.addAll(checkDecPlace(notErrL, Chk01_DtlR.$trd_unit_dec_place,
						Chk01_DtlR.$trd_unit_qty));
				
				for (Chk01_DtlR notErrR : notErrL) {
					if (isSame(notErrR.frcst_st_dt(), notErrR.frcst_end_dt())) {
						msgL.add(new MCMessage(notErrR, Chk01_DtlR.$frcst_end_dt, MSBBL0185, toDispGUIIndex(notErrR)));
					}
				}
			}

			return msgL;
		}

		protected void compSub() {
			// リストロジックチェックで補完しきれない項目を補完する
			setDispSeq(up1());
			editFrcstDt();
			calcBaseUnitQty();
			setDbValue();
		}

		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
		}

		/** 基準単位数量を算出する。 */
		protected void calcBaseUnitQty() {
			for (Chk01_DtlR dtlR: up1()) {
				dtlR.base_unit_qty(convToBaseUnit(dtlR.trd_unit_qty(),
						dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
						dtlR.base_unit_dec_place(), dtlR.base_unit_rnd_typ()));
			}
		}

		/** 内示期間開始日から内示期間を設定する。 */
		protected void editFrcstDt() {
			for (Chk01_DtlR dtlR: up1().subList(MCRow.CREATE, MCRow.MODIFY)) {
				dtlR.frcst_dt(getFrcstStDt(dtlR.frcst_st_dt(), dtlR.frcst_period_typ()));
			}
		}
		
		/** ロックしたデータから補完する */
		protected void setDbValue() {
			up0().can_flg(_hdrR.can_flg());
		}
	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * 顧客期間内示ヘッダ、顧客期間内示情報を取り消し可能かチェックする<br>
	 */
	public class Chk02 extends MSBBL_CstFrcstReg_MC_A.Chk02 {
		protected MST_CST_FRCST_H_R _hdrR = MST_CST_FRCST_H_R.create();

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			msgL.addAll(lockAndCheckBase());

			if (!msgL.isEmpty()) {
				return msgL;
			}

			compBase();

			return msgL;
		}

		protected MCMessageList lockAndCheckBase() {
			MCMessageList msgL = new MCMessageList();

			// 更新カウンタチェック、更新前データのDACチェック、トランザクションデータの検索
			dbSelectKeyForUpdateNoWait("MSBBL0010_MST_CST_FRCST_H_S04",
					_hdrR, MCQueryApiBuilder.create(MST_CST_FRCST_H_R.create("T")), up0());
			msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$upd_cntr, _hdrR));
			msgL.addAll(checkWritableDptCdDac(_hdrR, MST_CST_FRCST_H_R.$frcst_dpt_cd));

			return msgL;
		}

		protected void compBase() {
			// トランザクションデータからの補完処理はここに実装する
		}

		
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}

	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 顧客期間内示ヘッダ、顧客期間内示情報を取り消す<br>
	 */
	public class Del01 extends MSBBL_CstFrcstReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editUp();

			callThisChk02();
			throwUpdErr();

			doDelCstFrcstH();
			doDelCstFrcst();

			setDown();
		}

		/** 上り電文を編集する。*/
		protected void editUp() {
			up0().peg_no(0);
			up0().data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			up0().setStatus(MCRow.MODIFY);
			up0().can_flg(true);
		}

		/** 取消チェックサービスを呼び。*/
		protected void callThisChk02() {
			MSBBL_CstFrcstReg.Chk02 ope = MSBBL_CstFrcstReg.crtChk02();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();

			MCRow.copyall(up0(), ope.down0());
		}

		/** 顧客期間内示ヘッダ・明細を論理削除する。 */
		protected void doDelCstFrcstH() {
			delCstFrcstH();
		}

		/** 顧客期間内示ヘッダを論理削除する。 */
		protected void delCstFrcstH() {
			MST_CST_FRCST_H_R cstFrcstH = up0().hdr();
			MST_CST_FRCST_H_R t = MST_CST_FRCST_H_R.create("T");
			MCQueryApiBuilder cstFrcstH_bldr = MCQueryApiBuilder.create(t);
			cstFrcstH_bldr.setSet(t.can_flg);
			cstFrcstH_bldr.addSet(t.can_rsn_cd);
			cstFrcstH_bldr.addSet(t.can_rmrks);
			dbUpdateKey("MSBBL0010_MST_CST_FRCST_H_U01", cstFrcstH, cstFrcstH_bldr);
		}

		/** 顧客期間内示情報を削除する。 */
		protected void doDelCstFrcst() {
			MCList<Chk02_HdrR> upL = MCList.create(Chk02_HdrR.class);
			upL.add(up0());
			MST_CST_FRCST_R t = MST_CST_FRCST_R.create("T");
			execDbDelete("MSBBL0010_MST_CST_FRCST_D01",
					t, t.cst_frcst_no.eq(bind("cst_frcst_no")),
					upL.groupBy(Chk02_HdrR.$cst_frcst_no));
		}

		protected void setDown() {
			//特になし
		}
	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 顧客期間内示ヘッダ、顧客期間内示明細、顧客期間内示情報を登録する<br>
	 */
	public class Ins01 extends MSBBL_CstFrcstReg_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editUp();

			callThisChk01();
			throwUpdErr();

			doInsCstFrcstHD();
			doUpdCstFrcst(up0(), up1());

			setDown();
		}

		/** 上り電文を編集する。*/
		protected void editUp() {
			up0().peg_no(0);
			setPegNo(Chk01_DtlR.$peg_no, up1());
			up0().data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			up0().setStatus(MCRow.CREATE);
		}

		/** 登録・更新チェックサービスを呼ぶ。*/
		protected void callThisChk01() {
			MSBBL_CstFrcstReg.Chk01 ope = MSBBL_CstFrcstReg.crtChk01();
			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.exec();

			MCRow.copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
		}

		/** 顧客期間内示ヘッダ・明細を登録する。 */
		protected void doInsCstFrcstHD() {

			//発番
			setCstFrcstNo(up0());
			setCstFrcstDNo(up0(), up1());

			//登録
			insCstFrcstH();
			insCstFrcstD();
		}

		/** 顧客期間内示ヘッダを登録する。 */
		protected void insCstFrcstH() {
			MST_CST_FRCST_H_R cstFrcstH = up0().hdr();
			dbInsertEx("MSBBL0010_MST_CST_FRCST_H_I01", cstFrcstH,
					MCQueryApiBuilder.create(MST_CST_FRCST_H_R.create("T")));
		}

		/** 顧客期間内示明細を登録する。 */
		protected void insCstFrcstD() {
			MCList<MST_CST_FRCST_D_R> cstFrcstDL =MCList.create(MST_CST_FRCST_D_R.class);	
			for (Chk01_DtlR dtl : up1().statusChangedList()) {
				cstFrcstDL.add(dtl.dtl());
			}
			if (!cstFrcstDL.isEmpty()) {
				dbInsertEx("MSBBL0010_MST_CST_FRCST_D_I01", cstFrcstDL,
						MCQueryApiBuilder.create(MST_CST_FRCST_D_R.create("T")));
			}
		}

		/** 下り電文を設定する。 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 顧客期間内示ヘッダ、顧客期間内示明細、顧客期間内示情報を訂正する<br>
	 */
	public class Upd01 extends MSBBL_CstFrcstReg_MC_A.Upd01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editUp();

			callThisChk01();
			throwUpdErr();

			doUpdCstFrcstHD();
			doUpdCstFrcst(up0(), up1());

			setDown();
		}

		/** 上り電文を編集する。*/
		protected void editUp() {
			up0().peg_no(0);
			setPegNo(Chk01_DtlR.$peg_no, up1());
			up0().data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			up0().setStatus(MCRow.MODIFY);
		}

		/** 登録・更新チェックを呼ぶ。*/
		protected void callThisChk01() {
			MSBBL_CstFrcstReg.Chk01 ope = MSBBL_CstFrcstReg.crtChk01();
			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.exec();

			MCRow.copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
		}

		/** 顧客期間内示ヘッダ・明細を更新する。 */
		protected void doUpdCstFrcstHD() {
			
			if (up0().can_flg()) {
				updCstFrcstHForCan();
			}
			else {
				//発番
				setCstFrcstDNo(up0(), up1());

				//登録
				updCstFrcstH();
				updCstFrcstD();
			}
		}

		/** 取り消されている顧客期間内示ヘッダを更新する。 */
		protected void updCstFrcstHForCan() {
			MST_CST_FRCST_H_R t = MST_CST_FRCST_H_R.create("T");
			MCQueryApiBuilder cstFrcstH_bldr = MCQueryApiBuilder.create(t);
			MST_CST_FRCST_H_R cstFrcstH = up0().hdr();
			cstFrcstH_bldr.setSet(t.can_rsn_cd);
			cstFrcstH_bldr.addSet(t.can_rmrks);
			dbUpdateKey("MSBBL0010_MST_CST_FRCST_H_U02", cstFrcstH, cstFrcstH_bldr);
		}

		/** 顧客期間内示ヘッダを更新する。 */
		protected void updCstFrcstH() {
			MST_CST_FRCST_H_R cstFrcstH = up0().hdr();
			dbUpdateKey("MSBBL0010_MST_CST_FRCST_H_U03", cstFrcstH,
					MCQueryApiBuilder.create(MST_CST_FRCST_H_R.create("T")));
		}

		/** 顧客期間内示明細を更新する。 */
		protected void updCstFrcstD() {
			MCList<MST_CST_FRCST_D_R> cstFrcstDL = MCList.create(MST_CST_FRCST_D_R.class);
			for (Chk01_DtlR dtl : up1().statusChangedList()) {
				cstFrcstDL.add(dtl.dtl());
			}
			if (!cstFrcstDL.isEmpty()) {
				dbLockInsUpdDelByStatusNoCheck("MSBBL0010_MST_CST_FRCST_D_U01",
						cstFrcstDL, MCQueryApiBuilder.create(MST_CST_FRCST_D_R.create("T")));
			}
		}

		/** 下り電文を設定する。*/
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
		}
	}


	/**
	 * Imp01オペレーション.<p>
	 *
	 * 顧客期間内示ヘッダ、顧客期間内示明細をファイル入力する<br>
	 */
	public class Imp01 extends MSBBL_CstFrcstReg_MC_A.Imp01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editUp();

			if (MCMessagePool.size()==0) {
				callThisChk01();
			}
			setDown();
		}

		protected void editUp() {
			up0().get(0).hdr().peg_no(0);
			setPegNo(Imp01_DtlR.$peg_no, up0());
			up0().setStringNE(Imp01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
			up0().setStatus(MCRow.CREATE);
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBBL_CstFrcstReg.Chk01 ope = MSBBL_CstFrcstReg.crtChk01();
			MCRow.copyall(ope.up0(), up0().get(0).hdr());
			ope.up0().file_imp_flg(true);
			for (Imp01_DtlR dtl : up0()) {
				ope.up1().add(dtl.dtl());
			}
			ope.exec();
			MCRow.copyall(up0().get(0).hdr(), ope.down0());
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		protected void setDown() {
			MCRow.copyall(down0(), up0().get(0).hdr());
			down1().setAll(up0());
			if (!isNull(down0().cst_frcst_no())){
				down0().setStatus(MCRow.MODIFY);
				for (Imp01_DtlR r : down1()){
					if(!isNull(r.cst_frcst_d_no())){
						r.setStatus(MCRow.MODIFY);
					}
				}
			}
		}
		
		@Override
		protected boolean isThreadExec(mcframe.commonCore.param.MCParam p) {
			// 自動マルチスレッドによる分割をするよりも前に、ヘッダ項目の混在をチェックする
			// 混在する場合は自動マルチスレッドは有効にせずエラーの下り電文を返すのみとする
			String [] cols = getHdrCols();
			Imp01_DtlR  baseR = up0().get(0);
			for (Imp01_DtlR r : up0()){
				if (!isColSame(baseR, r, cols)){
					MCMessagePool.add(new MCMessage(r, null, MSBBL0207, toDispGUIIndex(r)));
					r.err_flg(true);
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
					return false;
				}
			}
			return super.isThreadExec(p);
		}
		
		protected String[] getHdrCols () {
			
			String [] cols = new String[]{Imp01_DtlR.$cst_frcst_no,
					Imp01_DtlR.$cst_frcst_prnt_dt,
					Imp01_DtlR.$cst_frcst_slip_no,
					Imp01_DtlR.$cst_cd,
					Imp01_DtlR.$dlv_cd,
					Imp01_DtlR.$frcst_usr_cd,
					Imp01_DtlR.$frcst_dpt_cd,
					Imp01_DtlR.$wrk_no,
					Imp01_DtlR.$rcpt_dt,
					Imp01_DtlR.$can_flg,
					Imp01_DtlR.$can_rsn_cd,
					Imp01_DtlR.$can_rmrks,
					Imp01_DtlR.$intr_rmrks,
					Imp01_DtlR.$sub_char1,
					Imp01_DtlR.$sub_char2,
					Imp01_DtlR.$sub_char3};
			return cols;
		}
	}

	/** 顧客期間内示ＮＯを発番する。 */
	protected void setCstFrcstNo(Chk01_HdrR hdr) {
		ElmArgsR args = ElmArgsR.create();
		args.co_cd(getCo().co_cd());
		args.dt(hdr.cst_frcst_prnt_dt());
		args.dpt_cd(hdr.frcst_dpt_cd());
		args.bp_cd(hdr.cst_cd());
		args.wg_cd(hdr.wg_cd());

		hdr.cst_frcst_no(getNum(MAC_NUM_BIZ_TYP.CSTFRCST, args));
	}

	/** 顧客期間内示明細ＮＯを発番する。 */
	protected void setCstFrcstDNo(Chk01_HdrR hdrR, MCList<Chk01_DtlR> dtlL) {
		MCList<Chk01_DtlR> newL = dtlL.subList(MCRow.CREATE);
		doSeqCache(MSC_NUM_SYS_TYP.CSTFRCSTD, newL.size());
		for (Chk01_DtlR r : newL) {
			r.cst_frcst_d_no(getStrSeq(MSC_NUM_SYS_TYP.CSTFRCSTD));
			//r.cst_frcst_no(hdrR.cst_frcst_no());
		}
		dtlL.setStringNE(Chk01_DtlR.$cst_frcst_no, hdrR.cst_frcst_no());
	}

	/** 顧客期間内示レコードＮＯを発番する。 */
	protected void setCstFrcstRNo(MCList<MST_CST_FRCST_R> dtlL) {
		MCList<MST_CST_FRCST_R> newL = dtlL.subList(MST_CST_FRCST_R.$cst_frcst_r_no, null);
		doSeqCache(MSC_NUM_SYS_TYP.CSTFRCSTR, newL.size());
		for (MST_CST_FRCST_R r : newL) {
			r.cst_frcst_r_no(getStrSeq(MSC_NUM_SYS_TYP.CSTFRCSTR));
		}
	}

	/** 顧客期間内示情報を更新する。 */
	protected void doCalcCstFrcst(MCList<MST_CST_FRCST_R> cstFrcstL) {
		MCList<MST_CST_FRCST_R> downL = getDivFrcstL(cstFrcstL);
		delInsCstFrcst(downL);
	}
	
	/** 顧客内示期間リストを期間ごとに案分する。*/
	protected MCList<MST_CST_FRCST_R> getDivFrcstL(MCList<MST_CST_FRCST_R> cstFrcstL){
		
		MCList<MST_CST_FRCST_R> rtnL = MCList.create(MST_CST_FRCST_R.class); 
		//品目の小数部有効桁数を取得する。
		MAM_ITM_R t = MAM_ITM_R.create("T");
		MCQueryApiBuilder dbcItmL_bldr = MCQueryApiBuilder.create(t);

		dbcItmL_bldr.setSelect(t.itm_cd);
				dbcItmL_bldr.addSelect(t.itm_sub1);
				dbcItmL_bldr.addSelect(t.itm_sub2);
				dbcItmL_bldr.addSelect(t.itm_sub3);
				dbcItmL_bldr.addSelect(t.dec_place);
		cacheItm = new FXUCL_MCDbcCache<MAM_ITM_R>(dbcItmL_bldr, cstFrcstL,	
			new String[] {
				MAM_ITM_R.$itm_cd,
				MAM_ITM_R.$itm_sub1,
				MAM_ITM_R.$itm_sub2,
				MAM_ITM_R.$itm_sub3
			});	

		cstFrcstL.addNumberColumn("dec_place");
		cstFrcstL.addNumberColumn("period_days");
		for (MST_CST_FRCST_R r: cstFrcstL) {
			MAM_ITM_R itmR =  cacheItm.get(
				r.itm_cd(), 
				r.itm_sub1(),
				r.itm_sub2(), 
				r.itm_sub3());
			if (!isNull(itmR)){
				r.setNumberNE("dec_place", itmR.dec_place());
			}
		}
		rtnL.addAll(getPeriodTypL(cstFrcstL, MAC_PERIOD_TYP.WEEKLY.value()));
		rtnL.addAll(getPeriodTypL(cstFrcstL, MAC_PERIOD_TYP.TENDAYS.value()));
		rtnL.addAll(getPeriodTypL(cstFrcstL, MAC_PERIOD_TYP.MONTHLY.value()));
		
		return rtnL;
	}

	/**　顧客内示期間情報を削除・登録する。 */
	protected void delInsCstFrcst(MCList<MST_CST_FRCST_R> cstFrcstL) {
		MST_CST_FRCST_R t = MST_CST_FRCST_R.create("T");
		execDbDelete("MSBBL0010_MST_CST_FRCST_D01",
				t, t.cst_frcst_d_no.eq(bind("cst_frcst_d_no")),
				cstFrcstL.groupBy(MST_CST_FRCST_R.$cst_frcst_d_no));
		
		MCList<MST_CST_FRCST_R> insL = cstFrcstL.subList(MCRow.CREATE, MCRow.MODIFY, MCRow.NONE);
		
		//発番処理
		setCstFrcstRNo(insL);
		dbInsertEx("MSBBL0010_MST_CST_FRCST_I01", insL, MCQueryApiBuilder.create(t));
	}

	/** 期間区分ごとに日付の期間開始日を取得する。*/
	protected MCDate getFrcstStDt(MCDate baseDt, String period_typ){
		return getPeriodStDt(baseDt, period_typ);
	}

	/** 期間区分ごとに日付の期間終了日を取得する。*/
	protected MCDate getFrcstEndDt(MCDate baseDt, String period_typ){
		return getPeriodEndDt(baseDt, period_typ);
	}

	/** 顧客期間内示情報を更新する。 */
	protected void doUpdCstFrcst(Chk01_HdrR up0, MCList<Chk01_DtlR> up1) {
		
		if (up0.can_flg()) {
			return;
		}

		MCList<MST_CST_FRCST_R> cstFrcstL = MCList.create(MST_CST_FRCST_R.class);
		for (Chk01_DtlR dtl : up1.statusChangedList()) {
			MST_CST_FRCST_R cstFrcstR = MST_CST_FRCST_R.create();
			copy(cstFrcstR,  up0.hdr(), createMap_MST_CST_FRCST_R_MST_CST_FRCST_H_R());
			copy(cstFrcstR, dtl.dtl(), createMap_MST_CST_FRCST_R_MST_CST_FRCST_D_R());
			cstFrcstL.add(cstFrcstR);
		}
	
		doCalcCstFrcst(cstFrcstL);
	}
	
	/**
	 * 正味数量を割り算。
	 * @param cstFrcstL
	 * @param periodTyp
	 * @return
	 */
	protected MCList<MST_CST_FRCST_R> getPeriodTypL(MCList<MST_CST_FRCST_R> cstFrcstL, String periodTyp){
	
		MCList<MST_CST_FRCST_R> rtnList = MCList.create(MST_CST_FRCST_R.class);
		for (MST_CST_FRCST_R row : cstFrcstL.subList(MST_CST_FRCST_R.$frcst_period_typ, periodTyp)){
			MCList<MST_CST_FRCST_R> tempL = cstFrcstL.createInstance();

			MCDate tempStDt = row.frcst_st_dt();
			MCDate tempEndDt = row.frcst_st_dt();

			while(tempEndDt.ltDate(row.frcst_end_dt())){
				MST_CST_FRCST_R tempRow = row.clone();
				tempRow.frcst_st_dt(tempStDt);
				
				tempEndDt = getPeriodEndDt(tempStDt, periodTyp, getCo().ac_cl_day());
				if (tempEndDt.gteDate(row.frcst_end_dt())){
					tempEndDt = row.frcst_end_dt();
				}
				else{
					tempStDt = tempEndDt.addDay(MCNumber.ONE);
				}
				tempRow.frcst_end_dt(tempEndDt);
				
				tempRow.setNumberNE("period_days", tempRow.frcst_end_dt().diffDay(tempRow.frcst_st_dt()) + 1);
				tempL.add(tempRow);
			}
			
			//正味数量の割算
			FXUCC_Divide.prop(tempL, row.net_qty(),
					row.getNumberNE("DEC_PLACE").intValue(),
					"period_days",
					MST_CST_FRCST_R.$net_qty);
			rtnList.addAll(tempL);
		}
		return rtnList;
	}
	
	/**MST_CST_FRCST_H → MST_CST_FRCST */
	protected Map_MST_CST_FRCST_R_MST_CST_FRCST_H_R<MST_CST_FRCST_R,MST_CST_FRCST_H_R> createMap_MST_CST_FRCST_R_MST_CST_FRCST_H_R() {
		return new Map_MST_CST_FRCST_R_MST_CST_FRCST_H_R<MST_CST_FRCST_R, MST_CST_FRCST_H_R>();
	}

	/**MST_CST_FRCST_H → MST_CST_FRCST */
	public class Map_MST_CST_FRCST_R_MST_CST_FRCST_H_R<D extends MST_CST_FRCST_R, S extends MST_CST_FRCST_H_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_CST_FRCST_R.$cst_frcst_no, MST_CST_FRCST_H_R.$cst_frcst_no);
			addColumnPathMap(MST_CST_FRCST_R.$cst_cd, MST_CST_FRCST_H_R.$cst_cd);
			addColumnPathMap(MST_CST_FRCST_R.$dlv_cd, MST_CST_FRCST_H_R.$dlv_cd);
			addColumnPathMap(MST_CST_FRCST_R.$cst_frcst_prnt_dt, MST_CST_FRCST_H_R.$cst_frcst_prnt_dt);
			addColumnPathMap(MST_CST_FRCST_R.$cst_frcst_slip_no, MST_CST_FRCST_H_R.$cst_frcst_slip_no);
			addColumnPathMap(MST_CST_FRCST_R.$frcst_dpt_cd, MST_CST_FRCST_H_R.$frcst_dpt_cd);
			addColumnPathMap(MST_CST_FRCST_R.$frcst_usr_cd, MST_CST_FRCST_H_R.$frcst_usr_cd);
			addColumnPathMap(MST_CST_FRCST_R.$wrk_no, MST_CST_FRCST_H_R.$wrk_no);
			addColumnPathMap(MST_CST_FRCST_R.$rcpt_dt, MST_CST_FRCST_H_R.$rcpt_dt);
		}
	}
	
	/**MST_CST_FRCST_D → MST_CST_FRCST */
	protected Map_MST_CST_FRCST_R_MST_CST_FRCST_D_R<MST_CST_FRCST_R,MST_CST_FRCST_D_R> createMap_MST_CST_FRCST_R_MST_CST_FRCST_D_R() {
		return new Map_MST_CST_FRCST_R_MST_CST_FRCST_D_R<MST_CST_FRCST_R, MST_CST_FRCST_D_R>();
	}
	
	/**MST_CST_FRCST_D → MST_CST_FRCST */
	public class Map_MST_CST_FRCST_R_MST_CST_FRCST_D_R<D extends MST_CST_FRCST_R, S extends MST_CST_FRCST_D_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_CST_FRCST_R.$cst_frcst_no, MST_CST_FRCST_D_R.$cst_frcst_no);
			addColumnPathMap(MST_CST_FRCST_R.$cst_frcst_d_no, MST_CST_FRCST_D_R.$cst_frcst_d_no);
			addColumnPathMap(MST_CST_FRCST_R.$fix_flg, MST_CST_FRCST_D_R.$fix_flg);
			addColumnPathMap(MST_CST_FRCST_R.$itm_cd, MST_CST_FRCST_D_R.$itm_cd);
			addColumnPathMap(MST_CST_FRCST_R.$itm_sub1, MST_CST_FRCST_D_R.$itm_sub1);
			addColumnPathMap(MST_CST_FRCST_R.$itm_sub2, MST_CST_FRCST_D_R.$itm_sub2);
			addColumnPathMap(MST_CST_FRCST_R.$itm_sub3, MST_CST_FRCST_D_R.$itm_sub3);
			addColumnPathMap(MST_CST_FRCST_R.$frcst_period_typ, MST_CST_FRCST_D_R.$frcst_period_typ);
			addColumnPathMap(MST_CST_FRCST_R.$frcst_dt, MST_CST_FRCST_D_R.$frcst_dt);
			addColumnPathMap(MST_CST_FRCST_R.$frcst_st_dt, MST_CST_FRCST_D_R.$frcst_st_dt);
			addColumnPathMap(MST_CST_FRCST_R.$frcst_end_dt, MST_CST_FRCST_D_R.$frcst_end_dt);
			addColumnPathMap(MST_CST_FRCST_R.$trd_unit_cd, MST_CST_FRCST_D_R.$trd_unit_cd);
			addColumnPathMap(MST_CST_FRCST_R.$trd_unit_qty, MST_CST_FRCST_D_R.$trd_unit_qty);
			addColumnPathMap(MST_CST_FRCST_R.$base_unit_cd, MST_CST_FRCST_D_R.$base_unit_cd);
			addColumnPathMap(MST_CST_FRCST_R.$base_unit_qty, MST_CST_FRCST_D_R.$base_unit_qty);
			addColumnPathMap(MST_CST_FRCST_R.$gi_loc_cd, MST_CST_FRCST_D_R.$gi_loc_cd);
			addColumnPathMap(MST_CST_FRCST_R.$cst_itm_cd, MST_CST_FRCST_D_R.$cst_itm_cd);
			addColumnPathMap(MST_CST_FRCST_R.$cst_itm_nm, MST_CST_FRCST_D_R.$cst_itm_nm);
			addColumnPathMap(MST_CST_FRCST_R.$cst_frcst_slip_d_no, MST_CST_FRCST_D_R.$cst_frcst_slip_d_no);
			addColumnPathMap(MST_CST_FRCST_R.$prms_qty, MST_CST_FRCST_D_R.$prms_qty);
			addColumnPathMap(MST_CST_FRCST_R.$frcst_stop_flg, MST_CST_FRCST_D_R.$frcst_stop_flg);
			addColumnPathMap(MST_CST_FRCST_R.$net_qty, MST_CST_FRCST_D_R.$base_unit_qty);
		}
	}

	//FMCB CUSTOM END
}