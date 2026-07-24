package mcframe.serverMSBD.MSBDL5170;

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
import mcframe.serverMSBD.MSBDL5170.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBD.MSBDL5180.MSBDL_PurcActRegService;
import mcframe.serverMSBE.MSBEL5020.MSBEL_IoSchdService;
import mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndR;
import mcframe.serverMSBI.MSBIL5010.MSBIL_ClService;
import mcframe.serverMSBE.MSBEL5270.MSBEL_ProvActService;
import mcframe.serverMSBE.MSBEL5010.*;
import mcframe.serverMSBE.MSBEL5270.*;
import mcframe.serverMSBD.MSBDL5180.*;
import mcframe.serverMSBE.MSBEL5020.IoSchd_Ins01_DtlR;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverMSBD.MSBDL5200.*;
import mcframe.serverMSBD.MSBDL5040.MSBDL_PurcUtil;
import mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.commonMSUA.MSUAC0040.MSUAC_List;
import mcframe.serverMSBE.MSBEL5260.*;
import mcframe.commonMAUA.MAUAC0010.MAUAC_List;
import mcframe.serverMSBE.MSBEL5040.*;
import java.util.*;
import mcframe.serverFXUC.FXUCL0170.*;
import mcframe.serverMSBC.MSBCL6130.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import mcframe.commonCore.container.MCRow.Status;
import static mcframe.serverMSBD.MSBDL5170.Query.*;
import static mcframe.serverMSBD.MSBDL5040.MSBDL_PurcUtil.*;
import mcframe.serverMSBF.MSBFL5210.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
import mcframe.serverMSUC.MSUCL0020.MSUCL_ConvQtyAmtUtil;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBDL_PurcRetRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBDL_PurcRetRegService_MC extends MSBDL_PurcRetRegService_MC_A{
	//FMCB CUSTOM START

	/**
	 * 仕入実績更新対象のDATA_CRUD_TYPを保存する項目
	 */
	protected String $purc_act_data_crud_typ = "purc_act_data_crud_typ";
	/**
	 * 受払実績更新対象のDATA_CRUD_TYPを保存する項目
	 */
	protected String $io_act_data_crud_typ = "io_act_data_crud_typ";
	
	/**
	 * 支給更新対象のDATA_CRUD_TYPを保存する項目
	 */
	protected String $prov_data_crud_typ = "prov_data_crud_typ";
	
	protected FXUCL_MCDbcCache<MAM_SUNDRY_ITM_R> _sundryItmCache = null;
	
	/** 製造指図 */
	protected FXUCL_MCDbcCache<MST_MFG_INST_R> _cacheMfgInst = null;
	
	/** 品目製造指図 */
	protected FXUCL_MCDbcCache<MST_ITM_MFG_INST_R> _cacheItmMftInst = null;
	
	protected void createSundryItmCache(MCList<?> dtlL) {
		object(CLAZZ)._createSundryItmCache(dtlL);
	}

	protected void _createSundryItmCache(MCList<?> dtlL) {
		MAM_SUNDRY_ITM_R t = MAM_SUNDRY_ITM_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.itm_nm);
		_sundryItmCache = new FXUCL_MCDbcCache<MAM_SUNDRY_ITM_R>(dbc_bldr, dtlL, "itm_cd",
				"itm_sub1", "itm_sub2", "itm_sub3", "sno1", "sno2", "sno3", "sno4");
	}
	
	protected void createMfgInstCache(MCList<Schd_DtlR> dtlL) {
		MCList<MST_MFG_INST_R> mfgInstL = MCList.create(MST_MFG_INST_R.class);
		_cacheMfgInst = new FXUCL_MCDbcCache<MST_MFG_INST_R>(mfgInstL,
				MCQueryApiBuilder.create(MST_MFG_INST_R.create("T")),
				dtlL.groupBy(DtlR.$mfg_inst_no), DtlR.$mfg_inst_no);
		// 品目製造指図
		createItmMfgInstCache(mfgInstL);
	}
	
	protected void createItmMfgInstCache(MCList<MST_MFG_INST_R> mfgInstL) {
		_cacheItmMftInst = new FXUCL_MCDbcCache<MST_ITM_MFG_INST_R>(
				MCQueryApiBuilder.create(MST_ITM_MFG_INST_R.create("T")),
				mfgInstL.groupBy(MST_MFG_INST_R.$itm_mfg_inst_no),
				MST_MFG_INST_R.$itm_mfg_inst_no);
	}

	protected MAM_SUNDRY_ITM_R getSundryItm(String itmCd, String itmSub1, String itmSub2, String itmSub3, String sno1, String sno2, String sno3,
			String sno4) {
		return getSundryItmCache().get(itmCd, itmSub1, itmSub2, itmSub3, sno1, sno2, sno3, sno4);
	}

	protected static FXUCL_MCDbcCache<MAM_SUNDRY_ITM_R> getSundryItmCache() {
		return object(CLAZZ)._sundryItmCache;
	}
	
	protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache = null;
	
	protected void createItmUnitCache(IoL<IoR> ioL) {
		object(CLAZZ)._createItmUnitCache(ioL);
	}
	protected void _createItmUnitCache(IoL<IoR> ioL) {
		IoL<IoR> cioL = ioL.createInstance();
		cioL.addStringColumn("itm_cd");
		cioL.addStringColumn("itm_sub1");
		cioL.addStringColumn("itm_sub2");
		cioL.addStringColumn("itm_sub3");
		for (IoR r : ioL) {
			r.setStringNE(DtlR.$itm_cd, r.getStringNE("itm_cd"));
			r.setStringNE(DtlR.$itm_sub1, r.getStringNE("itm_sub1"));
			r.setStringNE(DtlR.$itm_sub2, r.getStringNE("itm_sub2"));
			r.setStringNE(DtlR.$itm_sub3, r.getStringNE("itm_sub3"));
			cioL.add(r);
		}
		
		MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.conv_base_qty, t.conv_qty);
		_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(dbc_bldr, cioL, "itm_cd",
				"itm_sub1", "itm_sub2", "itm_sub3", "trd_unit_cd");
	}
	protected MAVM_ITM_UNIT_R getItmUnit(String itmCd, String itmSub1, String itmSub2, String itmSub3, String trdUnitCd) {
		return getItmUnitCache().get(itmCd, itmSub1, itmSub2, itmSub3, trdUnitCd);
	}
	
	protected static FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> getItmUnitCache() {
		return object(CLAZZ)._itmUnitCache;
	}
	
	protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache = null;
	protected void createItmCache(DtlL<DtlR> dtlL) {
		object(CLAZZ)._createItmCache(dtlL);
	}
	protected void _createItmCache(DtlL<DtlR> dtlL) {
		_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(
				MCQueryApiBuilder.create(MAM_ITM_R.create("T")), dtlL, "itm_cd",
				"itm_sub1", "itm_sub2", "itm_sub3");
	}
	protected MAM_ITM_R getItm(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return getItmCache().get(itmCd, itmSub1, itmSub2, itmSub3);
	}
	protected static FXUCL_MCDbcCache<MAM_ITM_R> getItmCache() {
		return object(CLAZZ)._itmCache;
	}
	
	/** 税マスタキャッシュ */
	protected FXUCL_MCDbcCache<MAM_TAX_R> _taxCache = null;
	protected static void  createTaxCache(DtlL<DtlR> dtlL) {
		object(CLAZZ)._createTaxCache(dtlL);
	}
	protected void _createTaxCache(DtlL<DtlR> dtlL) {
		_taxCache = new FXUCL_MCDbcCache<MAM_TAX_R>(
				MCQueryApiBuilder.create(MAM_TAX_R.create("T")), dtlL,
				DtlR.$tax_cd);
	}
	protected static FXUCL_MCDbcCache<MAM_TAX_R> getTaxCache() {
		return object(CLAZZ)._taxCache;
	}
	
	/**
	 * PurcRet_Ins01オペレーション.<p>
	 *
	 * 仕入返品を新規登録する<br>
	 */
	public class PurcRet_Ins01 extends MSBDL_PurcRetRegService_MC_A.PurcRet_Ins01 {
		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			
			HdrL<HdrR> up0 = up0();
			DtlL<DtlR> up1 = up1();
			IoL<IoR> up2 = up2();
			
			splitHdr(up0, up1, up2);

			MCJoinKey<HdrL<HdrR>> d2h = up1.join(DtlR.$hdr_peg_no, up0, HdrR.$peg_no);
			MCJoinKey<DtlL<DtlR>> i2d = up2.join(IoR.$dtl_peg_no, up1, DtlR.$peg_no);
			MCJoinKey<DtlL<DtlR>> h2d = up0.join(HdrR.$peg_no, up1, DtlR.$hdr_peg_no);
			MCJoinKey<IoL<IoR>> d2i = up1.join(DtlR.$peg_no, up2, IoR.$dtl_peg_no);

			editUpForSave(up0, up1, up2, d2h, i2d, this);

			setPurcRetActRev(up0, up1, up2, d2h, i2d, null, this);
			
			doSave(up0, up1, up2, d2h, i2d, h2d, d2i, null, null, null, this);
			
			setSplitMsg(up0, null);
			setDown();
		}

		protected HdrL<HdrR> splitHdr(HdrL<HdrR> hdrList, DtlL<DtlR> dtlList, IoL<IoR> ioList) {
			// 分割処理により追加されるヘッダのリスト
			HdrL<HdrR> addHdrList = HdrL.createMS_MSBDL5170_Hdr(HdrR.class);
			MCNumber maxHdrPegNo = (MCNumber) hdrList.max(HdrR.$peg_no);

			MCIndexKey dtlKey = dtlList.createIndex(DtlR.$hdr_peg_no);

			setTax(dtlList);

			// ヘッダ毎に分割チェック
			for (HdrR hdrRow : hdrList) {

				// 仕入税計算区分が「行単位」の場合は、分割しない
				MAM_BP_R sppl = getSpplCache().get(hdrRow.sppl_cd());
				if (MAC_TAX_CALC_TYP.isLINE(sppl.purc_tax_calc_typ())) {
					continue;
				}

				MCList<DtlR> dtlL = dtlList.subList(dtlKey, hdrRow.peg_no());

				MCList<DtlR>[] taxGrpArray = dtlL.groupList(DtlR.$tax_rate);

				if (taxGrpArray.length == 1) {
					continue;
				}
				hdrRow.split_flg(true);
				for (int i = 0; i < taxGrpArray.length; i++) {
					MCList<DtlR> dtlTaxL = taxGrpArray[i];
					setDispSeq(dtlTaxL);

					if (i == 0) {
						continue;
					}
					HdrR addHdrRow = hdrRow.clone();
					maxHdrPegNo = maxHdrPegNo.add(1);
					addHdrRow.setStatus(Status.CREATE);
					addHdrRow.peg_no(maxHdrPegNo);
					addHdrList.add(addHdrRow);
					
					for(DtlR dtlTaxR : dtlTaxL){
						dtlTaxR.hdr_peg_no(maxHdrPegNo);
					}
				}

			}
			
			// ヘッダが追加された場合は上り電文に追加する
			if (!addHdrList.isEmpty()) {
				hdrList.addAll(addHdrList);
			}
			return addHdrList;

		}


		/**
		 * 下り電文の設定
		 */
		protected void setDown() {
			down0().addAll(up0());
			down1().addAll(up1());
			down2().addAll(up2());
		}
	}

	/**
	 * 税情報の設定
	 */
	protected void setTax(DtlL<DtlR> dtlList) {
		createTaxCache(dtlList);
		for (DtlR r : dtlList) {
			MAM_TAX_R taxRow = getTaxCache().get(r.tax_cd());
			// 税率を税マスタから補完
			r.tax_rate(taxRow.tax_rate());
		}
	}

	/**
	 * PurcRet_Upd01オペレーション.<p>
	 *
	 * 仕入返品を更新する<br>
	 */
	public class PurcRet_Upd01 extends MSBDL_PurcRetRegService_MC_A.PurcRet_Upd01 {

		protected MCJoinKey<MCList<IoR>> _ai2bi = null;
		protected MCJoinKey<MCList<DtlR>> _ad2bd = null;
		protected MCJoinKey<MCList<HdrR>> _ah2bh = null;
		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			HdrL<HdrR> up0 = up0();
			DtlL<DtlR> up1 = up1();
			IoL<IoR> up2 = up2();
			
			HdrL<HdrR> insHdrList = HdrL.createMS_MSBDL5170_Hdr(HdrR.class);
			DtlL<DtlR> insDtlList = DtlL.createMS_MSBDL5170_Dtl(DtlR.class);
			IoL<IoR> insIoList = IoL.createMS_MSBDL5170_Io(IoR.class);
			splitHdr(insHdrList, insDtlList, insIoList);
			
			MCJoinKey<HdrL<HdrR>> d2h = up1.join(DtlR.$hdr_peg_no, up0, HdrR.$peg_no);
			MCJoinKey<DtlL<DtlR>> i2d = up2.join(IoR.$dtl_peg_no, up1, DtlR.$peg_no);
			MCJoinKey<DtlL<DtlR>> h2d = up0.join(HdrR.$peg_no, up1, DtlR.$hdr_peg_no);
			MCJoinKey<IoL<IoR>> d2i = up1.join(DtlR.$peg_no, up2, IoR.$dtl_peg_no);


			editUpForSave(up0, up1, up2, d2h, i2d, this);
			
			cacheBeforeTran();

			setPurcRetActRev(up0, up1, up2, d2h, i2d, _ah2bh, this);
			
			doSave(up0, up1, up2, d2h, i2d, h2d, d2i, _ah2bh, _ad2bd, _ai2bi, this);
	
			
			insSplitHdr(insHdrList, insDtlList, insIoList);
			
			setSplitMsg(up0, insHdrList);
			
			setDown();
		}
		



		/**
		 * 伝票分割を行う。
		 * @param insHdrL　分割後ヘッダ（新規）
		 * @param insDtlL　分割後明細（新規）
		 * @param insIoL　分割後受払（新規）
		 * @return
		 */
		protected void splitHdr(HdrL<HdrR> insHdrL, DtlL<DtlR> insDtlL, IoL<IoR> insIoL) {
			
			MCNumber maxHdrPegNo = (MCNumber) up0().max(HdrR.$peg_no);
			MCIndexKey dtlKey = up1().createIndex(DtlR.$hdr_peg_no);
			MCIndexKey ioKey = up2().createIndex(IoR.$dtl_peg_no);
			DtlL<DtlR> delDtlL = DtlL.createMS_MSBDL5170_Dtl(DtlR.class);
			IoL<IoR> delIoL = IoL.createMS_MSBDL5170_Io(IoR.class);
			
			setTax(insDtlL);
			
			// ヘッダ毎に分割チェック
			for (HdrR hdrRow : up0()) {

				// 仕入税計算区分が「行単位」の場合は、分割しない
				MAM_BP_R sppl = getSpplCache().get(hdrRow.sppl_cd());
				if (MAC_TAX_CALC_TYP.isLINE(sppl.purc_tax_calc_typ())) {
					continue;
				}

				DtlL<DtlR> dtlL = up1().subList(dtlKey, hdrRow.peg_no());
				DtlL<DtlR> tgtDtlL = DtlL.createMS_MSBDL5170_Dtl(DtlR.class);
				// 削除を除いたリストを作成
				// 削除行は元の伝票から削除するので、このメソッドで編集しない
				for (DtlR r : dtlL) {
					if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						tgtDtlL.add(r);
					}
				}
				
				MCList<DtlR>[] taxGrpArray = tgtDtlL.groupList(DtlR.$tax_rate);
				// 税率が1種類の場合は分割しない。更新用リストにセットするだけ。
				if (taxGrpArray.length == 1) {
					continue;
				}
				
				hdrRow.split_flg(true);
				// 税率ごとにヘッダを作成する。
				for (int i = 0; i < taxGrpArray.length; i++) {

					MCList<DtlR> dtlTaxL = taxGrpArray[i];
					setDispSeq(dtlTaxL);
					if (i == 0) {
						continue;
					}
					
					// 分割後のヘッダの2件目以降は新規伝票として新規のリストに追加
					HdrR addHdrRow = hdrRow.clone();
					maxHdrPegNo = maxHdrPegNo.add(1);
					addHdrRow.peg_no(maxHdrPegNo);
					clearInsHdr(addHdrRow);
					
					insHdrL.add(addHdrRow);
					
					for (DtlR dtlTaxTempR : dtlTaxL) {

						// 新規登録分（明細）
						DtlR dtlTaxR = dtlTaxTempR.clone();
						dtlTaxR.hdr_peg_no(maxHdrPegNo);
						clearInsDtl(dtlTaxR);
						insDtlL.add(dtlTaxR);
						MCList<IoR> tgtIoTempList = up2().subList(ioKey, dtlTaxTempR.peg_no());

						// 新規登録分（受払）
						MCList<IoR> tgtIoList = tgtIoTempList.clone();
						for (IoR ioR : tgtIoList) {
							if (!MAC_DATA_CRUD_TYP.isDEL(ioR.data_crud_typ())) {
								clearInsIo(ioR);
								insIoL.add(ioR);
							}
						}
						
						// 更新分（明細・受払）
						if (!MAC_DATA_CRUD_TYP.isCRT(dtlTaxTempR.data_crud_typ())) {
							// 新規行以外は元の伝票から行削除
							dtlTaxTempR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
							for (IoR ioR : tgtIoTempList) {
								if (!MAC_DATA_CRUD_TYP.isCRT(ioR.data_crud_typ())) {
									ioR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
								}
								else {
									delIoL.add(ioR);
								}
							}
						}
						else {
							// 新規行の場合は別ヘッダで新規登録になるので、上り電文からは削除
							delDtlL.add(dtlTaxTempR);
							delIoL.addAll(tgtIoTempList);
						}
					}
				}

			}
			
			// 行追加で、別ヘッダに分割された分は上り電文から削除
			// ※元の伝票に含めてはいけない為
			up1().removeAll(delDtlL);
			up2().removeAll(delIoL);
		}
		
		protected void clearInsHdr(HdrR addHdrRow) {
			addHdrRow.setStatus(Status.CREATE);
			addHdrRow.purc_ret_act_no(null);
			addHdrRow.purc_ret_act_rev(null);
			addHdrRow.purc_ret_print_flg(false);
			addHdrRow.purc_ret_print_dt(null);
			addHdrRow.split_flg(false);
			addHdrRow.can_ac_dt(null);
		}
		
		protected void clearInsDtl(DtlR dtlTaxR) {
			dtlTaxR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			dtlTaxR.purc_ret_act_d_no(null);
			dtlTaxR.purc_ret_act_no(null);
			dtlTaxR.purc_ret_act_rev(null);
			dtlTaxR.purc_dtl_upd_flg(false);
		}
		
		protected void clearInsIo(IoR ioR) {
			ioR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			ioR.purc_ret_act_io_no(null);
			ioR.purc_ret_act_d_no(null);
		}

		/**
		 * 伝票分割で分割されたヘッダを新規登録する
		 * @param insHdrL　分割後ヘッダ（新規）
		 * @param insDtlL　分割後明細（新規）
		 * @param insIoL　分割後受払（新規）
		 * @return
		 */
		protected void insSplitHdr(HdrL<HdrR> insHdrList, DtlL<DtlR> insDtlList, IoL<IoR> insIoList) {
			// 伝票分割により新規伝票として登録するデータは、PurcRet_Ins01オペレーションで処理する
			MSBDL_PurcRetRegService.PurcRet_Ins01 ope = MSBDL_PurcRetRegService.crtPurcRet_Ins01();
			ope.up0().setAll(insHdrList);
			ope.up1().setAll(insDtlList);
			ope.up2().setAll(insIoList);
			ope.exec();
		}
		
		protected void cacheBeforeTran() {
			HdrL<HdrR> hl = getPurcRetActCache(up0());
			DtlL<DtlR> dl = getPurcRetActDCache(up0());
			IoL<IoR> il = getPurcRetActIoCache(up0());
			
			_ah2bh = up0().join(HdrR.$purc_ret_act_no, hl, HdrR.$purc_ret_act_no);			
			_ad2bd = up1().join(DtlR.$purc_ret_act_d_no, dl, DtlR.$purc_ret_act_d_no);
			_ai2bi = up2().join(IoR.$purc_ret_act_io_no, il, IoR.$purc_ret_act_io_no);
		}
		
		
		protected void setDown() {
			down0().addAll(up0());
			down1().addAll(up1());
			down2().addAll(up2());
		}
	}

	protected HdrL<HdrR> _purcRetActCache = null;

	protected static HdrL<HdrR> getPurcRetActCache(HdrL<HdrR> hl) {
		HdrL<HdrR> l = object(CLAZZ)._purcRetActCache;
		
		if (l == null) {
			l = object(CLAZZ)._purcRetActCache = hl.createInstance();
			MST_PURC_RET_ACT_R t = HdrR.create("T");
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
			MST_PURC_ACT_R act = MST_PURC_ACT_R.create("ACT");
			l_bldr.addSelect(act.purc_act_no);
			l_bldr.addSelect(act.purc_act_seq);
			// 売上返品登録に返すための項目
			l_bldr.addLeftOuterJoin(act, bracket(t.purc_ret_act_no.eq(act.purc_ret_act_no)
					.and(t.purc_ret_act_rev.eq(act.purc_ret_act_rev))
					.and(act.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))));
			dbSelectKey("MSBDL5170_MST_PURC_RET_ACT_S01", l, l_bldr, hl);
		}
		return l;
	}

	protected static HdrL<HdrR> getPurcRetActCache() {
		return object(CLAZZ)._purcRetActCache;
	}

	/**
	 * PurcRet_Del01オペレーション.<p>
	 *
	 * 仕入返品を削除する<br>
	 */
	public class PurcRet_Del01 extends MSBDL_PurcRetRegService_MC_A.PurcRet_Del01 {

		protected MCJoinKey<MCList<IoR>> _ai2bi = null;
		protected MCJoinKey<MCList<DtlR>> _ad2bd = null;
		protected MCJoinKey<MCList<HdrR>> _ah2bh = null;
		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			HdrL<HdrR> up0 = up0();
			DtlL<DtlR> up1 = up1();
			IoL<IoR> up2 = up2();

			MCJoinKey<HdrL<HdrR>> d2h = up1.join(DtlR.$hdr_peg_no, up0, HdrR.$peg_no);
			MCJoinKey<DtlL<DtlR>> i2d = up2.join(IoR.$dtl_peg_no, up1, DtlR.$peg_no);
			MCJoinKey<DtlL<DtlR>> h2d = up0.join(HdrR.$peg_no, up1, DtlR.$hdr_peg_no);
			MCJoinKey<IoL<IoR>> d2i = up1.join(DtlR.$peg_no, up2, IoR.$dtl_peg_no);

			editUpForSave(up0, up1, up2, d2h, i2d, this);

			cacheBeforeTran();

			setPurcRetActRev(up0, up1, up2, d2h, i2d, _ah2bh, this);
			
			doSave(up0, up1, up2, d2h, i2d, h2d, d2i, _ah2bh, _ad2bd, _ai2bi, this);
		}
		

		protected void cacheBeforeTran() {
			HdrL<HdrR> hl = getPurcRetActCache(up0());
			DtlL<DtlR> dl = getPurcRetActDCache(up0());
			IoL<IoR> il = getPurcRetActIoCache(up0());
			
			_ah2bh = up0().join(HdrR.$purc_ret_act_no, hl, HdrR.$purc_ret_act_no);			
			_ad2bd = up1().join(DtlR.$purc_ret_act_d_no, dl, DtlR.$purc_ret_act_d_no);
			_ai2bi = up2().join(IoR.$purc_ret_act_io_no, il, IoR.$purc_ret_act_io_no);
		}
	}
	/**
	 * PurcRet_Chk01オペレーション.<p>
	 *
	 * 仕入返品登録前チェック処理<br>
	 */
	public class PurcRet_Chk01 extends MSBDL_PurcRetRegService_MC_A.PurcRet_Chk01 {
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			HdrL<HdrR> c0 = up0();
			DtlL<DtlR> c1 = up1();
			IoL<IoR> c2 = up2();
			
			editUpForChk(c0, c1, c2, null, null, null, this);
			complProcUpriAmt(c0, c1);
			doChk(c0, c1, c2, null, null, null, this);
			setDown();
		}
				
		/**
		 * 上り電文を下り電文に設定します。
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}
	}
	
	/**
	 * PurcRet_Chk02オペレーション.<p>
	 *
	 * 仕入返品更新前チェック処理<br>
	 */
	public class PurcRet_Chk02 extends MSBDL_PurcRetRegService_MC_A.PurcRet_Chk02 {
		protected MCJoinKey<MCList<IoR>> _ai2bi = null;
		protected MCJoinKey<MCList<DtlR>> _ad2bd = null;
		protected MCJoinKey<MCList<HdrR>> _ah2bh = null;
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			HdrL<HdrR> c0 = up0();
			DtlL<DtlR> c1 = up1();
			IoL<IoR> c2 = up2();
			cacheBeforeTran();
			editUpForChk(c0, c1, c2, _ah2bh, _ad2bd, _ai2bi, this);
			complProcUpriAmt(c0, c1);
			doChk(c0, c1, c2, _ah2bh, _ad2bd, _ai2bi, this);
			setDown();
		}

		protected void cacheBeforeTran() {
			HdrL<HdrR> hl = getPurcRetActCache(up0());
			DtlL<DtlR> dl = getPurcRetActDCache(up0());
			IoL<IoR> il = getPurcRetActIoCache(up0());
			_ah2bh = up0().join(HdrR.$purc_ret_act_no, hl, HdrR.$purc_ret_act_no);
			_ad2bd = up1().join(DtlR.$purc_ret_act_d_no, dl, DtlR.$purc_ret_act_d_no);
			_ai2bi = up2().join(IoR.$purc_ret_act_io_no, il, IoR.$purc_ret_act_io_no);
		}
		/**
		 * 上り電文を下り電文に設定します。
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}
	}
	
	/**
	 * PurcRet_Chk03オペレーション.<p>
	 *
	 * 仕入返品削除前チェック処理<br>
	 */
	public class PurcRet_Chk03 extends MSBDL_PurcRetRegService_MC_A.PurcRet_Chk03 {
		protected MCJoinKey<MCList<IoR>> _ai2bi = null;
		protected MCJoinKey<MCList<DtlR>> _ad2bd = null;
		protected MCJoinKey<MCList<HdrR>> _ah2bh = null;
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			HdrL<HdrR> c0 = up0();
			DtlL<DtlR> c1 = up1();
			IoL<IoR> c2 = up2();

			cacheBeforeTran();
			compl(up0());
			editUpForChk(c0, c1, c2, _ah2bh, _ad2bd, _ai2bi, this);
			doChk(c0, c1, c2, _ah2bh, _ad2bd, _ai2bi, this);
			setDown();
		}

		protected void compl(HdrL<HdrR> hL){
			MCIndexKey k = getPurcRetActCache().createIndex(HdrR.$purc_ret_act_no);
			for(HdrR hR : hL){
				HdrR befR = getPurcRetActCache().getFirst(k, hR.purc_ret_act_no());
				hR.purc_act_no(befR.purc_act_no());
				hR.purc_act_seq(befR.purc_act_seq());
			}
		}
		
		protected void cacheBeforeTran() {
			HdrL<HdrR> hl = getPurcRetActCache(up0());
			DtlL<DtlR> dl = getPurcRetActDCache(up0());
			IoL<IoR> il = getPurcRetActIoCache(up0());
			_ah2bh = up0().join(HdrR.$purc_ret_act_no, hl, HdrR.$purc_ret_act_no);
			_ad2bd = up1().join(DtlR.$purc_ret_act_d_no, dl, DtlR.$purc_ret_act_d_no);
			_ai2bi = up2().join(IoR.$purc_ret_act_io_no, il, IoR.$purc_ret_act_io_no);
		}
		/**
		 * 上り電文を下り電文に設定します。
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		
		/**
		 * 削除チェック及び削除オペレーションで使用する明細を返します。
		 * 
		 * @param hdrL ヘッダ情報
		 * @return 明細
		 */
		public DtlL<DtlR> getPurcRetActD(HdrL<HdrR> hdrL) {
			DtlL<DtlR> u = getPurcRetActDImpl(hdrL, true);
			for (DtlR dr : u) {
				dr.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				dr.setStatus(MCRow.DELETE);
			}
			return u;
		}
				
		/**
		 * 削除チェック及び削除オペレーションで使用する受払を返します。
		 * 
		 * @param dtlL 明細情報
		 * @return 受払
		 */
		public IoL<IoR> getPurcRetActIo(DtlL<DtlR> dtlL) {

			IoL<IoR> u = getPurcRetActIoImpl(dtlL, true);
			
			for (IoR dr : u) {
				dr.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				dr.setStatus(MCRow.DELETE);
			}
			return u;
		}
	}
	
	/**
	 * 明細を返します。
	 * 
	 * @param hdrL ヘッダ情報
	 * @param selectItmStkMngTyp 在庫管理区分を品目から取得するかどうか
	 * @return 明細
	 */
	public static DtlL<DtlR> getPurcRetActDImpl(HdrL<HdrR> hdrL, boolean selectItmStkMngTyp) {
		DtlL<DtlR> u = DtlL.createMS_MSBDL5170_Dtl(DtlR.class);
		MST_PURC_RET_ACT_D_R t = DtlR.create("T");
		MCQueryApiBuilder u_bldr = MCQueryApiBuilder.create(t);
		MAM_LOC_R m04 = MAM_LOC_R.create("M04");
		MAM_ITM_R itm = MAM_ITM_R.create("ITM");
		MCTempView v1 = createTempView("V1");
		MST_PURC_ACT_D_R S1T02 = MST_PURC_ACT_D_R.create("T02");
		MST_PURC_ACT_R S1T04 = MST_PURC_ACT_R.create("T04");
		u_bldr.addSelect(m04.sppl_cd.as("purc_ret_sppl_cd"));
		u_bldr.addLeftOuterJoin(m04, bracket( t.purc_ret_loc_cd.eq(m04.loc_cd)));

		if (selectItmStkMngTyp) {
			u_bldr.removeSelect(DtlR.$stk_mng_typ);
			u_bldr.addSelect(itm.stk_mng_typ);
			u_bldr.addLeftOuterJoin(itm, bracket(t.itm_cd.eq(itm.itm_cd)
							.and(t.itm_sub1.eq(itm.itm_sub1))
							.and(t.itm_sub2.eq(itm.itm_sub2))
							.and(t.itm_sub3.eq(itm.itm_sub3))));
		}

		u_bldr.addSelect(v1.pr("ptax_cur_tax_amt"));
		u_bldr.addSelect(v1.pr("purc_act_d_no"));
		u_bldr.addSelect(v1.pr("purc_act_d_seq"));
		u_bldr.addSelect(v1.pr("purc_act_no"));
		u_bldr.addLeftOuterJoin(subQuery().select(S1T02.prAll())
				.from(S1T02.innerJoin(S1T04).on(bracket(S1T02.purc_act_no.eq(S1T04.purc_act_no)
								.and(S1T02.purc_act_seq.eq(S1T04.purc_act_seq))
								.and(value(true).eq(MAC_SLIP_STS_TYP$IS_CRT(S1T04.slip_sts_typ))))))
				.view(v1), bracket(t.purc_ret_act_d_no.eq(v1.pr("purc_ret_act_d_no"))));
		addTrdUnitSelect(u, u_bldr, t);
		u_bldr.addConstWhereWithAnd(t.can_flg.eq(value(false)));
		dbSelectColumn("MSBDL5170_MST_PURC_RET_ACT_D_S01", u, u_bldr,
				MST_PURC_RET_ACT_D_R.$purc_ret_act_no, hdrL, HdrR.$purc_ret_act_no);
		
		int cnt = 0;
		MCIndexKey d2h = hdrL.createIndex(HdrR.$purc_ret_act_no);
		for (DtlR dr : u) {
			dr.peg_no(++cnt);
			dr.hdr_peg_no(hdrL.getFirst(d2h, dr.purc_ret_act_no()).peg_no());
		}
		return u;
	}
			
	/**
	 * 受払を返します。
	 * 
	 * @param dtlL 明細情報
	 * @param selectItmStkMngTyp 在庫管理区分を品目から取得するかどうか
	 * @return 受払
	 */
	public static IoL<IoR> getPurcRetActIoImpl(DtlL<DtlR> dtlL, boolean selectItmStkMngTyp) {
		IoL<IoR> u = IoL.createMS_MSBDL5170_Io(IoR.class);
		MST_PURC_RET_ACT_IO_R t = IoR.create("T");
		MCQueryApiBuilder u_bldr = MCQueryApiBuilder.create(t);
		MAM_LOC_R m04 = MAM_LOC_R.create("M04");
		MST_PURC_RET_ACT_D_R t2 = MST_PURC_RET_ACT_D_R.create("T2");
		MAM_ITM_R itm = MAM_ITM_R.create("ITM");
		u_bldr.addSelect(m04.sppl_cd.as("purc_ret_sppl_cd"));
		u_bldr.addInnerJoin(m04, bracket( t.purc_ret_loc_cd.eq(m04.loc_cd)));
		u_bldr.addSelect(t2.itm_cd, t2.itm_sub1, t2.itm_sub2, t2.itm_sub3);
		u_bldr.addLeftOuterJoin(t2, bracket( t.purc_ret_act_d_no.eq(t2.purc_ret_act_d_no)));
		
		if (selectItmStkMngTyp) {
			u_bldr.addSelect(itm.stk_mng_typ);
			u_bldr.addLeftOuterJoin(itm, bracket(t2.itm_cd.eq(itm.itm_cd)
							.and(t2.itm_sub1.eq(itm.itm_sub1))
							.and(t2.itm_sub2.eq(itm.itm_sub2))
							.and(t2.itm_sub3.eq(itm.itm_sub3))));
		}
		else {
			u_bldr.addSelect(t2.stk_mng_typ);
		}
		
		addTrdUnitSelect(u, u_bldr, t2);

		u_bldr.addConstWhereWithAnd(t.can_flg.eq(value(false)));
		dbSelectColumn("MSBDL5170_MST_PURC_RET_ACT_IO_S01", u, u_bldr,
				MST_PURC_RET_ACT_IO_R.$purc_ret_act_d_no, dtlL, DtlR.$purc_ret_act_d_no);
		
		MCIndexKey i2d = dtlL.createIndex(DtlR.$purc_ret_act_d_no);
		int cnt = 0;
		for (IoR dr : u) {
			dr.peg_no(++cnt);
			dr.dtl_peg_no(dtlL.getFirst(i2d, dr.purc_ret_act_d_no()).peg_no());

		}
		return u;
	}
	
	protected static void addTrdUnitSelect(MCList<?> u, MCQueryApiBuilder u_bldr, MCDBContainer itmtblSyn){
		MCDBContainer t = u_bldr.getBaseDbc();
		MAVM_ITM_UNIT_R trd_itm_unit = MAVM_ITM_UNIT_R.create("TRD_ITM_UNIT");
		
		u_bldr.addSelect(trd_itm_unit.conv_base_qty.as("trd_unit_dmn_qty"),
				trd_itm_unit.conv_qty.as("trd_unit_conv_qty"),
				trd_itm_unit.dec_place.as("trd_unit_dec_place"),
				trd_itm_unit.rnd_typ.as("trd_unit_rnd_typ"));
		u_bldr.addLeftOuterJoin(trd_itm_unit,
				bracket(MCQueryApiBuilder.makeEq(t.getColumn$("trd_unit_cd"), trd_itm_unit.unit_cd)
						.and(MCQueryApiBuilder.makeEq(itmtblSyn.getColumn$("itm_cd"), trd_itm_unit.itm_cd))
						.and(MCQueryApiBuilder.makeEq(itmtblSyn.getColumn$("itm_sub1"), trd_itm_unit.itm_sub1))
						.and(MCQueryApiBuilder.makeEq(itmtblSyn.getColumn$("itm_sub2"), trd_itm_unit.itm_sub2))
						.and(MCQueryApiBuilder.makeEq(itmtblSyn.getColumn$("itm_sub3"), trd_itm_unit.itm_sub3))));
		
	}
	/**
	 * 受払とその明細及びヘッダのエラーフラグを設定します。
	 * @param ior 受払
	 * @param i2d 受払から明細を取得するためのキー
	 */
	protected void setErrFlg(IoR ior, MCJoinKey<DtlL<DtlR>> i2d, MCJoinKey<HdrL<HdrR>> d2h) {
		if (ior == null) {
			return;
		}
		ior.err_flg(true);
		DtlR dr = ior.getJoinedRow(i2d);
		setErrFlg(dr, d2h);
	}
	
	
	
	/**
	 * ヘッダを登録します。
	 */
	protected void saveHdr(HdrL<HdrR> up0, MCOperation ope) {
		updSchdHdr(up0);

		MST_PURC_RET_ACT_R up0_t = HdrR.create("T");
		MCQueryApiBuilder up0_bldr = MCQueryApiBuilder.create(up0_t);
		
		if (ope instanceof PurcRet_Ins01) {
			dbInsertEx("MSBDL5170_MST_PURC_RET_ACT_I01", up0, up0_bldr);
		}
		else if (ope instanceof PurcRet_Upd01) {
			up0.setBooleanNE(HdrR.$purc_ret_print_flg, false);
			dbUpdateKey("MSBDL5170_MST_PURC_RET_ACT_U01", up0, up0_bldr);
		}
		else if (ope instanceof PurcRet_Del01) {
			up0_bldr.setSet(up0_t.can_flg);
			up0_bldr.addSet(up0_t.purc_ret_print_flg);
			up0.setBooleanNE(HdrR.$purc_ret_print_flg, false);
			dbUpdateKey("MSBDL5170_MST_PURC_RET_ACT_U02", up0, up0_bldr);
		}
	}
	/**
	 * 仕入返品予定ヘッダの更新カウンタをカウントアップします。
	 * @param up0 上り電文ヘッダ
	 */
	protected void updSchdHdr(HdrL<HdrR> up0) {

		HdrL<HdrR> schd = up0.subList(r -> !isNull(r.purc_ret_schd_no()));
		
		if (schd.size() > 0) {
			dbTsUpdateKey("MSBDL5170_MST_PURC_RET_SCHD_U01",
					schd.groupBy(HdrR.$purc_ret_schd_no),
					MST_PURC_RET_SCHD_R.create("T"));
		}
	}
	
	protected void doSave(
			HdrL<HdrR> up0, DtlL<DtlR> up1, IoL<IoR> up2,
			MCJoinKey<HdrL<HdrR>> d2h, MCJoinKey<DtlL<DtlR>> i2d,
			MCJoinKey<DtlL<DtlR>> h2d, MCJoinKey<IoL<IoR>> d2i, 
			MCJoinKey<MCList<HdrR>> ah2bh, MCJoinKey<MCList<DtlR>> ad2bd, MCJoinKey<MCList<IoR>> ai2bi,
			MCOperation ope) {
		
		saveHdr(up0, ope);
		//支給実績更新
		IoL<IoR> pa_u2 = getProvTgt(ad2bd, ai2bi, up1, up2);
		callProvAct_UpdOpe(pa_u2, up2, d2h, i2d, ope);

		saveDtl(up1);
		saveIo(up2);
		
		//支給実績サービス実行後の明細修正
		editDtlAfterProvAct(up1, d2i);
		
		//仕入実績、受払実績用のDATA_CRUD_TYPの設定
		setPurcDataCrudTyp(up2, 
				d2h, i2d,
				h2d, d2i, 
				ad2bd, ai2bi);
		
		HdrL<HdrR> c_hl = up0.subList(r -> !isNull($purc_act_data_crud_typ));
		DtlL<DtlR> c_dl = createDtlL();
		IoL<IoR> c_il = createIoL();
		c_hl.forEach(hr -> {
			DtlL<DtlR> dl = hr.getJoined(h2d);
			c_dl.addAll(dl);
			dl.forEach(dr -> {
				c_il.addAll(dr.getJoined(d2i));
			});
		});
		
		
		//仕入実績更新
		callPurcAct_Ope(c_hl, c_dl, c_il, h2d, d2i, d2h, i2d, ai2bi, ope);
		
		//完了フラグ更新
		MCList<MST_PURC_RET_SCHD_D_R> schdL = getSchdCmplFlg(up1);
		updSchdCmplFlg(schdL);

		
		//仕入実績で更新されない受払のWKを作成してから更新
		IoL<IoR> tgtio = createIoL();
		tgtio = up2.subList(r -> !isNull(r.getStringNE($io_act_data_crud_typ)));
		callIoActOpe(up0.getFirst(HdrR.$io_make_flg, true) != null, tgtio, d2h, i2d, ope);
		
		//印刷
		callPurcRet_PrntOpe(up0, up1, up2, d2h, i2d, ope);
	}
	
	/**
	 * 支給実績サービス呼び出しの結果変更される値で明細を修正します。
	 */
	protected void editDtlAfterProvAct(DtlL<DtlR> up1, MCJoinKey<IoL<IoR>> d2i) {
		String[] sc = getPurcRetActSyncCheckTgtCols();
		up1.forEach(dr -> {
			MCList<IoR> iol = dr.getJoined(d2i);
			for(String s : sc) {
				//支給実績サービスによって更新された項目
				if (IoR.$stk_id_typ.equals(s)) {
					s = IoR.$after_prov_stk_id_typ;
				}
				MCList<IoR> gl = iol.groupBy(s);
				int gs = gl.size();
				//詳細に複数値が含まれている場合は明細をnullにする
				if (gs > 1){
					dr.setValueNE(s, null);
				}
				//複数値が含まれていない場合は明細にも同じ値を設定する
				else if (gs == 1){
					dr.setValueNE(s, gl.get(0).getValueNE(s));
				}
			}
		});
	}
	/**
	 * 以下の項目に資産管理状況に応じたDATA_CRUD_TYPを設定します。<P>
	 * 項目：{@link #purc_act_data_crud_typ}：仕入実績サービス用のDATA_CRUD_TYP項目(ヘッダ、明細、受払)<br>
	 * 項目：{@link #io_act_data_crud_typ}：受払実績サービス用のDATA_CRUD_TYP項目（受払のみ）<br>
	 */
	protected void setPurcDataCrudTyp(IoL<IoR> up2, 
			MCJoinKey<HdrL<HdrR>> d2h, MCJoinKey<DtlL<DtlR>> i2d,
			MCJoinKey<DtlL<DtlR>> h2d, MCJoinKey<IoL<IoR>> d2i, 
			MCJoinKey<MCList<DtlR>> a2b, MCJoinKey<MCList<IoR>> ai2bi
			) {
		
		Set<HdrR> hset = new HashSet<HdrR>();
		//資産更新対象のものを新規、更新、削除に分ける。
		for (IoR ir : up2) {
			DtlR dr = ir.getJoinedRow(i2d);
			HdrR hr = dr.getJoinedRow(d2h);
			DtlR bdr = null;
			if (a2b != null) {
				bdr = dr.getJoinedRow(a2b);
			}
			IoR bir = null;
			if (ai2bi != null) {
				bir = ir.getJoinedRow(ai2bi);
			}
			
			//新規で資産更新対象
			if (bir == null) {
				if (isCostkTgt(dr, ir)) {
					ir.setStringNE($purc_act_data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
				}
				else {
					ir.setStringNE($purc_act_data_crud_typ, null);
				}
			}
			//削除で資産更新対象、未打切
			else if (MAC_DATA_CRUD_TYP.isDEL(ir.data_crud_typ())) {
				if (isCostkTgt(bdr, bir)){
					ir.setStringNE($purc_act_data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
				}
			}
			//MODIFY または NONEの場合
			else  {
				//資産更新対象であった場合
				if (isCostkTgt(bdr, bir)){
					if (!isCostkTgt(dr, ir)) {
						//仕入実績を削除して返品実績側で受払を作り直し
						ir.setStringNE($purc_act_data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
						ir.setStringNE($io_act_data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
					}
					//それ以外は更新
					else {
						ir.setStringNE($purc_act_data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value());
					}
				}
				//資産更新対象外であった場合
				else {
					if ( isCostkTgt(dr, ir)) {
						//仕入実績を作成し仕入れ実績側で受払を作成してもらう
						ir.setStringNE($purc_act_data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
						ir.setStringNE($io_act_data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
					}
				}
				
			}
			
			//変更前も変更後も資産更新対象外の場合は仕入返品サービス内で受払実績を作成するため、受払用の設定をする
			if (isNull(ir.getStringNE($purc_act_data_crud_typ))) {
				if (MAC_DATA_CRUD_TYP.isCRT(ir.data_crud_typ())) {
					ir.setStringNE($io_act_data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(ir.data_crud_typ())) {
					ir.setStringNE($io_act_data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
				}
				else {
					ir.setStringNE($io_act_data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value());
				}
			}

			hset.add(hr);
		}
		updateDataCrudTyp(hset, h2d, d2i, $purc_act_data_crud_typ);
		
	}
	
	protected void updateDataCrudTyp(Set<HdrR> hset, 
			MCJoinKey<DtlL<DtlR>> h2d, MCJoinKey<IoL<IoR>> d2i, String dctCol) {
		hset.forEach(hr -> {
			boolean dc = false;
			boolean du = false;
			boolean dd = false;
			for (DtlR dr : hr.getJoined(h2d)){
				boolean ic = false;
				boolean iu = false;
				boolean id = false;
				for (IoR ir : dr.getJoined(d2i))  {
					String ict = ir.getStringNE(dctCol);
					if (isNull(ict)) {
						continue;
					}
					if (MAC_DATA_CRUD_TYP.isCRT(ict)) {
						ic = true;
					}
					else if (MAC_DATA_CRUD_TYP.isUPD(ict)) {
						iu = true;
					}
					else {
						id = true;
					}
				}
				if (!ic && !iu && !id) {
					continue;
				}
				else if (ic && !iu && !id) {
					dr.setStringNE(dctCol, MAC_DATA_CRUD_TYP.CRT.value());
					dc = true;
				}
				else if (!ic && !iu && id) {
					dr.setStringNE(dctCol, MAC_DATA_CRUD_TYP.DEL.value());
					dd = true;
				}
				else {
					dr.setStringNE(dctCol, MAC_DATA_CRUD_TYP.UPD.value());
					du = true;
				}
			}
			if (!dc && !du && !dd) {
				hr.setStringNE(dctCol, null);
			}
			else if (dc && !du && !dd) {
				hr.setStringNE(dctCol, MAC_DATA_CRUD_TYP.CRT.value());
			}
			else if (!dc && !du && dd) {
				hr.setStringNE(dctCol, MAC_DATA_CRUD_TYP.DEL.value());
			}
			else {
				hr.setStringNE(dctCol, MAC_DATA_CRUD_TYP.UPD.value());
			}
		});
	}
	
	protected void callPurcAct_Ope(
			HdrL<HdrR> up0, DtlL<DtlR> up1, IoL<IoR> up2,
			MCJoinKey<DtlL<DtlR>> h2d, MCJoinKey<IoL<IoR>> d2i,
			MCJoinKey<HdrL<HdrR>> d2h, MCJoinKey<DtlL<DtlR>> i2d, 
			MCJoinKey<MCList<IoR>> ai2bi, MCOperation ope) {

		if (up0.size() == 0) {
			return;
		}
		
		//追加対象
		HdrL<HdrR> chl = createHdrL();
		MCList<DtlR> cdl = createDtlL();
		MCList<IoR> cil = createIoL();
		//更新対象
		HdrL<HdrR> uhl = createHdrL();
		MCList<DtlR> udl = createDtlL();
		MCList<IoR> uil = createIoL();
		//削除対象
		HdrL<HdrR> dhl = createHdrL();
		MCList<DtlR> ddl = createDtlL();
		MCList<IoR> dil = createIoL();
		
		up0.forEach(hr -> {
			String hdct = hr.getStringNE($purc_act_data_crud_typ);
			if (MAC_DATA_CRUD_TYP.isCRT(hdct)) {
				chl.add(hr);
				hr.getJoined(h2d).forEach(dr -> {
					if(!isNull(dr.getStringNE($purc_act_data_crud_typ))) {
						cdl.add(dr);
						dr.getJoined(d2i).forEach(ir -> {
							if(!isNull(ir.getStringNE($purc_act_data_crud_typ))) {
								cil.add(ir);
							}
						});
					}
				});
			}
			else if (MAC_DATA_CRUD_TYP.isUPD(hdct)) {
				uhl.add(hr);
				hr.getJoined(h2d).forEach(dr -> {
					if(!isNull(dr.getStringNE($purc_act_data_crud_typ))) {
						udl.add(dr);
						dr.getJoined(d2i).forEach(ir -> {
							if(!isNull(ir.getStringNE($purc_act_data_crud_typ))) {
								uil.add(ir);
							}
						});
					}
				});
			}
			else if (MAC_DATA_CRUD_TYP.isDEL(hdct)) {
				dhl.add(hr);
				hr.getJoined(h2d).forEach(dr -> {
					if(!isNull(dr.getStringNE($purc_act_data_crud_typ))) {
						ddl.add(dr);
						dr.getJoined(d2i).forEach(ir -> {
							if(!isNull(ir.getStringNE($purc_act_data_crud_typ))) {
								dil.add(ir);
							}
						});
					}
				});
			}
		});
		
		//マッピングの準備
		Map_Purc_Ins01_HdrR_HdrR<Purc_Ins01_HdrR, HdrR> hmap
		= createMap_Purc_Ins01_HdrR_HdrR();
		
		Map_Purc_Ins01_DtlR_DtlR<Purc_Ins01_DtlR, DtlR> dmap 
			= createMap_Purc_Ins01_DtlR_DtlR();
		dmap.setWith(d2h);

		Map_Purc_Ins01_IoR_IoR<Purc_Ins01_IoR, IoR> imap 
			= createMap_Purc_Ins01_IoR_IoR();
		imap.setWith(i2d, d2h, ai2bi);
		
		//実行
		if (chl.size() > 0) {
			MSBDL_PurcActRegService.Purc_Ins01 sope = MSBDL_PurcActRegService
					.crtPurc_Ins01();
			sope.up0().io_make_flg(false);
			sope.up0().purc_ret_flg(true);
			sope.up0().amt_calc_flg(up0.get(0).amt_calc_flg());
			addAll(sope.up1(), chl, hmap);
			addAll(sope.up2(), cdl, dmap);
			addAll(sope.up3(), cil, imap);
			sope.exec();

			// 改訂履歴データ更新サービス呼出（仕入返品実績改訂履歴テーブル更新）
			callRevDataServiceIns01(chl);

			//仕入実績サービスで計算された源泉税額を受け取る
			copyWtaxAmt(up1, sope.down1());
		}
		if (udl.size() > 0) {
			MSBDL_PurcActRegService.Purc_Upd01 sope = MSBDL_PurcActRegService
					.crtPurc_Upd01();
			sope.up0().io_make_flg(false);
			sope.up0().purc_ret_flg(true);
			sope.up0().amt_calc_flg(up0.get(0).amt_calc_flg());
			addAll(sope.up1(), uhl, hmap);
			addAll(sope.up2(), udl, dmap);
			addAll(sope.up3(), uil, imap);
			sope.exec();

			// 改訂履歴データ更新サービス呼出（仕入返品実績改訂履歴テーブル更新）
			callRevDataServiceIns01(uhl);
			
			//仕入実績サービスで計算された源泉税額を受け取る
			copyWtaxAmt(up1, sope.down1());
		}
		if (dhl.size() > 0){
			MSBDL_PurcActRegService.Purc_Del01 sope = MSBDL_PurcActRegService
					.crtPurc_Del01();
			sope.up0().io_make_flg(false);
			addAll(sope.up1(), dhl, hmap);
			addAll(sope.up2(), ddl, dmap);
			addAll(sope.up3(), dil, imap);
			sope.exec();

			// 改訂履歴データ更新サービス呼出（仕入返品実績改訂履歴テーブル更新）
			callRevDataServiceIns01(dhl);
		}
		
	}

	/**
	 * 改訂履歴データ更新サービスの改訂履歴データ更新リスト登録処理を呼び出す。
	 * 仕入返品実績改訂履歴テーブルを更新する。
	 * @param purcRetL
	 */
	protected void callRevDataServiceIns01(HdrL<HdrR> purcRetL) {
		if (purcRetL.size() > 0) {
			MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
			for (HdrR r : purcRetL) {
				RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
				opeR.rev_data_src_no(r.purc_ret_act_no());
				opeR.rev_no(r.purc_ret_act_rev());
				opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_PURC_RET_ACT.value());
				ope.up0().add(opeR);
			}
			ope.exec();
		}
	}
		
	protected IoL<IoR> _purcRetActIoCache = null;

	protected static IoL<IoR> getPurcRetActIoCache(HdrL<HdrR> hl) {
		IoL<IoR> l = object(CLAZZ)._purcRetActIoCache;
		if (l == null) {
			return object(CLAZZ)._purcRetActIoCache = getPurcRetActIoImpl(
					getPurcRetActDCache(hl), false);
		}
		return l;
	}
	
	
	/**
	 * データを編集します。
	 */
	protected void editUpForSave(HdrL<HdrR> up0, DtlL<DtlR> up1, IoL<IoR> up2,
			MCJoinKey<HdrL<HdrR>> d2h, MCJoinKey<DtlL<DtlR>> i2d, 
			MCOperation ope) {
		
		
		setCanFlg(up0, up1, up2, ope);
		
		if (ope instanceof PurcRet_Ins01) {
			setPurcRetActNo(up0);
		}
		if (ope instanceof PurcRet_Del01) {
			return;
		}
		setItmNm(up1);
		setPurcRetActDNo(up1, d2h);
		setPurcRetActIoNo(up2, i2d);
	}

	/**
	 * 明細を登録します。
	 * @param up1 明細
	 */
	protected void saveDtl(DtlL<DtlR> up1){
		DtlL<DtlR> ins = up1.createInstance();
		DtlL<DtlR> upd = up1.createInstance();
		DtlL<DtlR> canUpd = up1.createInstance();
		DtlL<DtlR> dsOnly = up1.createInstance();
		
		up1.forEach(r -> {
			String dct = r.data_crud_typ();
			if (MAC_DATA_CRUD_TYP.isCRT(dct)) {
				ins.add(r);
			}
			else if (MAC_DATA_CRUD_TYP.isUPD(dct)) {
				upd.add(r);
			}
			else if (MAC_DATA_CRUD_TYP.isDEL(dct)) {
				canUpd.add(r);
			}
			else {
				dsOnly.add(r);
			}
		});

		MST_PURC_RET_ACT_D_R t = DtlR.create("T");
		MCQueryApiBuilder canUpd_bldr = MCQueryApiBuilder.create(t);
		MCQueryApiBuilder dsOnly_bldr = MCQueryApiBuilder.create(t);
		dbInsertEx("MSBDL5170_MST_PURC_RET_ACT_D_I01", ins, MCQueryApiBuilder.create(t));
		dbUpdateKey("MSBDL5170_MST_PURC_RET_ACT_D_U01", upd, MCQueryApiBuilder.create(t));
		canUpd_bldr.setSet(t.can_flg);
		dbUpdateKey("MSBDL5170_MST_PURC_RET_ACT_D_U02", canUpd, canUpd_bldr);
		dsOnly_bldr.setSet(t.purc_ret_act_rev, t.disp_seq);
		dbUpdateKey("MSBDL5170_MST_PURC_RET_ACT_D_U03", dsOnly, dsOnly_bldr);
	}
	/**
	 *　仕入返品実績受払を登録します。
	 * @param up2 受払
	 */
	protected void saveIo(IoL<IoR> up2){
		IoL<IoR> ins = up2.createInstance();
		IoL<IoR> upd = up2.createInstance();
		IoL<IoR> canUpd = up2.createInstance();
		IoL<IoR> otherUpd = up2.createInstance();
		
		up2.forEach(r -> {
			String dct = r.data_crud_typ();
			if (MAC_DATA_CRUD_TYP.isCRT(dct)) {
				ins.add(r);
			}
			else if (MAC_DATA_CRUD_TYP.isUPD(dct)) {
				upd.add(r);
			}
			else if (MAC_DATA_CRUD_TYP.isDEL(dct)) {
				canUpd.add(r);
			}
			else {
				otherUpd.add(r);
			}
		});
		
		MST_PURC_RET_ACT_IO_R t = IoR.create("T");
		MCQueryApiBuilder canUpd_bldr = MCQueryApiBuilder.create(t);
		MCQueryApiBuilder otherUpd_bldr = MCQueryApiBuilder.create(t);
		dbInsertEx("MSBDL5170_MST_PURC_RET_ACT_IO_I01", ins, MCQueryApiBuilder.create(t));
		dbUpdateKey("MSBDL5170_MST_PURC_RET_ACT_IO_U01", upd, MCQueryApiBuilder.create(t));
		canUpd_bldr.setSet(t.can_flg);
		dbUpdateKey("MSBDL5170_MST_PURC_RET_ACT_IO_U02", canUpd, canUpd_bldr);
		otherUpd_bldr.setSet(t.purc_ret_act_rev);
		dbUpdateKey("MSBDL5170_MST_PURC_RET_ACT_IO_U03", otherUpd, otherUpd_bldr);
	}
	
	protected void doChk(HdrL<HdrR> c0, DtlL<DtlR> c1, IoL<IoR> c2, 
			MCJoinKey<MCList<HdrR>> ah2bh, MCJoinKey<MCList<DtlR>> ad2bd, MCJoinKey<MCList<IoR>> ai2bi, MCOperation ope) {

		
		MCJoinKey<HdrL<HdrR>> d2h = c1.join(DtlR.$hdr_peg_no, c0, HdrR.$peg_no);
		MCJoinKey<DtlL<DtlR>> i2d = c2.join(IoR.$dtl_peg_no, c1, DtlR.$peg_no);
		MCJoinKey<DtlL<DtlR>> h2d = c0.join(HdrR.$peg_no, c1, DtlR.$hdr_peg_no);
		MCJoinKey<IoL<IoR>> d2i = c1.join(DtlR.$peg_no, c2, IoR.$dtl_peg_no);

		//オペレーション固有のデータチェック
		chkData(c0, c1, c2, d2h, i2d, d2i, ope);
		c0 = c0.subList(r -> !r.err_flg());
		if (c0.size() == 0) {
			return;
		}
		
		
		//支給実績サービス更新前チェック
		c1 = c1.subList(r -> !r.getJoinedRow(d2h).err_flg());
		c2 = c2.subList(r -> !r.getJoinedRow(i2d).err_flg());
		IoL<IoR> pa_c2 = getProvTgt(ad2bd, ai2bi, c1, c2);
		callProvAct_ChkOpe(pa_c2, d2h, i2d, ope);
		c0 = c0.subList(r -> !r.err_flg());
		if (c0.size() == 0) {
			return;
		}
		
		//仕入実績サービス更新前チェック
		c1 = c1.subList(r -> !r.getJoinedRow(d2h).err_flg());
		c2 = c2.subList(r -> !r.getJoinedRow(i2d).err_flg());
		
		//仕入実績、受払実績用のDATA_CRUD_TYPの設定
		setPurcDataCrudTyp(c2, 
				d2h, i2d,
				h2d, d2i, 
				ad2bd, ai2bi);
		
		HdrL<HdrR> c_hl = c0.subList(r -> !isNull(r.getStringNE($purc_act_data_crud_typ)));
		DtlL<DtlR> c_dl = createDtlL();
		IoL<IoR> c_il = createIoL();
		c_hl.forEach(hr -> {
			DtlL<DtlR> dl = hr.getJoined(h2d);
			c_dl.addAll(dl);
			dl.forEach(dr -> {
				c_il.addAll(dr.getJoined(d2i));
			});
		});
		callPurcAct_ChkOpe(c_hl, c_dl, c_il, h2d, d2i, d2h, i2d, ai2bi, ope);
		c0 = c0.subList(r -> !r.err_flg());
		if (c0.size() == 0) {
			return;
		}


		//締処理提供サービス（締日チェック）
		c1 = c1.subList(r -> !r.getJoinedRow(d2h).err_flg());
		c2 = c2.subList(r -> !r.getJoinedRow(i2d).err_flg());
		//在庫管理するデータのみ使用する
		DtlL<DtlR> cl_c1 = c1.subList(r -> MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ()));
		MCIndexKey clk = cl_c1.createIndex(DtlR.$purc_ret_act_d_no);
		IoL<IoR> cl_c2 = c2.subList(r -> cl_c1.contains(clk, r.purc_ret_act_d_no()));
		callCl_ChkOpe(cl_c2, d2h, i2d, ah2bh, ad2bd, ai2bi, ope);
	}
	
	
	/**
	 * 上り電文を編集します。
	 */
	protected void editUpForChk(HdrL<HdrR> c0, DtlL<DtlR> c1, IoL<IoR> c2,
			MCJoinKey<MCList<HdrR>> ah2bh, MCJoinKey<MCList<DtlR>> ad2bd, MCJoinKey<MCList<IoR>> ai2bi,
			MCOperation ope) {
		setCanFlg(c0, c1, c2, ope);
		createSpplCache(c0);
		createSundryItmCache(c1);
		createItmUnitCache(c2);
		createItmCache(c1);
		if (ad2bd != null) {
			c1.forEach(r -> {
				DtlR br = r.getJoinedRow(ad2bd);
				if (br != null) {
					r.purc_ret_act_no(br.purc_ret_act_no());
				}
			});
		}
		if (ai2bi != null) {
			c2.forEach(r -> {
				IoR br = r.getJoinedRow(ai2bi);
				if (br != null) {
					r.purc_ret_act_d_no(br.purc_ret_act_d_no());
				}
			});
		}
	}
	
	/**
	 * このオペレーション固有のデータチェック処理をします。
	 */
	protected void chkData(HdrL<HdrR> up0, DtlL<DtlR> up1, IoL<IoR> up2,
			MCJoinKey<HdrL<HdrR>> d2h, MCJoinKey<DtlL<DtlR>> i2d, 
			MCJoinKey<IoL<IoR>> d2i, MCOperation ope) {
		
		if (!(ope instanceof PurcRet_Chk03)) {
			DtlL<DtlR> c1 = up1.subList(
					r -> MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) 
					|| MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()));
			IoL<IoR> c2 = up2.subList(
					r -> MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) 
					|| MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()));

			MCIndexKey dk = c1.createIndex(DtlR.$hdr_peg_no);
			MCIndexKey ik = c2.createIndex(IoR.$dtl_peg_no);
			chkStkIdTyp(up0, c1, c2, d2h, i2d, dk, ik);
			checkPurcRetActSyncCols(c1, d2i, d2h);
			chkSundry(up1);
			chkOutsrcUpri(up0, c1, dk);
		}
	}
	
	protected MCMessageList chkDtlAndIo(MCList<Schd_DtlR> up1, MCJoinKey<MCList<Schd_IoR>> d2i) {
		MCMessageList ml = new MCMessageList();
		up1.forEach(dr -> {
			MCList<Schd_IoR> il = dr.getJoined(d2i).subList(ir -> !ir.isStatusDelete());
			//上下段の合計数チェック
			MCNumber isum = il.sum(IoR.$base_unit_qty);
			if (!isSame(dr.base_unit_qty(), isum)) {
				ml.add(new MCMessage(dr, DtlR.$trd_unit_qty, MSBDL0135, 
						dr.base_unit_qty(), isum, toDispGUIIndex(dr)));
			}
			//上下段の有効成分チェック
			if (dr.cont_fctr_flg()) {
				MCNumber ios = il.sum(IoR.$purc_cont_qty);
				if (!isSame(dr.purc_cont_qty(), ios)) {
					ml.add(new MCMessage(dr, Schd_DtlR.$purc_cont_qty, MSBDL0160, 
							dr.purc_cont_qty(), ios, toDispGUIIndex(dr)));
				}
			}
		});
		return ml;
	}
	
	/**
	 * 受払の状態に応じた明細のチェックをします。
	 * @param c1 明細
	 * @param d2i 受払取得用のキー
	 */
	protected void checkPurcRetActSyncCols(DtlL<DtlR> c1, MCJoinKey<IoL<IoR>> d2i, MCJoinKey<HdrL<HdrR>> d2h) {

		String[] sc = getPurcRetActSyncCheckTgtCols();
		c1.forEach(dr -> {
			MCList<IoR> iol = dr.getJoined(d2i).subList(ir -> !MAC_DATA_CRUD_TYP.isDEL(ir.data_crud_typ()));
			for(String s : sc) {
				int gs = iol.groupBy(s).size();
				//受払に複数値が含まれている場合
				if (gs > 1){
					if (!isNullOrNullStr(dr.getValue(s))) {
						setErrFlg(dr, d2h);
						String cn = mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.getLabel(dr, s);
						MCMessagePool.add(new MCMessage(dr, s, MSBDL0087, cn, toDispGUIIndex(dr)));
					}
				}
				//受払全行に同一値が含まれている場合
				else if (gs == 1){
					if (!isNullOrNullStr(dr.getValue(s)) && !isSame(dr.getValue(s), iol.get(0).getValue(s))) {
						setErrFlg(dr, d2h);
						String cn = mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.getLabel(dr, s);
						MCMessagePool.add(new MCMessage(dr, s, MSBDL0019, cn, toDispGUIIndex(dr)));
					}
				}
			}
		});
	}
	/**
	 * 受払の状態に応じた明細のチェックをします。
	 * @param c1 明細
	 * @param d2i 受払取得用のキー
	 */
	protected MCMessageList checkPurcRetSchdSyncCols(MCList<Schd_DtlR> c1, MCJoinKey<MCList<Schd_IoR>> d2i) {
		MCMessageList ml = new MCMessageList();
		String[] sc = getPurcRetSchdSyncCheckTgtCols();
		c1.forEach(dr -> {
			MCList<Schd_IoR> iol = dr.getJoined(d2i).subList(ir -> !ir.isStatusDelete());
			for(String s : sc) {
				int gs = iol.groupBy(s).size();
				//受払に複数値が含まれている場合
				if (gs > 1){
					if (!isNullOrNullStr(dr.getValue(s))){
						String cn = mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.getLabel(dr, s);
						ml.add(new MCMessage(dr, s, MSBDL0087, cn, toDispGUIIndex(dr)));
					}
				}
				//受払全行に同一値が含まれている場合
				else if (gs == 1){
					if (!isNullOrNullStr(dr.getValue(s)) && !isSame(dr.getValue(s), iol.get(0).getValue(s))) {
						String cn = mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.getLabel(dr, s);
						ml.add(new MCMessage(dr, s, MSBDL0019, cn, toDispGUIIndex(dr)));
					}
				}
			}
		});
		return ml;
	}
	/**
	 * 明細とそのヘッダのエラーフラグを設定します。
	 * @param dr 明細
	 * @param d2h 明細からヘッダを取得するためのキー
	 */
	protected void setErrFlg(DtlR dr, MCJoinKey<HdrL<HdrR>> d2h) {
		if (dr == null) {
			return;
		}
		dr.err_flg(true);
		HdrR hr = dr.getJoinedRow(d2h);
		if (hr == null) {
			return;
		}
		hr.err_flg(true);
	}
	
	/**
	 * 仕入返品実績ＮＯを設定します。
	 * @param up0 ヘッダ
	 */
	protected void setPurcRetActNo(HdrL<HdrR> up0) {
		MCList<ElmArgsR> args = MCList.create(ElmArgsR.class);
		for (HdrR hr : up0) {
			ElmArgsR arg = ElmArgsR.create();
			arg.peg_no(hr.peg_no());
			arg.dpt_cd(hr.purc_dpt_cd());
			arg.bp_cd(hr.sppl_cd());
			arg.wg_cd(hr.wg_cd());
			arg.trd_cd(hr.trd_cd());
			arg.dt(hr.purc_ret_dt());
			arg.co_cd(getCo().co_cd());
			args.add(arg);
		}
		setNum(MAC_NUM_BIZ_TYP.PURCRETACT, args);
		String[] srcCols = new String[]{ElmArgsR.$new_no};
		String[] destCols = new String[]{HdrR.$purc_ret_act_no};
		copyByPegNo(up0, destCols, args, srcCols);
		
	}
	/**
	 * 仕入返品実績ＮＯを設定し、必要に応じて仕入返品実績明細ＮＯを発番して設定します。
	 */
	protected void setPurcRetActDNo(DtlL<DtlR> up1, MCJoinKey<HdrL<HdrR>> d2h) {
		doSeqCache(MSC_NUM_SYS_TYP.PURCRETACTD, up1.subList(r -> MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())).size());
		up1.forEach(r -> {
			HdrR hr = r.getJoinedRow(d2h);
			r.purc_ret_act_no(hr.purc_ret_act_no());
			r.purc_ret_act_rev(hr.purc_ret_act_rev());
			if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
				r.purc_ret_act_d_no(getStrSeq(MSC_NUM_SYS_TYP.PURCRETACTD));
			}
		});
	}
	
	/**
	 * 仕入返品実績明細ＮＯを設定し、必要に応じて仕入返品実績受払ＮＯを発番して設定します。
	 */
	protected void setPurcRetActIoNo(IoL<IoR> up2, MCJoinKey<DtlL<DtlR>> i2d) {
		doSeqCache(MSC_NUM_SYS_TYP.PURCRETACTD, up2.subList(r -> MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())).size());
		up2.forEach(r -> {
			r.purc_ret_act_d_no(r.getJoinedRow(i2d).purc_ret_act_d_no());
			r.purc_ret_act_no(r.getJoinedRow(i2d).purc_ret_act_no());
			if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
				r.purc_ret_act_io_no(getStrSeq(MSC_NUM_SYS_TYP.PURCRETACTD));
			}
		});
	}
	/**
	 * 完了フラグを更新します。
	 * @param up1 明細
	 */
	protected void updSchdCmplFlg(MCList<MST_PURC_RET_SCHD_D_R> schdL) {
		MST_PURC_RET_SCHD_D_R t = MST_PURC_RET_SCHD_D_R.create("T");
		MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
		schdL_bldr.setSet(t.cmpl_flg);
		dbUpdateKey("MSBDL5170_MST_PURC_RET_SCHD_D_U01", schdL, schdL_bldr);
	}
	
	/**
	 * 仕入返品予定の完了フラグを更新するためのコンテナを返します。
	 * @param up1 実績明細
	 * @return 予定明細
	 */
	protected MCList<MST_PURC_RET_SCHD_D_R> getSchdCmplFlg(DtlL<DtlR> up1) {
		DtlL<DtlR> schdNos = up1.subList(r -> !isNull(r.purc_ret_schd_d_no()))
					.groupBy(DtlR.$purc_ret_schd_d_no);
		
		//予定数量と実績数量を取得
		MCList<MST_PURC_RET_SCHD_D_R> schdL = MCList.create(MST_PURC_RET_SCHD_D_R.class);
		MST_PURC_RET_SCHD_D_R t = MST_PURC_RET_SCHD_D_R.create("T");
		MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
		MST_PURC_RET_ACT_D_R a = MST_PURC_RET_ACT_D_R.create("A");
		schdL_bldr.setGroupBy(t.purc_ret_schd_d_no, t.abort_flg);
		schdL_bldr.addSum(t.base_unit_qty, "base_unit_qty");
		schdL_bldr.addSum(a.base_unit_qty, "act_base_unit_qty");
		schdL_bldr.addLeftOuterJoin(a, bracket( t.purc_ret_schd_d_no.eq(a.purc_ret_schd_d_no)
				.and(value(false).eq(a.can_flg))));
		dbSelectKey("MSBDL5170_MST_PURC_RET_SCHD_D_S01", schdL, schdL_bldr, schdNos);
		
		schdL.forEach(s -> {
			//残数がゼロの場合完了フラグをONにする
			MCNumber returned = s.getNumberNE("act_base_unit_qty");
			if (!isNull(returned)) {
				MCNumber remain = s.base_unit_qty().add(returned.negate());
				s.cmpl_flg(MCNumber.ZERO.gte(remain));
			}
			if (isNull(returned)) {
				if (s.getBooleanNE("abort_flg")) {
					s.cmpl_flg(true);
				}
			}
		});
		return schdL;
	}
	
	/**
	 * 取消フラグを設定します。
	 */
	protected void setCanFlg(HdrL<HdrR> up0, DtlL<DtlR> up1, IoL<IoR> up2, MCOperation ope) {
		if (ope instanceof PurcRet_Del01 || ope instanceof PurcRet_Chk03 ) {
			up0.setValue(HdrR.$can_flg, true);
			up1.setValue(HdrR.$can_flg, true);
			up2.setValue(HdrR.$can_flg, true);
		}
		else {
			up0.setValue(HdrR.$can_flg, false);
			up1.forEach(r -> r.can_flg(MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())));
			up2.forEach(r -> r.can_flg(MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())));
		}
	}
	/**
	 * 改訂番号を更新します。
	 */
	protected void setPurcRetActRev(HdrL<HdrR> up0, DtlL<DtlR> up1, IoL<IoR> up2,
			MCJoinKey<HdrL<HdrR>> d2h, MCJoinKey<DtlL<DtlR>> i2d, MCJoinKey<MCList<HdrR>> _ah2bh,
			MCOperation ope) {
		if (ope instanceof PurcRet_Ins01) {
			up0.forEach(r -> r.purc_ret_act_rev(MCNumber.ONE));
			up1.forEach(r -> r.purc_ret_act_rev(MCNumber.ONE));
			up2.forEach(r -> r.purc_ret_act_rev(MCNumber.ONE));
		}
		else {
			up0.forEach(r -> {
				HdrR ah2bhr = r.getJoinedRow(_ah2bh);
				if (ah2bhr.purc_ret_print_flg() && !r.can_flg()) {
					r.purc_ret_act_rev(r.purc_ret_act_rev().add(MCNumber.ONE));
				}
				r.last_purc_ret_print_rev(ah2bhr.last_purc_ret_print_rev());
			});
			up1.forEach(r -> {
				HdrR hr = r.getJoinedRow(d2h);
				r.purc_ret_act_rev(hr.purc_ret_act_rev());
			});
			up2.forEach(r -> {
				HdrR hr = r.getJoinedRow(i2d).getJoinedRow(d2h);
				r.purc_ret_act_rev(hr.purc_ret_act_rev());
			});
		}
	}
	
	protected boolean isNonPurc(DtlR r) {
		return MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())
				|| MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())
				|| MSC_STK_ID_TYP.isACCPT_DFCT(r.stk_id_typ());
	}
	protected boolean isOutSrc(DtlR r) {
		return !MAC_PURC_TYP.isPURC_ITM(r.purc_typ());
	}
	protected void complProcUpriAmt(HdrL<HdrR> up0, DtlL<DtlR> up1) {
		MCIndexKey dk = up1.createIndex(DtlR.$hdr_peg_no);
		up0.forEach(r->{
			for (DtlR dr :up1.subList(dk, r.peg_no())) {
				if (!isNonPurc(dr) && isOutSrc(dr)) {
					if (isNull(dr.trd_cur_proc_upri())) {
						dr.trd_cur_proc_upri(MCNumber.ZERO);
						dr.trd_cur_proc_amt(MCNumber.ZERO);
						dr.base_cur_proc_upri(MCNumber.ZERO);
						dr.base_cur_proc_amt(MCNumber.ZERO);
						if (!isNull(r.ptax_xrate())) {
							dr.ptax_cur_proc_upri(MCNumber.ZERO);
							dr.ptax_cur_proc_amt(MCNumber.ZERO);
						}
					}
					if (isNull(dr.trd_cur_tax_amt())) {
						dr.trd_cur_tax_amt(MCNumber.ZERO);
						dr.base_cur_tax_amt(MCNumber.ZERO);
						if (!isNull(r.ptax_xrate())) {
							dr.ptax_cur_tax_amt(MCNumber.ZERO);
						}
					}
				}
			}
		});
	}
	
	public static void seletSchdIo(MCList<?> schdIo, Schd_HdrR schdH) {
		MCRow b = MCRow.create();
		b.addStringColumn("srch_tgt_no", schdH.purc_ret_schd_no());
		
		executeQuery(schdIo, MSBDL5170_MST_PURC_RET_SCHD_IO_S01(), b);
	}
	
	public static void selectSchdD(MCList<?> schdD, Schd_HdrR schdH) {

		MCRow b = MCRow.create();
		b.addStringColumn("srch_tgt_no", schdH.purc_ret_schd_no());
		
		executeQuery(schdD, MSBDL5170_MST_PURC_RET_SCHD_D_S01(), b);

	}
	
	/**
	 * 受払実績サービスを実行します。
	 * @param ioMakeFlg 受払作成フラグ
	 * @param up2 登録対象の上り電文受払
	 * @param d2h 明細からヘッダを取得するためのキー
	 * @param i2d 受払から明細を取得するためのキー
	 */
	protected void callIoActOpe(boolean ioMakeFlg, IoL<IoR> up2,
			MCJoinKey<HdrL<HdrR>> d2h, MCJoinKey<DtlL<DtlR>> i2d, MCOperation ope) {
		
		if (up2.size() != 0) {
			MSBEL_IoActService.IoAct_Ins01 iai = MSBEL_IoActService.crtIoAct_Ins01();
			Map_IoAct_Ins01_DtlR_IoR<IoAct_Ins01_DtlR, IoR> imap
				= createMap_IoAct_Ins01_DtlR_IoR();
			imap.setWith(i2d, d2h, ope);
			addAll(iai.up0(), up2, imap);
			iai.exec();
		}
		
		if (ioMakeFlg) {
			MSBEL_IoActService.IoAct_Upd01 iui = MSBEL_IoActService.crtIoAct_Upd01();
			iui.exec();
		}
	}
	
	/**
	 * 返品票発行サービスを実行します。
	 * @param up0 登録対象の上り電文ヘッダ
	 * @param up1 登録対象の上り電文明細
	 * @param up2 登録対象の上り電文受払
	 * @param d2h 明細からヘッダを取得するためのキー
	 * @param i2d 受払から明細を取得するためのキー
	 */
	protected void callPurcRet_PrntOpe(HdrL<HdrR> up0, DtlL<DtlR> up1, IoL<IoR> up2,
			MCJoinKey<HdrL<HdrR>> d2h, MCJoinKey<DtlL<DtlR>> i2d, MCOperation ope) {
		HdrL<HdrR> tgt = up0.subList(r -> r.prnt_flg());
		if (tgt.size() > 0) {
			MSBDL_PurcPrntService.PurcPrnt_Prnt02 prnt
				= MSBDL_PurcPrntService.crtPurcPrnt_Prnt02();
			Map_PurcPrnt_Prnt02_CndR_HdrR<PurcPrnt_Prnt02_CndR, HdrR> map
				= createMap_PurcPrnt_Prnt02_CndR_HdrR();
			map.setWith(ope);
			prnt.up1().indiv_prnt_flg(tgt.get(0).indiv_prnt_flg());
			addAll(prnt.up0(), tgt, map);
			prnt.exec();
		}
		
	}
	/**
	 * 仕入実績サービス更新前チェックを実行します。
	 * 
	 * @param c0 チェック対象の上り電文ヘッダ
	 * @param c1 チェック対象の上り電文明細
	 * @param c2 チェック対象の上り電文受払
	 * @param h2d ヘッダから明細を取得するためのキー
	 * @param d2i ヘッダから受払を取得するためのキー
	 * @param d2h 明細からヘッダを取得するためのキー
	 * @param i2d 受払から明細を取得するためのキー
	 * @param ai2bi 変更前の受払を取得するためのキー
	 */
	protected void callPurcAct_ChkOpe(HdrL<HdrR> c0, DtlL<DtlR> c1, IoL<IoR> c2,
			MCJoinKey<DtlL<DtlR>> h2d,  MCJoinKey<IoL<IoR>> d2i,
			MCJoinKey<HdrL<HdrR>> d2h, MCJoinKey<DtlL<DtlR>> i2d, 
			MCJoinKey<MCList<IoR>> ai2bi, MCOperation ope) {
		
		if (c0.size() == 0) {
			return;
		}
		
		DtlL<DtlR> c_dl = createDtlL();
		IoL<IoR> c_il = createIoL();

		c0.forEach(hr -> {
			hr.getJoined(h2d).forEach(dr -> {
				if (!isNull(dr.getStringNE($purc_act_data_crud_typ))) {
					c_dl.add(dr);
					dr.getJoined(d2i).forEach(ir -> {
						if (!isNull(ir.getStringNE($purc_act_data_crud_typ))) {
							c_il.add(ir);
						}
					});
				}
			});
		});

		//チェックオペレーション実行
		MSBDL_PurcActRegService.Purc_Chk03 sope = MSBDL_PurcActRegService
				.crtPurc_Chk03();
		addAll(sope.up0(), c0, createMap_Purc_Chk03_HdrR_HdrR());
		
		Map_Purc_Chk03_DtlR_DtlR<Purc_Chk03_DtlR, DtlR> dmap 
			= createMap_Purc_Chk03_DtlR_DtlR();
		dmap.setWith(d2h, ope);
		addAll(sope.up1(), c_dl, dmap);
		
		Map_Purc_Chk03_IoR_IoR<Purc_Chk03_IoR, IoR> imap 
			= createMap_Purc_Chk03_IoR_IoR();
		imap.setWith(i2d, d2h, ai2bi, ope);
		addAll(sope.up2(), c_il, imap);
		
		sope.exec();
		
		MCIndexKey cu2PegIk = null;
		for(Purc_Chk03_IoR r : sope.down2()) {
			if (r.err_flg()) {
				if (cu2PegIk == null) {
					cu2PegIk = c_il.createIndex(IoR.$peg_no);
				}
				IoR ior = c_il.getFirst(cu2PegIk, r.peg_no());
				setErrFlg(ior, i2d, d2h);	
			}
		}
		MCIndexKey cu1PegIk = null;
		for(Purc_Chk03_DtlR r : sope.down1()) {
			if (cu1PegIk == null) {
				cu1PegIk = c_dl.createIndex(DtlR.$peg_no);
			}			
			DtlR dr = c_dl.getFirst(cu1PegIk, r.peg_no());
			dr.purc_dtl_upd_flg(r.purc_dtl_upd_flg());
			if (r.err_flg()) {
				setErrFlg(dr, d2h);
			}
		}
		MCIndexKey cu0PegIk = null;
		for(Purc_Chk03_HdrR r : sope.down0()) {
			if (r.err_flg()) {
				if (cu0PegIk == null) {
					cu0PegIk = c0.createIndex(HdrR.$peg_no);
				}
				HdrR hr = c0.getFirst(cu0PegIk, r.peg_no());
				hr.err_flg(true);
			}
		}
	}
		
	protected void copyWtaxAmt(DtlL<DtlR> up1, MCList<Purc_Ins01_DtlR> d2){
		MCIndexKey k = d2.createIndex(Purc_Ins01_DtlR.$peg_no);
		up1.forEach(dr -> {
			Purc_Ins01_DtlR d2r = d2.getFirst(k, dr.peg_no());
			if (!isNull(d2r)) {
				dr.wtax_amt(d2r.wtax_amt());
			}
		});
	}
	
	/**
	 * 支給実績サービス更新前チェックを実行します。
	 * 
	 * @param c2 チェック対象の上り電文受払
	 * @param d2h 明細からヘッダを取得するためのキー
	 * @param i2d 受払から明細を取得するためのキー
	 * @param ope 実行元オペレーション
	 */
	protected void callProvAct_ChkOpe(IoL<IoR> c2,
			 MCJoinKey<HdrL<HdrR>> d2h, MCJoinKey<DtlL<DtlR>> i2d, MCOperation ope) {

		if (c2.size() == 0) {
			return;
		}
		
		MCList<MAM_PROV_UPRI_R> provUpriL = MCList.create(MAM_PROV_UPRI_R.class);
		initProvUpriCache(provUpriL, d2h, i2d, c2);
		MSBEL_ProvActService.ProvAct_Chk01 sope = MSBEL_ProvActService.crtProvAct_Chk01();
		Map_ProvActChk01_DtlR_IoR<ProvActChk01_DtlR,IoR> dmap = createMap_ProvActChk01_DtlR_IoR();
		dmap.setWith(i2d, d2h, ope);
		addAll(sope.up0(), c2, dmap);
		sope.exec();

		MCIndexKey cu2PegIk = null;
		for(ProvActChk01_DtlR r : sope.down0()) {
			if (cu2PegIk == null) {
				cu2PegIk = c2.createIndex(IoR.$peg_no);
			}
			IoR ior = c2.getFirst(cu2PegIk, r.peg_no());

			ior.after_prov_stk_id_typ(r.stk_id_typ());
			if (r.err_flg()) {
				setErrFlg(ior, i2d, d2h);
			}
		}
	}

	/**
	 * 支給実績サービス登録を実行します。
	 * 
	 * @param c_up2 登録対象の上り電文受払
	 * @param up2 上り電文受払
	 * @param d2h 明細からヘッダを取得するためのキー
	 * @param i2d 受払から明細を取得するためのキー
	 * @param ope 実行元オペレーション
	 */
	protected void callProvAct_UpdOpe(IoL<IoR> c_up2, IoL<IoR> up2,
			MCJoinKey<HdrL<HdrR>> d2h, MCJoinKey<DtlL<DtlR>> i2d, MCOperation ope) {

		if (up2.size() == 0) {
			return;
		}

		MSBEL_ProvActService.ProvAct_Upd01 sope = MSBEL_ProvActService.crtProvAct_Upd01();
		if (c_up2.size() > 0) {
			Map_ProvActUpd01_DtlR_IoR<ProvActUpd01_DtlR,IoR> dmap = createMap_ProvActUpd01_DtlR_IoR();
			dmap.setWith(i2d, d2h, c_up2, ope);
			addAll(sope.up0(), c_up2, dmap);
			sope.exec();
		}
		
		MCIndexKey ik = sope.down0().createIndex(ProvActUpd01_DtlR.$peg_no);
		up2.forEach(ur -> {
			ProvActUpd01_DtlR r = sope.down0().getFirst(ik, ur.peg_no());
			if (r != null) {
				ur.after_prov_stk_arrv_bp_cd(r.stk_arrv_bp_cd());
				ur.after_prov_stk_id_typ(r.stk_id_typ());
			}
			//支給対象外の場合はもとの値をコピー
			else {
				ur.after_prov_stk_arrv_bp_cd(ur.stk_arrv_bp_cd());
				ur.after_prov_stk_id_typ(ur.stk_id_typ());
			}
		});
	}
	
	/**
	 * 締処理提供サービス（締日チェック）を実行します。
	 * 
	 * @param c2 チェック対象の上り電文受払
	 * @param d2h 明細からヘッダを取得するためのキー
	 * @param i2d 受払から明細を取得するためのキー
	 */
	protected void callCl_ChkOpe(IoL<IoR> c2,
			MCJoinKey<HdrL<HdrR>> d2h, MCJoinKey<DtlL<DtlR>> i2d, 
			MCJoinKey<MCList<HdrR>> ah2bh, MCJoinKey<MCList<DtlR>> ad2bd, MCJoinKey<MCList<IoR>> ai2bi, 
			MCOperation ope) {
		
		if (c2.size() == 0) {
			return;
		}
		
		MSBIL_ClService.Cl_Chk03 sope = MSBIL_ClService
				.crtCl_Chk03();
		
		
		Map_Cl_Chk03_CndR_IoR<Cl_Chk03_CndR, IoR> dmap 
			= createMap_Cl_Chk03_CndR_IoR();
		dmap.setWith(i2d, d2h, ai2bi, ad2bd, ah2bh, ope);
		addAll(sope.up0(), c2, dmap);
		
		sope.exec();

		MCIndexKey cu2PegIk = null;
		for(Cl_Chk03_CndR r : sope.down0()) {
			if (r.err_flg()) {
				if (cu2PegIk == null) {
					cu2PegIk = c2.createIndex(IoR.$peg_no);
				}
				IoR ior = c2.getFirst(cu2PegIk, r.peg_no());
				setErrFlg(ior, i2d, d2h);
			}
		}
	}
	
	protected void chkSundry(DtlL<DtlR> dtlL) {
		for (DtlR r : dtlL)
			if (MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ()) && r.sundry_itm_flg()) {
				MAM_SUNDRY_ITM_R sundryItm = getSundryItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.sno1(), r.sno2(), r.sno3(),
						r.sno4());
				if (isNull(sundryItm) || sundryItm.isEmpty()) {
					MCMessagePool.add(new MCMessage(r, null, MSBDL0058, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
							toDispSno(r.sno1(), r.sno2(), r.sno3(), r.sno4()), toDispGUIIndex(r)));
				}
			}
	}
	/**
	 * 外注単価のチェックを行います
	 * @param up0 チェック対象の上り電文ヘッダ
	 * @param up1 チェック対象の上り電文明細
	 * @param dk ヘッダpeg_noに対応する明細のリストを取得するためのキー
	 * @return
	 */
	protected MCMessageList chkOutsrcUpri(HdrL<HdrR> up0, DtlL<DtlR> up1, MCIndexKey dk) {
		MCMessageList ml = new MCMessageList();
		up0.forEach(r->{
			for (DtlR dr :up1.subList(dk, r.peg_no())) {
				if(!isNull(dr.trd_cur_proc_upri()) || !isNull(dr.trd_cur_onr_prov_upri())) {
					MCNumber upri = nvl(dr.trd_cur_proc_upri(), MCNumber.ZERO).add(nvl(dr.trd_cur_onr_prov_upri(), MCNumber.ZERO));
					if(!isSame(dr.trd_cur_upri(), upri)) {
						ml.add(new MCMessage(dr, Schd_DtlR.$trd_cur_upri, MSBDL0501, upri, dr.trd_cur_upri(), toDispGUIIndex(dr)));
					}
				}
			}
		});
		return ml;
	}

	/**
	 * 在庫識別区分の状況に応じたチェックをします。
	 * @param up0 チェック対象の上り電文ヘッダ
	 * @param up1 チェック対象の上り電文明細
	 * @param up2 チェック対象の上り電文受払
	 * @param d2h 明細からヘッダを取得するためのキー
	 * @param i2d 受払から明細を取得するためのキー
	 * @param dk ヘッダpeg_noに対応する明細のリストを取得するためのキー
	 * @param ik　明細peg_noに対応する詳細のリストを取得するためのキー
	 */	
	protected void chkStkIdTyp(HdrL<HdrR> up0, DtlL<DtlR> up1, IoL<IoR> up2,
			MCJoinKey<HdrL<HdrR>> d2h, MCJoinKey<DtlL<DtlR>> i2d, MCIndexKey dk, MCIndexKey ik) {
		

		up0.forEach(r->{
			for (DtlR dr :up1.subList(dk, r.peg_no())) {
				for (IoR ir : up2.subList(ik, dr.peg_no())) {
					//明細行に自社資産のものが含まれるが、ヘッダの取引通貨が設定されていない場合
					if (MSC_STK_ID_TYP.isCOSTK(ir.stk_id_typ()) && isNull(r.trd_cur_cd())) {
						r.err_flg(true);
						MCMessagePool.add(new MCMessage(r, 
								HdrR.$trd_cur_cd, MSBDL0007));
						break;
					}
				}
				if (r.err_flg()) {
					break;
				}
			}
		});
		
		DtlL<DtlR> onrPrvs = up1.createInstance();
		up1.forEach(dr -> {
			
			if (MSC_STK_ID_TYP.isRTN_PRE_ACCPT(dr.stk_id_typ())
					|| MSC_STK_ID_TYP.isPURC_PRE_ACCPT(dr.stk_id_typ())
					|| MSC_STK_ID_TYP.isCSTSTK(dr.stk_id_typ())
					|| MSC_STK_ID_TYP.isSLF_SUPPRT(dr.stk_id_typ())) {
				setErrFlg(dr, d2h);
				MCMessagePool.add(new MCMessage(dr, DtlR.$stk_id_typ, MSBDL0005, dr.stk_id_typ(), toDispGUIIndex(dr)));
			}
			
			//在庫識別区分に「有償支給」画設定されている行のリストを作成
			if (MSC_STK_ID_TYP.isONR_PROV(dr.stk_id_typ())) {
				onrPrvs.add(dr);
			}
		});
		
		//在庫識別区分に「有償支給」が指定されているが、返品元場所が外注場所でない場合
		if (onrPrvs.size() == 0) {
			return;
		}
		onrPrvs.forEach(dr -> {
			if (isNull(dr.purc_ret_sppl_cd())) {
				setErrFlg(dr, d2h);
				MCMessagePool.add(new MCMessage(
					dr, DtlR.$purc_ret_loc_cd, 
					MSBDL0006, dr.purc_ret_loc_cd(), toDispGUIIndex(dr)));
			}
		});
		
	}
	

	/**
	 * 締処理提供サービス（締日チェック）用のRowMapperを作成します。
	 */
	protected Map_Cl_Chk03_CndR_IoR<Cl_Chk03_CndR, IoR> createMap_Cl_Chk03_CndR_IoR() {
		return new Map_Cl_Chk03_CndR_IoR<Cl_Chk03_CndR, IoR>();
	}

	/**
	 * 締処理提供サービス（締日チェック）用のRowMapperです。
	 */
	public class Map_Cl_Chk03_CndR_IoR<D extends Cl_Chk03_CndR, S extends IoR>  extends MCRowMapper<D,S>{
		protected MCJoinKey<DtlL<DtlR>> _i2d;
		protected MCJoinKey<HdrL<HdrR>> _d2h;
		MCJoinKey<MCList<IoR>> _ai2bi;
		MCJoinKey<MCList<DtlR>> _ad2bd;
		MCJoinKey<MCList<HdrR>> _ah2bh;
		protected MCOperation _ope;
		/**
		 * データ連携時に必要なデータを設定します。
		 * @param _i2d 受払いからから明細を取得するためのキー
		 * @param _d2h 明細からヘッダを取得するためのキー
		 * @param _ad2bd 変更前明細を取得するためのキー
		 * @param _clr 実行元オペレーション
		 */
		public void setWith(MCJoinKey<DtlL<DtlR>> _i2d, MCJoinKey<HdrL<HdrR>> _d2h, 
				MCJoinKey<MCList<IoR>> _ai2bi, MCJoinKey<MCList<DtlR>> _ad2bd, MCJoinKey<MCList<HdrR>> _ah2bh, 
				MCOperation _ope){
			this._i2d = _i2d;
			this._d2h = _d2h;
			this._ah2bh = _ah2bh;
			this._ad2bd = _ad2bd;
			this._ai2bi = _ai2bi;
			this._ope = _ope;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Cl_Chk03_CndR.$peg_no, IoR.$peg_no);
			addColumnPathMap(Cl_Chk03_CndR.$loc_cd, IoR.$purc_ret_loc_cd);
	
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.stk_cls_chk_flg(true);
			DtlR dr = src.getJoinedRow(_i2d);
			if (dr != null) {
				HdrR hr = dr.getJoinedRow(_d2h);
				if (hr != null) {
					
					if (MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())) {
						dest.ac_dt(hr.ac_dt());
						dest.bp_cd(hr.asppl_cd());
						dest.itm_cd(dr.itm_cd());
						dest.itm_sub1(dr.itm_sub1());
						dest.itm_sub2(dr.itm_sub2());
						dest.itm_sub3(dr.itm_sub3());
					}
					if (MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())) {
						dest.can_ac_dt(hr.can_ac_dt());
						HdrR befH = hr.getJoinedRow(_ah2bh);
						dest.old_bp_cd(befH.asppl_cd());
						DtlR befD = dr.getJoinedRow(_ad2bd);
						dest.old_itm_cd(befD.itm_cd());
						dest.old_itm_sub1(befD.itm_sub1());
						dest.old_itm_sub2(befD.itm_sub2());
						dest.old_itm_sub3(befD.itm_sub3());

						IoR befI = src.getJoinedRow(_ai2bi);
						dest.old_loc_cd(befI.purc_ret_loc_cd());
					}
				}
			}
		}
	}


	/**
	 * 仕入実績サービス更新前チェックのヘッダ用RowMapperを作成します。
	 */
	protected Map_Purc_Chk03_HdrR_HdrR<Purc_Chk03_HdrR,HdrR> createMap_Purc_Chk03_HdrR_HdrR() {
		return new Map_Purc_Chk03_HdrR_HdrR<Purc_Chk03_HdrR, HdrR>();
	}

	/**
	 * 仕入実績サービス更新前チェックのヘッダ用RowMapperです。
	 */
	public class Map_Purc_Chk03_HdrR_HdrR<D extends Purc_Chk03_HdrR, S extends HdrR> extends MCRowMapper<D,S>{
		protected MCOperation _ope;
		/**
		 * データ連携時に必要なデータを設定します。
		 * @param _clr 実行元オペレーション
		 */
		public void setWith(MCOperation _ope){
			this._ope = _ope;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Purc_Chk03_HdrR.$peg_no, HdrR.$peg_no);
			
			addColumnPathMap(Purc_Chk03_HdrR.$purc_act_no, HdrR.$purc_act_no);
			addColumnPathMap(Purc_Chk03_HdrR.$purc_act_seq, HdrR.$purc_act_seq);
			
			addColumnPathMap(Purc_Chk03_HdrR.$trd_ptn_typ, HdrR.$trd_ptn_typ);
			addColumnPathMap(Purc_Chk03_HdrR.$purc_dpt_cd, HdrR.$purc_dpt_cd);
			addColumnPathMap(Purc_Chk03_HdrR.$purc_usr_cd, HdrR.$purc_usr_cd);
			addColumnPathMap(Purc_Chk03_HdrR.$sppl_cd, HdrR.$sppl_cd);
			addColumnPathMap(Purc_Chk03_HdrR.$asppl_cd, HdrR.$asppl_cd);
			addColumnPathMap(Purc_Chk03_HdrR.$trd_cur_cd, HdrR.$trd_cur_cd);
			addColumnPathMap(Purc_Chk03_HdrR.$tterm_cd1, HdrR.$tterm_cd1);
			addColumnPathMap(Purc_Chk03_HdrR.$tterm_cd2, HdrR.$tterm_cd2);
			addColumnPathMap(Purc_Chk03_HdrR.$tterm_cd3, HdrR.$tterm_cd3);
			addColumnPathMap(Purc_Chk03_HdrR.$purc_dt, HdrR.$purc_ret_dt);
			addColumnPathMap(Purc_Chk03_HdrR.$ac_dt, HdrR.$ac_dt);
			addColumnPathMap(Purc_Chk03_HdrR.$can_ac_dt, HdrR.$can_ac_dt);
			addColumnPathMap(Purc_Chk03_HdrR.$pay_basis_dt, HdrR.$pay_basis_dt);
			addColumnPathMap(Purc_Chk03_HdrR.$rcpt_iv_no, HdrR.$rcpt_iv_no);
			addColumnPathMap(Purc_Chk03_HdrR.$ref_rcpt_iv_no, HdrR.$ref_rcpt_iv_no);
			addColumnPathMap(Purc_Chk03_HdrR.$xrate, HdrR.$xrate);
			addColumnPathMap(Purc_Chk03_HdrR.$ptax_dt, HdrR.$ptax_dt);
			addColumnPathMap(Purc_Chk03_HdrR.$ptax_xrate, HdrR.$ptax_xrate);

		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(src.getStringNE($purc_act_data_crud_typ));
			dest.io_make_flg(true);
		}
	}
	/**
	 * 仕入実績サービス登録のヘッダ用RowMapperを作成します。
	 */
	protected Map_Purc_Ins01_HdrR_HdrR<Purc_Ins01_HdrR,HdrR> createMap_Purc_Ins01_HdrR_HdrR() {
		return new Map_Purc_Ins01_HdrR_HdrR<Purc_Ins01_HdrR, HdrR>();
	}

	/**
	 * 仕入実績サービス登録のヘッダ用RowMapperです。
	 */
	public class Map_Purc_Ins01_HdrR_HdrR<D extends Purc_Ins01_HdrR, S extends HdrR> extends MCRowMapper<D,S>{
		
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Purc_Ins01_HdrR.$trd_cd, HdrR.$trd_cd);
			addColumnPathMap(Purc_Ins01_HdrR.$trd_ptn_typ, HdrR.$trd_ptn_typ);

			addColumnPathMap(Purc_Ins01_HdrR.$peg_no, HdrR.$peg_no);
			addColumnPathMap(Purc_Ins01_HdrR.$purc_ret_act_no, HdrR.$purc_ret_act_no);
			addColumnPathMap(Purc_Ins01_HdrR.$purc_ret_act_rev, HdrR.$purc_ret_act_rev);
			addColumnPathMap(Purc_Ins01_HdrR.$purc_act_no, HdrR.$purc_act_no);
			addColumnPathMap(Purc_Ins01_HdrR.$purc_act_seq, HdrR.$purc_act_seq);
			
			addColumnPathMap(Purc_Ins01_HdrR.$purc_dpt_cd, HdrR.$purc_dpt_cd);
			addColumnPathMap(Purc_Ins01_HdrR.$purc_usr_cd, HdrR.$purc_usr_cd);
			addColumnPathMap(Purc_Ins01_HdrR.$wg_cd, HdrR.$wg_cd);
			addColumnPathMap(Purc_Ins01_HdrR.$sppl_cd, HdrR.$sppl_cd);
			
			addColumnPathMap(Purc_Ins01_HdrR.$trd_cur_cd, HdrR.$trd_cur_cd);
			addColumnPathMap(Purc_Ins01_HdrR.$trd_rmrks, HdrR.$trd_rmrks);
			addColumnPathMap(Purc_Ins01_HdrR.$intr_rmrks, HdrR.$intr_rmrks);
			addColumnPathMap(Purc_Ins01_HdrR.$tterm_cd1, HdrR.$tterm_cd1);
			addColumnPathMap(Purc_Ins01_HdrR.$tterm_rmrks1, HdrR.$tterm_rmrks1);
			addColumnPathMap(Purc_Ins01_HdrR.$tterm_cd2, HdrR.$tterm_cd2);
			addColumnPathMap(Purc_Ins01_HdrR.$tterm_rmrks2, HdrR.$tterm_rmrks2);
			addColumnPathMap(Purc_Ins01_HdrR.$tterm_cd3, HdrR.$tterm_cd3);
			addColumnPathMap(Purc_Ins01_HdrR.$tterm_rmrks3, HdrR.$tterm_rmrks3);
			addColumnPathMap(Purc_Ins01_HdrR.$sub_char1, HdrR.$sub_char1);
			addColumnPathMap(Purc_Ins01_HdrR.$sub_char2, HdrR.$sub_char2);
			addColumnPathMap(Purc_Ins01_HdrR.$sub_char3, HdrR.$sub_char3);
			addColumnPathMap(Purc_Ins01_HdrR.$purc_dt, HdrR.$purc_ret_dt);
			addColumnPathMap(Purc_Ins01_HdrR.$ac_dt, HdrR.$ac_dt);
			addColumnPathMap(Purc_Ins01_HdrR.$can_ac_dt, HdrR.$can_ac_dt);
			
			addColumnPathMap(Purc_Ins01_HdrR.$pay_basis_dt, HdrR.$pay_basis_dt);
			addColumnPathMap(Purc_Ins01_HdrR.$pay_schd_dt, HdrR.$pay_schd_dt);
			addColumnPathMap(Purc_Ins01_HdrR.$rcpt_iv_no, HdrR.$rcpt_iv_no);

			addColumnPathMap(Purc_Ins01_HdrR.$xrate, HdrR.$xrate);
			addColumnPathMap(Purc_Ins01_HdrR.$ptax_dt, HdrR.$ptax_dt);
			addColumnPathMap(Purc_Ins01_HdrR.$ptax_xrate, HdrR.$ptax_xrate);
			addColumnPathMap(Purc_Ins01_HdrR.$purc_tax_calc_typ, HdrR.$purc_tax_calc_typ);

		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(src.getStringNE($purc_act_data_crud_typ));
		}
	}
	/**
	 * 仕入実績サービス更新前チェックの明細用RowMapperを作成します。
	 */
	protected Map_Purc_Chk03_DtlR_DtlR<Purc_Chk03_DtlR,DtlR> createMap_Purc_Chk03_DtlR_DtlR() {
		return new Map_Purc_Chk03_DtlR_DtlR<Purc_Chk03_DtlR,DtlR>();
	}

	/**
	 * 仕入実績サービス更新前チェックの明細用RowMapperです。
	 */
	public class Map_Purc_Chk03_DtlR_DtlR<D extends Purc_Chk03_DtlR, S extends DtlR>  extends MCRowMapper<D,S>{
		protected MCJoinKey<HdrL<HdrR>> _d2h;
		protected MCOperation _ope;  
		/**
		 * データ連携時に必要なデータを設定します。
		 * @param _d2h 明細からヘッダを取得するためのキー
		 * @param _clr 実行元オペレーション
		 */
		public void setWith(MCJoinKey<HdrL<HdrR>> _d2h, MCOperation _ope){
			this._d2h = _d2h;
			this._ope = _ope;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Purc_Chk03_DtlR.$hdr_peg_no, DtlR.$hdr_peg_no);
			addColumnPathMap(Purc_Chk03_DtlR.$peg_no, DtlR.$peg_no);
			addColumnPathMap(Purc_Chk03_DtlR.$purc_act_d_no, DtlR.$purc_act_d_no);
			addColumnPathMap(Purc_Chk03_DtlR.$purc_act_d_seq, DtlR.$purc_act_d_seq);

			addColumnPathMap(Purc_Chk03_DtlR.$purc_act_no, DtlR.$purc_act_no);
			addColumnPathMap(Purc_Chk03_DtlR.$purc_act_seq, DtlR.$purc_act_seq);
			addColumnPathMap(Purc_Chk03_DtlR.$mfg_inst_no, DtlR.$mfg_inst_no);
			addColumnPathMap(Purc_Chk03_DtlR.$itm_cd, DtlR.$itm_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$itm_sub1, DtlR.$itm_sub1);
			addColumnPathMap(Purc_Chk03_DtlR.$itm_sub2, DtlR.$itm_sub2);
			addColumnPathMap(Purc_Chk03_DtlR.$itm_sub3, DtlR.$itm_sub3);
			addColumnPathMap(Purc_Chk03_DtlR.$ver_no, DtlR.$ver_no);
			addColumnPathMap(Purc_Chk03_DtlR.$itm_nm, DtlR.$itm_nm);
			addColumnPathMap(Purc_Chk03_DtlR.$iv_itm_nm, DtlR.$iv_itm_nm);
			addColumnPathMap(Purc_Chk03_DtlR.$sppl_itm_cd, DtlR.$sppl_itm_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$sppl_itm_nm, DtlR.$sppl_itm_nm);
			addColumnPathMap(Purc_Chk03_DtlR.$sundry_itm_flg, DtlR.$sundry_itm_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_unit_cd, DtlR.$trd_unit_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_unit_qty, DtlR.$trd_unit_qty);
			addColumnPathMap(Purc_Chk03_DtlR.$base_unit_cd, DtlR.$base_unit_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$base_unit_qty, DtlR.$base_unit_qty);
			addColumnPathMap(Purc_Chk03_DtlR.$interim_flg, DtlR.$interim_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_upri, DtlR.$trd_cur_upri);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_tax_amt, DtlR.$trd_cur_tax_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_proc_upri, DtlR.$trd_cur_proc_upri);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_onr_prov_upri, DtlR.$trd_cur_onr_prov_upri);
			addColumnPathMap(Purc_Chk03_DtlR.$dscnt_rsn_cd, DtlR.$ret_rsn_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_dscnt_amt, DtlR.$trd_cur_dscnt_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$tax_cd, DtlR.$tax_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$ptax_cur_tax_amt, DtlR.$ptax_cur_tax_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$wtax_rate, DtlR.$wtax_rate);
			addColumnPathMap(Purc_Chk03_DtlR.$wtax_amt, DtlR.$wtax_amt);
			addColumnPathMap(Purc_Chk03_DtlR.$maker_cd, DtlR.$maker_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$ap_dpt_cd, DtlR.$ap_dpt_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$pay_crryovr_times, DtlR.$pay_crryovr_times);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_itm_cd, DtlR.$bd_itm_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_itm_sub1, DtlR.$bd_itm_sub1);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_itm_sub2, DtlR.$bd_itm_sub2);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_itm_sub3, DtlR.$bd_itm_sub3);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_sno1, DtlR.$bd_sno1);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_sno2, DtlR.$bd_sno2);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_sno3, DtlR.$bd_sno3);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_sno4, DtlR.$bd_sno4);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_lot_no, DtlR.$bd_lot_no);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_sublot_no, DtlR.$bd_sublot_no);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_ctg_cd, DtlR.$bd_ctg_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_oper_cd, DtlR.$bd_oper_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_iv_no, DtlR.$bd_iv_no);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_loc_cd, DtlR.$bd_loc_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_po_no, DtlR.$bd_po_no);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_slo_no, DtlR.$bd_slo_no);
			addColumnPathMap(Purc_Chk03_DtlR.$stk_mng_typ, DtlR.$stk_mng_typ);
			addColumnPathMap(Purc_Chk03_DtlR.$asset_mng_typ, DtlR.$asset_mng_typ);
			addColumnPathMap(Purc_Chk03_DtlR.$rsn_cd, DtlR.$ret_rsn_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$xpns_po_flg, DtlR.$xpns_purc_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$bd_dpt_cd, DtlR.$bd_dpt_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$purc_cont_qty, DtlR.$purc_cont_qty);
			addColumnPathMap(Purc_Chk03_DtlR.$gd_cd, DtlR.$gd_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$sno1, DtlR.$sno1);
			addColumnPathMap(Purc_Chk03_DtlR.$sno2, DtlR.$sno2);
			addColumnPathMap(Purc_Chk03_DtlR.$sno3, DtlR.$sno3);
			addColumnPathMap(Purc_Chk03_DtlR.$sno4, DtlR.$sno4);
			addColumnPathMap(Purc_Chk03_DtlR.$dlv_loc_cd, DtlR.$purc_ret_loc_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$str_ln_cd, DtlR.$str_ln_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$lot_no, DtlR.$lot_no);
			addColumnPathMap(Purc_Chk03_DtlR.$sublot_no, DtlR.$sublot_no);
			addColumnPathMap(Purc_Chk03_DtlR.$quality_typ, DtlR.$quality_typ);
			addColumnPathMap(Purc_Chk03_DtlR.$stk_insp_typ, DtlR.$stk_insp_typ);
			addColumnPathMap(Purc_Chk03_DtlR.$stk_id_typ, DtlR.$stk_id_typ);
			addColumnPathMap(Purc_Chk03_DtlR.$bp_lot_no, DtlR.$bp_lot_no);
			addColumnPathMap(Purc_Chk03_DtlR.$bp_dlv_slip_no, DtlR.$bp_dlv_slip_no);
			addColumnPathMap(Purc_Chk03_DtlR.$bp_dlv_slip_d_no, DtlR.$bp_dlv_slip_d_no);
			addColumnPathMap(Purc_Chk03_DtlR.$rsn_cd, DtlR.$ret_rsn_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$base_purc_ac_dt, DtlR.$base_purc_ac_dt);
			addColumnPathMap(Purc_Chk03_DtlR.$disp_seq, DtlR.$disp_seq);
			
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(src.getStringNE($purc_act_data_crud_typ));
		}
	}
	/**
	 * 仕入実績サービス更新前チェックの明細用RowMapperを作成します。
	 */
	protected Map_Purc_Ins01_DtlR_DtlR<Purc_Ins01_DtlR,DtlR> createMap_Purc_Ins01_DtlR_DtlR() {
		return new Map_Purc_Ins01_DtlR_DtlR<Purc_Ins01_DtlR,DtlR>();
	}

	/**
	 * 仕入実績サービス登録の明細用RowMapperです。
	 */
	public class Map_Purc_Ins01_DtlR_DtlR<D extends Purc_Ins01_DtlR, S extends DtlR>  extends MCRowMapper<D,S>{
		protected MCJoinKey<HdrL<HdrR>> _d2h;
		/**
		 * データ連携時に必要なデータを設定します。
		 * @param _d2h 明細からヘッダを取得するためのキー
		 */
		public void setWith(MCJoinKey<HdrL<HdrR>> _d2h){
			this._d2h = _d2h;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Purc_Ins01_DtlR.$hdr_peg_no, DtlR.$hdr_peg_no);
			addColumnPathMap(Purc_Ins01_DtlR.$peg_no, DtlR.$peg_no);
			addColumnPathMap(Purc_Ins01_DtlR.$purc_act_d_no, DtlR.$purc_act_d_no);
			addColumnPathMap(Purc_Ins01_DtlR.$purc_act_d_seq, DtlR.$purc_act_d_seq);
			addColumnPathMap(Purc_Ins01_DtlR.$purc_act_no, DtlR.$purc_act_no);
			addColumnPathMap(Purc_Ins01_DtlR.$purc_act_seq, DtlR.$purc_act_seq);
			addColumnPathMap(Purc_Ins01_DtlR.$purc_ret_act_d_no, DtlR.$purc_ret_act_d_no);
			addColumnPathMap(Purc_Ins01_DtlR.$purc_typ, DtlR.$purc_typ);
			addColumnPathMap(Purc_Ins01_DtlR.$purc_id_typ, DtlR.$purc_id_typ);
			addColumnPathMap(Purc_Ins01_DtlR.$mfg_inst_no, DtlR.$mfg_inst_no);
			addColumnPathMap(Purc_Ins01_DtlR.$itm_cd, DtlR.$itm_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$itm_sub1, DtlR.$itm_sub1);
			addColumnPathMap(Purc_Ins01_DtlR.$itm_sub2, DtlR.$itm_sub2);
			addColumnPathMap(Purc_Ins01_DtlR.$itm_sub3, DtlR.$itm_sub3);
			addColumnPathMap(Purc_Ins01_DtlR.$ver_no, DtlR.$ver_no);
			addColumnPathMap(Purc_Ins01_DtlR.$itm_nm, DtlR.$itm_nm);
			addColumnPathMap(Purc_Ins01_DtlR.$iv_itm_nm, DtlR.$iv_itm_nm);
			addColumnPathMap(Purc_Ins01_DtlR.$sppl_itm_cd, DtlR.$sppl_itm_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$sppl_itm_nm, DtlR.$sppl_itm_nm);
			addColumnPathMap(Purc_Ins01_DtlR.$sundry_itm_flg, DtlR.$sundry_itm_flg);
			
			addColumnPathMap(Purc_Ins01_DtlR.$trd_unit_cd, DtlR.$trd_unit_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$trd_unit_qty, DtlR.$trd_unit_qty);
			addColumnPathMap(Purc_Ins01_DtlR.$base_unit_cd, DtlR.$base_unit_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$base_unit_qty, DtlR.$base_unit_qty);
			addColumnPathMap(Purc_Ins01_DtlR.$interim_flg, DtlR.$interim_flg);
			
			addColumnPathMap(Purc_Ins01_DtlR.$upri_not_tgt_flg, DtlR.$upri_not_tgt_flg);
			addColumnPathMap(Purc_Ins01_DtlR.$purc_dtl_upd_flg, DtlR.$purc_dtl_upd_flg);
			addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_upri, DtlR.$trd_cur_upri);
			addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_proc_upri, DtlR.$trd_cur_proc_upri);
			addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_onr_prov_upri, DtlR.$trd_cur_onr_prov_upri);
			addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_dscnt_amt, DtlR.$trd_cur_dscnt_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_amt, DtlR.$trd_cur_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_proc_amt, DtlR.$trd_cur_proc_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_onr_prov_amt, DtlR.$trd_cur_onr_prov_amt);

			addColumnPathMap(Purc_Ins01_DtlR.$base_cur_upri, DtlR.$base_cur_upri);
			addColumnPathMap(Purc_Ins01_DtlR.$base_cur_proc_upri, DtlR.$base_cur_proc_upri);
			addColumnPathMap(Purc_Ins01_DtlR.$base_cur_onr_prov_upri, DtlR.$base_cur_onr_prov_upri);
			addColumnPathMap(Purc_Ins01_DtlR.$base_cur_dscnt_amt, DtlR.$base_cur_dscnt_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$base_cur_amt, DtlR.$base_cur_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$base_cur_proc_amt, DtlR.$base_cur_proc_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$base_cur_onr_prov_amt, DtlR.$base_cur_onr_prov_amt);

			addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_upri, DtlR.$ptax_cur_upri);
			addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_proc_upri, DtlR.$ptax_cur_proc_upri);
			addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_onr_prov_upri, DtlR.$ptax_cur_onr_prov_upri);
			addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_dscnt_amt, DtlR.$ptax_cur_dscnt_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_amt, DtlR.$ptax_cur_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_proc_amt, DtlR.$ptax_cur_proc_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_onr_prov_amt, DtlR.$ptax_cur_onr_prov_amt);
			
			addColumnPathMap(Purc_Ins01_DtlR.$tax_cd, DtlR.$tax_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_tax_amt, DtlR.$trd_cur_tax_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$base_cur_tax_amt, DtlR.$base_cur_tax_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_tax_amt, DtlR.$ptax_cur_tax_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$dscnt_rsn_cd, DtlR.$dscnt_rsn_cd);
			
			addColumnPathMap(Purc_Ins01_DtlR.$wtax_rate, DtlR.$wtax_rate);
			addColumnPathMap(Purc_Ins01_DtlR.$wtax_amt, DtlR.$wtax_amt);
			
			addColumnPathMap(Purc_Ins01_DtlR.$abort_flg, DtlR.$abort_flg);
			
			addColumnPathMap(Purc_Ins01_DtlR.$maker_cd, DtlR.$maker_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$ap_dpt_cd, DtlR.$ap_dpt_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$pay_crryovr_times, DtlR.$pay_crryovr_times);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_itm_cd, DtlR.$bd_itm_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_itm_sub1, DtlR.$bd_itm_sub1);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_itm_sub2, DtlR.$bd_itm_sub2);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_itm_sub3, DtlR.$bd_itm_sub3);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_sno1, DtlR.$bd_sno1);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_sno2, DtlR.$bd_sno2);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_sno3, DtlR.$bd_sno3);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_sno4, DtlR.$bd_sno4);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_lot_no, DtlR.$bd_lot_no);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_sublot_no, DtlR.$bd_sublot_no);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_ctg_cd, DtlR.$bd_ctg_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_oper_cd, DtlR.$bd_oper_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_iv_no, DtlR.$bd_iv_no);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_loc_cd, DtlR.$bd_loc_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_po_no, DtlR.$bd_po_no);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_slo_no, DtlR.$bd_slo_no);
			
			addColumnPathMap(Purc_Ins01_DtlR.$xpns_po_flg, DtlR.$xpns_purc_flg);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_dpt_cd, DtlR.$bd_dpt_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$purc_cont_qty, DtlR.$purc_cont_qty);
			addColumnPathMap(Purc_Ins01_DtlR.$intr_rmrks, DtlR.$intr_rmrks);
			addColumnPathMap(Purc_Ins01_DtlR.$sub_char1, DtlR.$sub_char1);
			addColumnPathMap(Purc_Ins01_DtlR.$sub_char2, DtlR.$sub_char2);
			addColumnPathMap(Purc_Ins01_DtlR.$sub_char3, DtlR.$sub_char3);
			addColumnPathMap(Purc_Ins01_DtlR.$base_purc_ac_dt, DtlR.$base_purc_ac_dt);
			addColumnPathMap(Purc_Ins01_DtlR.$gd_cd, DtlR.$gd_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$sno1, DtlR.$sno1);
			addColumnPathMap(Purc_Ins01_DtlR.$sno2, DtlR.$sno2);
			addColumnPathMap(Purc_Ins01_DtlR.$sno3, DtlR.$sno3);
			addColumnPathMap(Purc_Ins01_DtlR.$sno4, DtlR.$sno4);
			addColumnPathMap(Purc_Ins01_DtlR.$str_ln_cd, DtlR.$str_ln_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$lot_no, DtlR.$lot_no);
			addColumnPathMap(Purc_Ins01_DtlR.$sublot_no, DtlR.$sublot_no);
			addColumnPathMap(Purc_Ins01_DtlR.$po_no, DtlR.$po_no);
			addColumnPathMap(Purc_Ins01_DtlR.$rsn_cd, DtlR.$ret_rsn_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$quality_typ, DtlR.$quality_typ);
			addColumnPathMap(Purc_Ins01_DtlR.$stk_insp_typ, DtlR.$stk_insp_typ);
			addColumnPathMap(Purc_Ins01_DtlR.$stk_mng_typ, DtlR.$stk_mng_typ);

			addColumnPathMap(Purc_Ins01_DtlR.$trd_d_rmrks, DtlR.$trd_d_rmrks);
			
			addColumnPathMap(Purc_Ins01_DtlR.$disp_seq, DtlR.$disp_seq);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(src.getStringNE($purc_act_data_crud_typ));
			
			dest.stk_id_typ(src.after_prov_stk_id_typ());
		}
	}
	/**
	 * 仕入実績サービス更新前チェックの受払用RowMapperを作成します。
	 */
	protected Map_Purc_Chk03_IoR_IoR<Purc_Chk03_IoR,IoR> createMap_Purc_Chk03_IoR_IoR() {
		return new Map_Purc_Chk03_IoR_IoR<Purc_Chk03_IoR, IoR>();
	}

	/**
	 * 仕入実績サービス更新前チェックの受払用RowMapperです。
	 */
	public class Map_Purc_Chk03_IoR_IoR<D extends Purc_Chk03_IoR, S extends IoR>  extends MCRowMapper<D,S>{
		protected MCJoinKey<DtlL<DtlR>> _i2d;
		protected MCJoinKey<HdrL<HdrR>> _d2h;
		MCJoinKey<MCList<IoR>> _ai2bi;
		protected MCOperation _ope;
		
		/**
		 * データ連携時に必要なデータを設定します。
		 * @param _i2d 受払いからから明細を取得するためのキー
		 * @param _d2h 明細からヘッダを取得するためのキー
		 * @param _clr 実行元オペレーション
		 */
		public void setWith(MCJoinKey<DtlL<DtlR>> _i2d, MCJoinKey<HdrL<HdrR>> _d2h,
				MCJoinKey<MCList<IoR>> _ai2bi, MCOperation _ope){
			this._i2d = _i2d;
			this._d2h = _d2h;
			this._ai2bi = _ai2bi;
			this._ope = _ope;
		}
		
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Purc_Chk03_IoR.$dtl_peg_no, IoR.$dtl_peg_no);
			addColumnPathMap(Purc_Chk03_IoR.$peg_no, IoR.$peg_no);

			addColumnPathMap(Purc_Chk03_IoR.$purc_act_io_no, IoR.$purc_act_io_no);
			addColumnPathMap(Purc_Chk03_IoR.$purc_act_io_seq, IoR.$purc_act_io_seq);
			
			addColumnPathMap(Purc_Chk03_IoR.$trd_unit_cd, IoR.$trd_unit_cd);
			addColumnPathMap(Purc_Chk03_IoR.$trd_unit_qty, IoR.$trd_unit_qty);
			addColumnPathMap(Purc_Chk03_IoR.$base_unit_cd, IoR.$base_unit_cd);
			addColumnPathMap(Purc_Chk03_IoR.$base_unit_qty, IoR.$base_unit_qty);
			addColumnPathMap(Purc_Chk03_IoR.$pack_unit_cd, IoR.$pack_unit_cd);
			addColumnPathMap(Purc_Chk03_IoR.$pack_unit_qty, IoR.$pack_unit_qty);
			addColumnPathMap(Purc_Chk03_IoR.$purc_cont_qty, IoR.$purc_cont_qty);
			addColumnPathMap(Purc_Chk03_IoR.$ver_no, IoR.$ver_no);
			addColumnPathMap(Purc_Chk03_IoR.$gd_cd, IoR.$gd_cd);
			addColumnPathMap(Purc_Chk03_IoR.$dlv_loc_wg_cd, IoR.$purc_ret_loc_wg_cd);
			addColumnPathMap(Purc_Chk03_IoR.$dlv_loc_cd, DtlR.$purc_ret_loc_cd);
			addColumnPathMap(Purc_Ins01_IoR.$gi_wg_cd, IoR.$purc_ret_loc_wg_cd);
			addColumnPathMap(Purc_Ins01_IoR.$gi_loc_cd, IoR.$purc_ret_loc_cd);
			addColumnPathMap(Purc_Ins01_IoR.$gi_str_ln_cd, IoR.$str_ln_cd);
			addColumnPathMap(Purc_Ins01_IoR.$gi_unit_cd, IoR.$pack_unit_cd);
			addColumnPathMap(Purc_Ins01_IoR.$from_gd_cd, IoR.$gd_cd);
			addColumnPathMap(Purc_Chk03_IoR.$str_ln_cd, IoR.$str_ln_cd);
			addColumnPathMap(Purc_Chk03_IoR.$lot_no, IoR.$lot_no);
			addColumnPathMap(Purc_Chk03_IoR.$sublot_no, IoR.$sublot_no);
			addColumnPathMap(Purc_Chk03_IoR.$quality_typ, IoR.$quality_typ);
			addColumnPathMap(Purc_Chk03_IoR.$stk_insp_typ, IoR.$stk_insp_typ);
			addColumnPathMap(Purc_Chk03_IoR.$bp_lot_no, IoR.$bp_lot_no);

		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(src.getStringNE($purc_act_data_crud_typ));
			
			DtlR dr = src.getJoinedRow(_i2d);
			HdrR hr = dr.getJoinedRow(_d2h);
			dest.stk_bp_cd(getStkBpCd(
					src.after_prov_stk_id_typ(),
					hr.sppl_cd(), src.purc_ret_sppl_cd()));

		}
	}
	
	/**
	 * 仕入実績サービス登録の受払用RowMapperを作成します。
	 */
	protected Map_Purc_Ins01_IoR_IoR<Purc_Ins01_IoR,IoR> createMap_Purc_Ins01_IoR_IoR() {
		return new Map_Purc_Ins01_IoR_IoR<Purc_Ins01_IoR, IoR>();
	}
	/**
	 * 仕入実績サービス登録の受払用RowMapperです。
	 */
	public class Map_Purc_Ins01_IoR_IoR<D extends Purc_Ins01_IoR, S extends IoR>  extends MCRowMapper<D,S>{
		protected MCJoinKey<DtlL<DtlR>> _i2d;
		protected MCJoinKey<HdrL<HdrR>> _d2h;
		MCJoinKey<MCList<IoR>> _ai2bi;
		/**
		 * データ連携時に必要なデータを設定します。
		 * @param _i2d 受払いからから明細を取得するためのキー
		 * @param _d2h 明細からヘッダを取得するためのキー
		 */
		public void setWith(MCJoinKey<DtlL<DtlR>> _i2d, MCJoinKey<HdrL<HdrR>> _d2h,
				MCJoinKey<MCList<IoR>> _ai2bi){
			this._i2d = _i2d;
			this._d2h = _d2h;
			this._ai2bi = _ai2bi;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Purc_Ins01_IoR.$dtl_peg_no, IoR.$dtl_peg_no);
			addColumnPathMap(Purc_Ins01_IoR.$peg_no, IoR.$peg_no);
						
			addColumnPathMap(Purc_Ins01_IoR.$purc_ret_act_io_no, IoR.$purc_ret_act_io_no);

			addColumnPathMap(Purc_Ins01_IoR.$purc_act_io_no, IoR.$purc_act_io_no);
			addColumnPathMap(Purc_Ins01_IoR.$purc_act_io_seq, IoR.$purc_act_io_seq);
			addColumnPathMap(Purc_Ins01_IoR.$purc_act_d_no, IoR.$purc_act_d_no);
			addColumnPathMap(Purc_Ins01_IoR.$purc_act_d_seq, IoR.$purc_act_d_seq);
			
			addColumnPathMap(Purc_Ins01_IoR.$trd_unit_cd, IoR.$trd_unit_cd);
			addColumnPathMap(Purc_Ins01_IoR.$trd_unit_qty, IoR.$trd_unit_qty);
			addColumnPathMap(Purc_Ins01_IoR.$base_unit_cd, IoR.$base_unit_cd);
			addColumnPathMap(Purc_Ins01_IoR.$base_unit_qty, IoR.$base_unit_qty);
			addColumnPathMap(Purc_Ins01_IoR.$pack_unit_cd, IoR.$pack_unit_cd);
			addColumnPathMap(Purc_Ins01_IoR.$pack_unit_qty, IoR.$pack_unit_qty);
			addColumnPathMap(Purc_Ins01_IoR.$purc_cont_qty, IoR.$purc_cont_qty);
			addColumnPathMap(Purc_Ins01_IoR.$ver_no, IoR.$ver_no);
			addColumnPathMap(Purc_Ins01_IoR.$gd_cd, IoR.$gd_cd);
			addColumnPathMap(Purc_Ins01_IoR.$str_ln_cd, IoR.$str_ln_cd);
			addColumnPathMap(Purc_Ins01_IoR.$lot_no, IoR.$lot_no);
			addColumnPathMap(Purc_Ins01_IoR.$sublot_no, IoR.$sublot_no);
			addColumnPathMap(Purc_Ins01_IoR.$quality_typ, IoR.$quality_typ);
			addColumnPathMap(Purc_Ins01_IoR.$stk_insp_typ, IoR.$stk_insp_typ);

			addColumnPathMap(Purc_Ins01_IoR.$bp_lot_no, IoR.$bp_lot_no);
			addColumnPathMap(Purc_Ins01_IoR.$bp_dlv_slip_no, IoR.$bp_dlv_slip_no);
			addColumnPathMap(Purc_Ins01_IoR.$bp_dlv_slip_d_no, IoR.$bp_dlv_slip_d_no);
			addColumnPathMap(Purc_Ins01_IoR.$in_to_loc_wg_cd, IoR.$purc_ret_loc_wg_cd);
			addColumnPathMap(Purc_Ins01_IoR.$in_to_loc_cd, IoR.$purc_ret_loc_cd);
			addColumnPathMap(Purc_Ins01_IoR.$gi_wg_cd, IoR.$purc_ret_loc_wg_cd);
			addColumnPathMap(Purc_Ins01_IoR.$gi_loc_cd, IoR.$purc_ret_loc_cd);
			addColumnPathMap(Purc_Ins01_IoR.$gi_str_ln_cd, IoR.$str_ln_cd);
			addColumnPathMap(Purc_Ins01_IoR.$gi_unit_cd, IoR.$pack_unit_cd);
			addColumnPathMap(Purc_Ins01_IoR.$from_gd_cd, IoR.$gd_cd);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(src.getStringNE($purc_act_data_crud_typ));
			
			DtlR dr = src.getJoinedRow(_i2d);
			HdrR hr = dr.getJoinedRow(_d2h);

			dest.stk_arrv_bp_cd(src.after_prov_stk_arrv_bp_cd());
			String sit = src.after_prov_stk_id_typ();
			dest.stk_id_typ(sit);
			
			dest.stk_bp_cd(getStkBpCd(sit,
					hr.sppl_cd(), src.purc_ret_sppl_cd()));
			
		}
	}
	/**
	 * 支給実績サービス更新前チェック用のRowMapperを作成します。
	 */
	protected Map_ProvActChk01_DtlR_IoR<ProvActChk01_DtlR,IoR> createMap_ProvActChk01_DtlR_IoR() {
		return new Map_ProvActChk01_DtlR_IoR<ProvActChk01_DtlR, IoR>();
	}

	/**
	 * 支給実績サービス更新前チェック用のRowMapperです。
	 */
	public class Map_ProvActChk01_DtlR_IoR<D extends ProvActChk01_DtlR, S extends IoR> extends MCRowMapper<D,S>{
		protected MCJoinKey<DtlL<DtlR>> _i2d;
		protected MCJoinKey<HdrL<HdrR>> _d2h;
		protected MCOperation _ope;
		/**
		 * データ連携時に必要なデータを設定します。
		 * @param _i2d 受払いからから明細を取得するためのキー
		 * @param _d2h 明細からヘッダを取得するためのキー
		 * @param _clr 実行元オペレーション
		 */
		public void setWith(MCJoinKey<DtlL<DtlR>> _i2d, MCJoinKey<HdrL<HdrR>> _d2h, MCOperation _ope){
			this._i2d = _i2d;
			this._d2h = _d2h;
			this._ope = _ope;
		}
		
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ProvActChk01_DtlR.$peg_no, IoR.$peg_no);
			addColumnPathMap(ProvActChk01_DtlR.$wg_cd, IoR.$purc_ret_loc_wg_cd);
			addColumnPathMap(ProvActChk01_DtlR.$prsppl_cd, IoR.$purc_ret_sppl_cd);
			addColumnPathMap(ProvActChk01_DtlR.$stk_id_typ, IoR.$stk_id_typ);
			
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			String dct = src.getStringNE($prov_data_crud_typ);
			DtlR dr = src.getJoinedRow(_i2d);
			HdrR hr = dr.getJoinedRow(_d2h);
			
			dest.data_crud_typ(dct);
			dest.trd_ptn_typ(MAC_TRD_PTN_TYP.PROV_RTN.value());
			
			dest.accpt_dt(hr.ac_dt());
			dest.ac_dt(hr.ac_dt());
			dest.itm_cd(dr.itm_cd());
			dest.itm_sub1(dr.itm_sub1());
			dest.itm_sub2(dr.itm_sub2());
			dest.itm_sub3(dr.itm_sub3());
			
			dest.can_ac_dt(hr.can_ac_dt());
		
			if (!isNull(src.purc_ret_schd_io_no()) && MAC_DATA_CRUD_TYP.isCRT(dct)) {
				dest.prov_src_schd_typ(MSC_PROV_SRC_ACT_TYP.RET_DDLV.value());
				dest.prov_src_schd_no1(src.purc_ret_schd_io_no());
				
			}
			
			dest.prov_src_act_typ(MSC_PROV_SRC_ACT_TYP.RET_DDLV.value());
			if (MAC_DATA_CRUD_TYP.isUPD(dct) ||
					MAC_DATA_CRUD_TYP.isDEL(dct)) {
				dest.prov_src_act_no(src.purc_ret_act_io_no());
			}
		}
	}
	
	
	/**
	 * 支給実績サービス登録用のRowMapperを作成します。
	 */
	protected Map_ProvActUpd01_DtlR_IoR<ProvActUpd01_DtlR,IoR> createMap_ProvActUpd01_DtlR_IoR() {
		return new Map_ProvActUpd01_DtlR_IoR<ProvActUpd01_DtlR, IoR>();
	}
	/**
	 * 支給実績サービス登録用のRowMapperです。
	 */
	public class Map_ProvActUpd01_DtlR_IoR<D extends ProvActUpd01_DtlR, S extends IoR> extends MCRowMapper<D,S>{
		protected MCJoinKey<DtlL<DtlR>> _i2d;
		protected MCJoinKey<HdrL<HdrR>> _d2h;
		protected MCOperation _ope;
		protected IoL<IoR> _iol;
		
		/**
		 * データ連携時に必要なデータを設定します。
		 * @param _i2d 受払いからから明細を取得するためのキー
		 * @param _d2h 明細からヘッダを取得するためのキー
		 * @param _iol コピー対象のリスト
		 * @param _clr 実行元オペレーション
		 */
		public void setWith(MCJoinKey<DtlL<DtlR>> _i2d, MCJoinKey<HdrL<HdrR>> _d2h, IoL<IoR>_iol, MCOperation _ope){
			this._i2d = _i2d;
			this._d2h = _d2h;
			this._iol = _iol;
			this._ope = _ope;
		}
		
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ProvActUpd01_DtlR.$peg_no, IoR.$peg_no);
			
			addColumnPathMap(ProvActUpd01_DtlR.$trd_unit_cd, IoR.$trd_unit_cd);
			addColumnPathMap(ProvActUpd01_DtlR.$trd_unit_qty, IoR.$trd_unit_qty);
			addColumnPathMap(ProvActUpd01_DtlR.$base_unit_cd, IoR.$base_unit_cd);
			addColumnPathMap(ProvActUpd01_DtlR.$base_unit_qty, IoR.$base_unit_qty);
			
			addColumnPathMap(ProvActUpd01_DtlR.$loc_cd, IoR.$purc_ret_loc_cd);
			addColumnPathMap(ProvActChk01_DtlR.$wg_cd, IoR.$purc_ret_loc_wg_cd);
			addColumnPathMap(ProvActChk01_DtlR.$prsppl_cd, IoR.$purc_ret_sppl_cd);
			addColumnPathMap(ProvActUpd01_DtlR.$str_ln_cd, IoR.$str_ln_cd);
			addColumnPathMap(ProvActUpd01_DtlR.$lot_no, IoR.$lot_no);
			addColumnPathMap(ProvActUpd01_DtlR.$sublot_no, IoR.$sublot_no);
			addColumnPathMap(ProvActUpd01_DtlR.$gd_cd, IoR.$gd_cd);
			addColumnPathMap(ProvActUpd01_DtlR.$quality_typ, IoR.$quality_typ);
			addColumnPathMap(ProvActUpd01_DtlR.$stk_insp_typ, IoR.$stk_insp_typ);
			addColumnPathMap(ProvActUpd01_DtlR.$stk_id_typ, IoR.$stk_id_typ);
			addColumnPathMap(ProvActUpd01_DtlR.$stk_arrv_bp_cd, IoR.$stk_arrv_bp_cd);
	
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			String dct = src.getStringNE($prov_data_crud_typ);
			DtlR dr = src.getJoinedRow(_i2d);
			HdrR hr = dr.getJoinedRow(_d2h);

			dest.data_crud_typ(dct);
			dest.trd_ptn_typ(MAC_TRD_PTN_TYP.PROV_RTN.value());

			dest.accpt_dt(hr.ac_dt());
			dest.ac_dt(hr.ac_dt());
			dest.itm_cd(dr.itm_cd());
			dest.itm_sub1(dr.itm_sub1());
			dest.itm_sub2(dr.itm_sub2());
			dest.itm_sub3(dr.itm_sub3());
			dest.sno1(dr.sno1());
			dest.sno2(dr.sno2());
			dest.sno3(dr.sno3());
			dest.sno4(dr.sno4());
			dest.base_ac_dt(dr.base_ac_dt());
			dest.can_ac_dt(hr.can_ac_dt());
			
			if (!isNull(src.purc_ret_schd_io_no()) && MAC_DATA_CRUD_TYP.isCRT(dct)) {
				dest.prov_src_schd_typ(MSC_PROV_SRC_ACT_TYP.RET_DDLV.value());
				dest.prov_src_schd_no1(src.purc_ret_schd_io_no());
			}
			
			dest.prov_src_act_typ(MSC_PROV_SRC_ACT_TYP.RET_DDLV.value());
			dest.prov_src_act_no(src.purc_ret_act_io_no());
			
			dest.stk_bp_cd(getStkBpCd(
					src.stk_id_typ(), hr.sppl_cd(), src.purc_ret_sppl_cd()));

			if (!isNull(dr.purc_ret_schd_d_no()) || !isNull(dr.sls_act_d_no())) {
				dest.addBooleanColumn("alloc_flg", true);
			}
		}
		
	}
	
	
	
	/**
	 * 受払予定サービス登録用のRowMapperを作成します。
	 */
	protected Map_IoSchd_Ins01_DtlR_Schd_IoR<IoSchd_Ins01_DtlR,Schd_IoR> createMap_IoSchd_Ins01_DtlR_Schd_IoR() {
		return new Map_IoSchd_Ins01_DtlR_Schd_IoR<IoSchd_Ins01_DtlR, Schd_IoR>();
	}

	/**
	 * 受払予定サービス登録用のRowMapperです。
	 */
	public class Map_IoSchd_Ins01_DtlR_Schd_IoR<D extends IoSchd_Ins01_DtlR, S extends Schd_IoR> extends MCRowMapper<D,S>{
		protected MCJoinKey<MCList<Schd_DtlR>> _i2d;
		protected MCJoinKey<MCList<Schd_HdrR>> _d2h;
		protected MCOperation _ope;
		/**
		 * データ連携時に必要なデータを設定します。
		 * @param _i2d 受払からから明細を取得するためのキー
		 * @param _d2h 明細からヘッダを取得するためのキー
		 * @param _clr 実行元オペレーション
		 */
		public void setWith(MCJoinKey<MCList<Schd_DtlR>> _i2d,
				MCJoinKey<MCList<Schd_HdrR>> _d2h, MCOperation _ope){
			this._i2d = _i2d;
			this._d2h = _d2h;
			this._ope = _ope;
		}
		@Override
		protected void setupColumnPathMap() {

			addColumnPathMap(IoSchd_Ins01_DtlR.$peg_no, Schd_IoR.$peg_no);
			addColumnPathMap(IoSchd_Ins01_DtlR.$ver_no, Schd_IoR.$ver_no);
			addColumnPathMap(IoSchd_Ins01_DtlR.$loc_cd, Schd_IoR.$purc_ret_loc_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$str_ln_cd, Schd_IoR.$str_ln_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$lot_no, Schd_IoR.$lot_no);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sublot_no, Schd_IoR.$sublot_no);
			addColumnPathMap(IoSchd_Ins01_DtlR.$trd_unit_cd, Schd_IoR.$trd_unit_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$base_unit_cd, Schd_IoR.$base_unit_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$trd_unit_qty, Schd_IoR.$trd_unit_qty);
			addColumnPathMap(IoSchd_Ins01_DtlR.$base_unit_qty, Schd_IoR.$base_unit_qty);
			addColumnPathMap(IoSchd_Ins01_DtlR.$gd_cd, Schd_IoR.$gd_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$quality_typ, Schd_IoR.$quality_typ);
			addColumnPathMap(IoSchd_Ins01_DtlR.$stk_insp_typ, Schd_IoR.$stk_insp_typ);
			addColumnPathMap(IoSchd_Ins01_DtlR.$stk_id_typ, Schd_IoR.$stk_id_typ);
			addColumnPathMap(IoSchd_Ins01_DtlR.$stk_arrv_bp_cd, Schd_IoR.$stk_arrv_bp_cd);

		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.io_schd_typ(getIoSchdTyp(src.purc_ret_sppl_cd()));
			dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());
			dest.io_schd_no(src.purc_ret_schd_io_no());
			dest.io_schd_pr_no(src.io_schd_pr_no());
			
			dest.alloc_flg(true);
			
			Schd_DtlR dr = src.getJoinedRow(_i2d);
			if (dr != null) {
				dest.itm_cd(dr.itm_cd());
				dest.itm_sub1(dr.itm_sub1());
				dest.itm_sub2(dr.itm_sub2());
				dest.itm_sub3(dr.itm_sub3());
				dest.sno1(dr.sno1());
				dest.sno2(dr.sno2());
				dest.sno3(dr.sno3());
				dest.sno4(dr.sno4());
				dest.rsn_cd(dr.ret_rsn_cd());
				
				Schd_HdrR hr = dr.getJoinedRow(_d2h);
				if (hr != null) {
					dest.schd_dt(hr.schd_dt());
					if (MSC_STK_ID_TYP.isCOSTK(src.stk_id_typ())) {
						dest.accpt_schd_dt(hr.schd_dt());
					}
					dest.stk_bp_cd(getStkBpCd(src.stk_id_typ(), hr.sppl_cd(), dr.purc_ret_sppl_cd()));
				}
			}
		}
	}
	
	protected String getIoSchdTyp(String purc_ret_sppl_cd) {

		if (isNull(purc_ret_sppl_cd)){
			return MSC_IO_SCHD_TYP.ARR_RTN.value();
		}
		else {
			return MSC_IO_SCHD_TYP.ARR_RTN_PROV.value();
		}
	}

	/**
	 * 受払実績サービスWK作成用のRowMapperを作成します。
	 */
	protected Map_IoAct_Ins01_DtlR_IoR<IoAct_Ins01_DtlR,IoR> createMap_IoAct_Ins01_DtlR_IoR() {
		return new Map_IoAct_Ins01_DtlR_IoR<IoAct_Ins01_DtlR, IoR>();
	}

	/**
	 * 受払実績サービスWK作成用のRowMapperです。
	 */
	public class Map_IoAct_Ins01_DtlR_IoR<D extends IoAct_Ins01_DtlR, S extends IoR> extends MCRowMapper<D,S>{
		protected MCJoinKey<DtlL<DtlR>> _i2d;
		protected MCJoinKey<HdrL<HdrR>> _d2h;
		protected MCOperation _ope;
		/**
		 * データ連携時に必要なデータを設定します。
		 * @param _i2d 受払いからから明細を取得するためのキー
		 * @param _d2h 明細からヘッダを取得するためのキー
		 * @param _clr 実行元オペレーション
		 */
		public void setWith(MCJoinKey<DtlL<DtlR>> _i2d, MCJoinKey<HdrL<HdrR>> _d2h, MCOperation _ope){
			this._i2d = _i2d;
			this._d2h = _d2h;
			this._ope = _ope;
		}
		@Override
		protected void setupColumnPathMap() {

			addColumnPathMap(IoAct_Ins01_DtlR.$gi_loc_cd, IoR.$purc_ret_loc_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$gi_str_ln_cd, IoR.$str_ln_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$lot_no, IoR.$lot_no);
			addColumnPathMap(IoAct_Ins01_DtlR.$sublot_no, IoR.$sublot_no);
			addColumnPathMap(IoAct_Ins01_DtlR.$gi_gd_cd, IoR.$gd_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$act_io_no, IoR.$purc_ret_act_io_no);
			
			addColumnPathMap(IoAct_Ins01_DtlR.$quality_typ, IoR.$quality_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$stk_insp_typ, IoR.$stk_insp_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$trd_unit_qty, IoR.$trd_unit_qty);
			addColumnPathMap(IoAct_Ins01_DtlR.$trd_unit_cd, IoR.$trd_unit_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$pack_unit_qty, IoR.$pack_unit_qty);
			addColumnPathMap(IoAct_Ins01_DtlR.$pack_unit_cd, IoR.$pack_unit_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$base_unit_qty, IoR.$base_unit_qty);
			addColumnPathMap(IoAct_Ins01_DtlR.$base_unit_cd, IoR.$base_unit_cd);
			
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			String dct = src.getStringNE($io_act_data_crud_typ);
			dest.data_crud_typ(dct);
			DtlR dr = src.getJoinedRow(_i2d);
			HdrR hr = dr.getJoinedRow(_d2h);
			
			String sit = src.after_prov_stk_id_typ();
			
			dest.stk_id_typ(sit);
			dest.stk_bp_cd(getStkBpCd(sit, 
					hr.sppl_cd(), dr.purc_ret_sppl_cd()));
			
			dest.ac_dt(hr.ac_dt());
			dest.can_ac_dt(hr.can_ac_dt());
			
			dest.act_tm(hr.purc_ret_dt());
			dest.act_no(hr.purc_ret_act_no());
			dest.act_rev_no(dr.purc_ret_act_rev());
			dest.act_d_no(dr.purc_ret_act_d_no());
			dest.un_fix_flg(dr.interim_flg());
			dest.trd_cd(hr.trd_cd());
			dest.trd_ptn_typ(hr.trd_ptn_typ());
			dest.trn_typ(MSC_TRN_TYP.PURC_RTN.value());
			dest.rcpt_iv_no(hr.rcpt_iv_no());
			
			dest.rsn_cd(dr.ret_rsn_cd());
			dest.gi_wg_cd(dr.purc_ret_loc_wg_cd());

			dest.purc_dpt_cd(hr.purc_dpt_cd());
			dest.ap_dpt_cd(dr.ap_dpt_cd());
			dest.bd_dpt_cd(dr.bd_dpt_cd());
			dest.purc_usr_cd(hr.purc_usr_cd());
			dest.itm_cd(dr.itm_cd());
			dest.itm_sub1(dr.itm_sub1());
			dest.itm_sub2(dr.itm_sub2());
			dest.itm_sub3(dr.itm_sub3());
			dest.itm_nm(dr.itm_nm());
			dest.stk_mng_typ(dr.stk_mng_typ());
			dest.sundry_itm_flg(dr.sundry_itm_flg());
			dest.sno1(dr.sno1());
			dest.sno2(dr.sno2());
			dest.sno3(dr.sno3());
			dest.sno4(dr.sno4());

			MAM_ITM_R itm = getItm(dr.itm_cd(), dr.itm_sub1(), dr.itm_sub2(), dr.itm_sub3());
			dest.sno1_mng_typ(itm.sno1_mng_typ());
			dest.sno2_mng_typ(itm.sno2_mng_typ());
			dest.sno3_mng_typ(itm.sno3_mng_typ());
			dest.sno4_mng_typ(itm.sno4_mng_typ());
			
			dest.stk_arrv_bp_cd(src.after_prov_stk_arrv_bp_cd());
			dest.trd_cur_cd(hr.trd_cur_cd());
			dest.base_cur_cd(hr.base_cur_cd());
			dest.ptax_cur_cd(hr.ptax_cur_cd());
			
			dest.trd_cur_upri(dr.trd_cur_upri());
			dest.trd_cur_amt(dr.trd_cur_amt());
			dest.trd_cur_tax_amt(dr.trd_cur_tax_amt());
			dest.base_cur_upri(dr.base_cur_upri());
			dest.base_cur_amt(dr.base_cur_amt());
			dest.base_cur_tax_amt(dr.base_cur_tax_amt());
			dest.ptax_cur_upri(dr.ptax_cur_upri());
			dest.ptax_cur_amt(dr.ptax_cur_amt());
			dest.ptax_cur_tax_amt(dr.ptax_cur_tax_amt());
			dest.tax_cd(dr.tax_cd());
			dest.xrate_cd(hr.xrate_cd());
			dest.xrate(hr.xrate());
			dest.ptax_xrate_cd(hr.xrate_cd());
			dest.ptax_xrate(hr.ptax_xrate());
			dest.wtax_rate(dr.wtax_rate());
			dest.wtax_amt(dr.wtax_amt());
			dest.po_no(dr.po_no());
			dest.asppl_cd(hr.asppl_cd());
			dest.sppl_cd(hr.sppl_cd());
			dest.sppl_itm_cd(dr.sppl_itm_cd());
			dest.sppl_itm_nm(dr.sppl_itm_nm());
			dest.purc_typ(dr.purc_typ());
			dest.purc_id_typ(dr.purc_id_typ());
			dest.trd_rmrks(hr.trd_rmrks());
			dest.trd_d_rmrks(dr.trd_d_rmrks());
			if (!isNull(dr.purc_ret_schd_d_no()) || !isNull(dr.sls_act_d_no())) {
				dest.no_gi_alloc_flg(true);
			}
		}
	}
	
	protected MCList<MST_PROV_ACT_R> _provActCache = null;
	protected MCIndexKey _provActIkCache = null;

	/**
	 * 購買帳票発行サービス仕入返品票発行用のRowMapperを作成します。
	 */
	protected Map_PurcPrnt_Prnt02_CndR_HdrR<PurcPrnt_Prnt02_CndR,HdrR> createMap_PurcPrnt_Prnt02_CndR_HdrR() {
		return new Map_PurcPrnt_Prnt02_CndR_HdrR<PurcPrnt_Prnt02_CndR, HdrR>();
	}

	/**
	 * 購買帳票発行サービス仕入返品票発行用のRowMapperです。
	 */
	public class Map_PurcPrnt_Prnt02_CndR_HdrR<D extends PurcPrnt_Prnt02_CndR, S extends HdrR> extends MCRowMapper<D,S>{
		protected MCOperation _ope;
		/**
		 * データ連携時に必要なデータを設定します。
		 * @param _clr 実行元オペレーション
		 */
		public void setWith(MCOperation _ope){
			this._ope = _ope;
		}
		
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PurcPrnt_Prnt02_CndR.$purc_ret_act_no, HdrR.$purc_ret_act_no);
			addColumnPathMap(PurcPrnt_Prnt02_CndR.$purc_ret_act_rev, HdrR.$purc_ret_act_rev);
		}
	}
	
	public static final Class<MSBDL_PurcRetRegService> CLAZZ = MSBDL_PurcRetRegService.class;

	protected FXUCL_MCDbcCache<MAM_BP_R> _spplCachd = null;

	protected static void createSpplCache(HdrL<HdrR> hdrL) {

		object(CLAZZ)._initSpplCache(hdrL, HdrR.$sppl_cd);
	}

	protected static FXUCL_MCDbcCache<MAM_BP_R> getSpplCache() {
		return object(CLAZZ)._spplCachd;
	}

	protected void _initSpplCache(HdrL<HdrR> hdrL,
			String dtlBpCdCol) {
		_spplCachd = new FXUCL_MCDbcCache<MAM_BP_R>(
				MCQueryApiBuilder.create(MAM_BP_R.create("T")), hdrL, dtlBpCdCol);
	}

	protected FXUCL_MCDbcCache<MAM_LOC_R> _locCache = null;

	protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _dptCache = null;

	protected FXUCL_MCDbcCacheStEnd<MAM_PROV_UPRI_R> _provUpriCache = null;

	protected static void initProvUpriCache(MCList<MAM_PROV_UPRI_R> dbcL, MCJoinKey<HdrL<HdrR>> d2h,
			MCJoinKey<DtlL<DtlR>> i2d, IoL<IoR> iol) {
		object(CLAZZ)._initProvUpriCache(dbcL, d2h, i2d, iol);
	}

	protected void _initProvUpriCache(MCList<MAM_PROV_UPRI_R> dbcL,
			MCJoinKey<HdrL<HdrR>> d2h, MCJoinKey<DtlL<DtlR>> i2d, IoL<IoR> iol) {

		IoL<IoR> ciol = iol.createInstance();
		ciol.addStringColumn(HdrR.$trd_cur_cd);
		ciol.addStringColumn(DtlR.$itm_cd);
		ciol.addStringColumn(DtlR.$itm_sub1);
		ciol.addStringColumn(DtlR.$itm_sub2);
		ciol.addStringColumn(DtlR.$itm_sub3);
		iol.forEach(ir -> {
			DtlR dr = ir.getJoinedRow(i2d);
			HdrR hr = dr.getJoinedRow(d2h);
			IoR cir = ciol.createRow();
			cir.setString(HdrR.$trd_cur_cd, hr.trd_cur_cd());
			cir.setString(DtlR.$itm_cd, dr.itm_cd());
			cir.setString(DtlR.$itm_sub1, dr.itm_sub1());
			cir.setString(DtlR.$itm_sub2, dr.itm_sub2());
			cir.setString(DtlR.$itm_sub3, dr.itm_sub3());
			ciol.add(cir);
		});
		_provUpriCache = new FXUCL_MCDbcCacheStEnd<MAM_PROV_UPRI_R>(
				dbcL,
				MCQueryApiBuilder.create(MAM_PROV_UPRI_R.create("T")),
				ciol,
			DtlR.$itm_cd,
			DtlR.$itm_sub1,
			DtlR.$itm_sub2,
			DtlR.$itm_sub3,
			IoR.$purc_ret_sppl_cd,
			HdrR.$trd_cur_cd,
			IoR.$purc_ret_loc_wg_cd);
	}
	/**
	 * Schd_Ins01オペレーション.<p>
	 *
	 */
	public class Schd_Ins01 extends MSBDL_PurcRetRegService_MC_A.Schd_Ins01 {
		
		MCJoinKey<MCList<Schd_IoR>> _d2i;
		MCJoinKey<MCList<Schd_DtlR>> _i2d;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			editUpForChk();
			callThisChk();
			throwUpdErr();
			editUp();
			doSave();
			setDown();
		}

		protected void editUpForChk() {
			MCIndexKey ik = up1().createIndex(Schd_DtlR.$peg_no);
			up2().forEach(ir -> {
				Schd_DtlR dr = up1().getFirst(ik, ir.dtl_peg_no());
				if(!isNull(dr)) {
					// メッセージ出力用に行番号のみを上段の行番号を設定する
					ir.setGUIIndex(dr.getGUIIndex());
				}
			});
		}
		protected void callThisChk() {
			MSBDL_PurcRetRegService.Schd_Chk01 ope = MSBDL_PurcRetRegService.crtSchd_Chk01();

			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.up2().setAll(up2());
			ope.exec();
			MCRow.copyall(up0(), ope.down0());
			_d2i = ope._d2i;
			_i2d = up2().join(Schd_IoR.$dtl_peg_no, up1(), Schd_DtlR.$peg_no);
		}
		
		protected void editUp() {
			setPurcRetSchdNo(up0());
			setPurcRetSchdDNo(up1(), up0());
			setDispSeq(up1());
			setItmNm(up1());
			setPurcRetSchdIoNo(up2(), _i2d);
			setIoSchdPrNo(up2());
		}
		
		protected void doSave() {
			
			dbInsertEx("MSBDL5170_MST_PURC_RET_SCHD_I01", up0(),
					MCQueryApiBuilder.create(Schd_HdrR.create("T")));
			dbInsertEx("MSBDL5170_MST_PURC_RET_SCHD_D_I01", up1(),
					MCQueryApiBuilder.create(Schd_DtlR.create("T")));
			dbInsertEx("MSBDL5170_MST_PURC_RET_SCHD_IO_I01", up2(),
					MCQueryApiBuilder.create(Schd_IoR.create("T")));

			MCList<Schd_HdrR> hl = MCList.create(Schd_HdrR.class);
			hl.add(up0());
			up1().forEach(r -> r.hdr_peg_no(up0().peg_no()));
			MCJoinKey<MCList<Schd_HdrR>> d2h = up1().join(Schd_DtlR.$hdr_peg_no, hl, Schd_HdrR.$peg_no);
			callSaveService(up0(), up1(), up2(), _i2d, d2h, null, null, this);
			
		}
		
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}
	}
	/**
	 * Schd_Upd01オペレーション.<p>
	 *
	 */
	public class Schd_Upd01 extends MSBDL_PurcRetRegService_MC_A.Schd_Upd01 {

		protected MSBDL_PurcRetRegService.Schd_Chk02 _cope;
		MCJoinKey<MCList<Schd_DtlR>> _i2d;
		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			editUpForChk();
			callThisChk();
			throwUpdErr();
			editUp();
			doSave();
			setDown();
		}

		protected void editUpForChk() {
			MCIndexKey ik = up1().createIndex(Schd_DtlR.$peg_no);
			up2().forEach(ir -> {
				Schd_DtlR dr = up1().getFirst(ik, ir.dtl_peg_no());
				if(!isNull(dr)) {
					// メッセージ出力用に行番号のみを上段の行番号を設定する
					ir.setGUIIndex(dr.getGUIIndex());
				}
			});
		}
		protected void callThisChk() {
			_cope = MSBDL_PurcRetRegService.crtSchd_Chk02();

			MCRow.copyall(_cope.up0(), up0());
			_cope.up1().setAll(up1());
			_cope.up2().setAll(up2());
			_cope.exec();
			MCRow.copyall(up0(), _cope.down0());
			_i2d = up2().join(Schd_IoR.$dtl_peg_no, up1(), Schd_DtlR.$peg_no);
		}

		protected void editUp() {
			setPurcRetSchdDNo(up1(), up0());
			setDispSeq(up1());
			setItmNm(up1());
			setPurcRetSchdIoNo(up2(), _i2d);
			setIoSchdPrNo(up2());
		}
		protected void doSave() {
			dbUpdateKey("MSBDL5170_MST_PURC_RET_SCHD_U02", up0(),
					MCQueryApiBuilder.create(Schd_HdrR.create("T")));
			// DispSeqのみを更新するデータを格納するコンテナ
			Schd_DtlL<Schd_DtlR> dsOnly = up1().createInstance();
			// 更新対象データを格納するコンテナ
			Schd_DtlL<Schd_DtlR> upd = up1().createInstance();
			up1().forEach(r -> {
				if (r.isStatusNone()) {
					dsOnly.add(r);
				}
				else {
					if (r.abort_flg()) {
						r.cmpl_flg(true);
					}
					else {
						Schd_DtlR bdr = r.getJoinedRow(_cope._ad2bd);
						//残数がない場合true
						r.cmpl_flg(!isNull(bdr) && !isNull(bdr.ret_qty()) && 
								MCNumber.ZERO.gte(bdr.base_unit_qty().subtract(bdr.ret_qty())));	
					}
					upd.add(r);
				}
			});
			
			dbLockInsUpdDelByStatusNoCheck("MSBDL5170_MST_PURC_RET_SCHD_D_U02", upd,
					MCQueryApiBuilder.create(Schd_DtlR.create("T")));

			MST_PURC_RET_SCHD_D_R dsOnly_t = Schd_DtlR.create("T");
			MCQueryApiBuilder dsOnly_bldr = MCQueryApiBuilder.create(dsOnly_t);
			dsOnly_bldr.setSet(dsOnly_t.disp_seq);
			dbUpdateKey("MSBDL5170_MST_PURC_RET_SCHD_D_U03", dsOnly, dsOnly_bldr);

			MCIndexKey up1Key = up1().createIndex(Schd_DtlR.$peg_no);
			Schd_IoL<Schd_IoR> upd2 = up2().createInstance();
			up2().forEach(r -> {
				Schd_DtlR up1 = up1().getFirst(up1Key, r.dtl_peg_no());
				if(!isNull(up1)) {
					upd2.add(r);
				}
			});
			
			dbLockInsUpdDelByStatusNoCheck("MSBDL5170_MST_PURC_RET_SCHD_IO_U01",
					upd2.statusChangedList(),
					MCQueryApiBuilder.create(Schd_IoR.create("T")));

			MCList<Schd_HdrR> hl = MCList.create(Schd_HdrR.class);
			hl.add(up0());
			upd.forEach(r -> r.hdr_peg_no(up0().peg_no()));
			MCJoinKey<MCList<Schd_HdrR>> d2h = upd.join(Schd_DtlR.$hdr_peg_no, hl, Schd_HdrR.$peg_no);
			callSaveService(up0(), upd, upd2, _i2d, d2h, _cope._ad2bd, _cope._ai2bi, this);
		
		}

		protected void setDown() {
			down0().setAll(up1());
			down1().setAll(up2());
		}
	}

	/**
	 * Schd_Upd02オペレーション.<p>
	 *
	 */
	public class Schd_Upd02 extends MSBDL_PurcRetRegService_MC_A.Schd_Upd02 {
		
		MSBDL_PurcRetRegService.Schd_Chk04 _cope;
		MCJoinKey<MCList<Schd_IoR>> _d2i;
		MCJoinKey<MCList<Schd_DtlR>> _i2d;
		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			editUpForChk();
			callThisChk();
			throwUpdErr();
			editUp();
			doSave();
			setDown();
		}

		protected void editUpForChk() {
			MCIndexKey idxUp2 = up2().createIndex(Schd_IoR.$dtl_peg_no);
			for (Schd_DtlR dr : up1()) {
				// 基準単位の小数部有効桁数、端数処理区分を補完
				MAM_ITM_R itm = getItm(dr.itm_cd(), dr.itm_sub1(), dr.itm_sub2(), dr.itm_sub3());
				dr.base_unit_dec_place(itm.dec_place());
				dr.base_unit_rnd_typ(itm.rnd_typ());
				
				for (Schd_IoR ir : up2().subList(idxUp2, dr.peg_no())) {
					// メッセージ出力用に行番号のみを上段の行番号を設定する
					ir.setGUIIndex(dr.getGUIIndex());
					// 取引単位分母数量、換算数量を補完
					MAVM_ITM_UNIT_R itmUnit
						= getItmUnit(ir.itm_cd(), ir.itm_sub1(), ir.itm_sub2(), ir.itm_sub3(), ir.trd_unit_cd());
					ir.trd_unit_dmn_qty(itmUnit.conv_base_qty());
					ir.trd_unit_conv_qty(itmUnit.conv_qty());					
				}
				
			}
			
		}
		protected void callThisChk() {
			_cope = MSBDL_PurcRetRegService.crtSchd_Chk04();

			MCRow.copyall(_cope.up0(), up0());
			_cope.up1().setAll(up1());
			_cope.up2().setAll(up2());
			_cope.exec();
			MCRow.copyall(up0(), _cope.down0());
			_d2i = _cope._d2i;
			_i2d = up2().join(Schd_IoR.$dtl_peg_no, up1(), Schd_DtlR.$peg_no);
		}

		protected void editUp() {
		}

		protected void doSave() {
			
			Schd_DtlL<Schd_DtlR> abort = up1();
			abort.forEach(r -> {
				if (r.abort_flg()) {
					r.cmpl_flg(true);
				}
				else {
					MCNumber rem = r.base_unit_qty().subtract(r.ret_qty());
					r.cmpl_flg(!isNull(rem) && MCNumber.ZERO.gte(rem));
				}
			});
			MST_PURC_RET_SCHD_D_R t = Schd_DtlR.create("T");
			MCQueryApiBuilder abort_bldr = MCQueryApiBuilder.create(t);
			abort_bldr.setSet(t.abort_flg);
			abort_bldr.addSet(t.cmpl_flg);
			dbUpdateKey("MSBDL5170_MST_PURC_RET_SCHD_D_U04", abort, abort_bldr);
			
			MCList<Schd_HdrR> hl = MCList.create(Schd_HdrR.class);
			hl.add(up0());
			up1().forEach(r -> r.hdr_peg_no(up0().peg_no()));
			MCJoinKey<MCList<Schd_HdrR>> d2h = up1().join(Schd_DtlR.$hdr_peg_no, hl, Schd_HdrR.$peg_no);
			callSaveService(up0(), up1(), up2(), _i2d, d2h, _cope._ad2bd, _cope._ai2bi, this);
		
		}

		protected void setDown() {
			down0().setAll(up1());
			down1().setAll(up2());
		}
	}
	/**
	 * Schd_Del01オペレーション.<p>
	 *
	 */
	public class Schd_Del01 extends MSBDL_PurcRetRegService_MC_A.Schd_Del01 {
		protected MSBDL_PurcRetRegService.Schd_Chk03 _cope;
		MCJoinKey<MCList<Schd_DtlR>> _i2d;
		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			
			callThisChk();
			throwCanErr();
			editUp();
			doSave();
			setDown();
		}

		protected void callThisChk() {
			_cope = MSBDL_PurcRetRegService.crtSchd_Chk03();
			MCRow.copyall(_cope.up0(), up0());
			_cope.exec();
			MCRow.copyall(up0(), _cope.down0());
			_i2d = _cope._prSchdIOL.join(Schd_IoR.$dtl_peg_no, _cope._prSchdDL, Schd_DtlR.$peg_no);
		}

		protected void editUp() {
			
		}
		
		protected void doSave() {
			dbDeleteKey("MSBDL5170_MST_PURC_RET_SCHD_D01", up0(),
					MCQueryApiBuilder.create(Schd_HdrR.create("T")));
			dbDeleteKey("MSBDL5170_MST_PURC_RET_SCHD_D_D01", _cope._prSchdDL,
					MCQueryApiBuilder.create(Schd_DtlR.create("T")));
			dbDeleteKey("MSBDL5170_MST_PURC_RET_SCHD_IO_D01", _cope._prSchdIOL,
					MCQueryApiBuilder.create(Schd_IoR.create("T")));
			MCList<Schd_HdrR> hl = MCList.create(Schd_HdrR.class);
			hl.add(up0());
			MCJoinKey<MCList<Schd_HdrR>> d2h = _cope._prSchdDL.join(Schd_DtlR.$purc_ret_schd_no, hl, Schd_HdrR.$purc_ret_schd_no);
			callSaveService(up0(), _cope._prSchdDL, _cope._prSchdIOL, _i2d, d2h, _cope._ad2bd, _cope._ai2bi, this);
		}

		protected void setDown() {
		}
	}
	/**
	 * Schd_Chk01オペレーション.<p>
	 *
	 */
	public class Schd_Chk01 extends MSBDL_PurcRetRegService_MC_A.Schd_Chk01 {
	
		protected MCJoinKey<MCList<Schd_IoR>> _d2i = null;
		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();
			
			// 単票のチェックロジックでは、doItは必ず以下のような実装になります
			// ・自身のチェックでエラーがなければ他のサービスのチェックロジックを呼び出す
			// ・チェックが終わったら下り電文を設定する
			// 単票画面の場合、外部からデータを取り込む機能がないため、キー項目の整合性などはチェックしません

			if (!hasErr()) {
				callChkService();
			}

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			
			// 単票のチェックロジックでは、doServerCheckBaseは必ず以下のような実装になります
			// ・lockAndCheckBaseで更新カウンタチェック対象、補完に必要なトランザクションデータを検索する
			// ・エラーがなければcompBaseでトランザクションデータから補完する
			MCMessageList msgL = super.doServerCheckBase();
			createSundryItmCache(up1());
			createMfgInstCache(up1());
			msgL.addAll(lockAndCheckBase());

			if (!msgL.isEmpty()) {
				return msgL;
			}

			compBase();
			MCJoinKey<MCList<Schd_IoR>> _d2i = null;
			_d2i = up1().join(Schd_DtlR.$peg_no, up2(), Schd_IoR.$dtl_peg_no);

			for (Schd_DtlR r : up1()) {
				MCList<Schd_IoR> iol = r.getJoined(_d2i);
				if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
					iol.setString(IoR.$lot_no, MAC_STR.NULL_VAL.value());
				}
				if (MAC_LOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
					iol.setString(IoR.$sublot_no, MAC_STR.NULL_VAL.value());
				}
			}

			return msgL;
		}

		protected MCMessageList lockAndCheckBase() {
			
			// 更新カウンタチェック、更新前データのDACチェック、トランザクションデータの検索を実装します
			// 取得したトランザクションデータはインスタンス変数に格納します（他の処理から参照できるように）
			// 単票なのでデータ量の制限があまりないため、select句は絞りません
			MCMessageList msgL = new MCMessageList();
			return msgL;
		}

		protected void compBase() {
			
			// トランザクションデータからの補完処理はここに実装する
			// それ以外の補完処理はリストロジックチェックで補完された情報などが前提となる場合があり、ここには実装しない

			
			_d2i = up1().join(Schd_DtlR.$peg_no, up2(), Schd_IoR.$dtl_peg_no);
			
			// 各負担項目ＮＯの存在チェック用のトランザクションデータを取得する
			getDataForExistChk(up1());
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			
			// 単票のチェックロジックでは、doServerCheckSubは必ず以下のような実装になります
			// ・checkSubで条件付チェック
			// ・エラーがなければ（doServerCheckSub以前のチェック結果含む）compSubで補完する
			MCMessageList msgL = super.doServerCheckSub();

			if (!msgL.isEmpty() || hasErrFlgOn(up0())) {
				return msgL;
			}
			msgL.addAll(checkAtLeastOneDtl(up0(), up1()));
			msgL.addAll(MSBDL_PurcUtil.checkAtLeastOneIo(up1(), up2()));

			setParentErrFlg(up0(), up1());
			
			msgL.addAll(existItmDtlCheck(up0(), 
					getChkList(up1(),MCRow.CREATE, MCRow.MODIFY, MCRow.NONE), 
					_d2i));
			
			msgL.addAll(checkSub(up0(), 
					getChkList(up1(),MCRow.CREATE, MCRow.MODIFY, MCRow.NONE), 
					up2(), _d2i));
			
			msgL.addAll(checkPurcRetSchdSyncCols(getChkList(up1(),MCRow.CREATE, MCRow.MODIFY, MCRow.NONE), 
					_d2i));
			
			msgL.addAll(existBdCheck(up1()));
			
			msgL.addAll(chkOutsrcUpri(up0(), up1()));
			if (!msgL.isEmpty() || hasErrFlgOn(up0(), up1())) {
				return msgL;
			}

			compSub();

			msgL.addAll(chkDtlAndIo(getChkList(up1(),MCRow.CREATE, MCRow.MODIFY, MCRow.NONE),
					_d2i));
			
			return msgL;
		}



				
		protected void compSub() {
			
			// リストロジックチェックで補完しきれない項目を補完する

			compSubImpl(up0(), up1(), up2());	
			if (!up0().sppl_iv_flg()) {
				up0().rcpt_iv_no(null);
				up0().ref_rcpt_iv_no(null);
			}
		}

		@Override
		protected void putListLogicCheckBind() {
			
			// リストロジックが別のブロックの項目を引数にとる場合、ここに実装する
			super.putListLogicCheckBind();

			// 返品元場所
			ListLogicBind loc1Bind = getListLogicBind(up1(), Schd_DtlR.$purc_ret_loc_cd);
			loc1Bind.putBind(MAUAC_List.LocCols.$i_dt, up0(), Schd_HdrR.$reg_dt);

			ListLogicBind loc2Bind = getListLogicBind(up2(), Schd_IoR.$purc_ret_loc_cd);
			loc2Bind.putBind(MAUAC_List.LocCols.$i_dt, up0(), Schd_HdrR.$reg_dt);
			
			// 債務部門
			ListLogicBind apDptBind = getListLogicBind(up1(), Schd_DtlR.$ap_dpt_cd);
			apDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0(), Schd_HdrR.$reg_dt);
			
			// 負担部門
			ListLogicBind bdDptBind = getListLogicBind(up1(), Schd_DtlR.$bd_dpt_cd);
			bdDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0(), Schd_HdrR.$reg_dt);

			// メーカー
			ListLogicBind itmDtlMakerBind = getListLogicBind(up1(), Schd_DtlR.$maker_cd);
			itmDtlMakerBind.putBind(MSUAC_List.ItmDtlMakerCols.$i_master_dt, up0(), Schd_HdrR.$reg_dt);
			itmDtlMakerBind.putBind(MSUAC_List.ItmDtlMakerCols.$i_sppl_cd, up0(), Schd_HdrR.$sppl_cd);

		}
		
		protected void callChkService() {

			Schd_IoL<Schd_IoR> iol = getProvTgt(null, null, up1(), up2());
			
			//キー作成
			MCJoinKey<MCList<Schd_DtlR>> i2d = 
					up2().join(Schd_IoR.$dtl_peg_no, up1(), Schd_DtlR.$peg_no);
			
			callProvSchdChk(up0(), i2d, iol, this);

		}

		protected void setDown() {
			
			// チェックの結果や補完の結果は全て上り電文に入っているので、そのまま下り電文に設定しなおす
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}
	}
	/**
	 * Schd_Chk02オペレーション.<p>
	 *
	 */
	public class Schd_Chk02 extends MSBDL_PurcRetRegService_MC_A.Schd_Chk02 {

		public MCJoinKey<MCList<Schd_IoR>> _ai2bi = null;
		public MCJoinKey<MCList<Schd_DtlR>> _ad2bd = null;
		protected MCJoinKey<MCList<Schd_IoR>> _d2i = null;

		protected Schd_DtlL<Schd_DtlR> _prSchdDL = createSchd_DtlL();
		protected Schd_IoL<Schd_IoR> _prSchdIOL = createSchd_IoL();
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();
			
			// 単票のチェックロジックでは、doItは必ず以下のような実装になります
			// ・自身のチェックでエラーがなければ他のサービスのチェックロジックを呼び出す
			// ・チェックが終わったら下り電文を設定する
			// 単票画面の場合、外部からデータを取り込む機能がないため、キー項目の整合性などはチェックしません

			if (!hasErr()) {
				callChkService();
			}

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			
			// 単票のチェックロジックでは、doServerCheckBaseは必ず以下のような実装になります
			// ・lockAndCheckBaseで更新カウンタチェック対象、補完に必要なトランザクションデータを検索する
			// ・エラーがなければcompBaseでトランザクションデータから補完する
			MCMessageList msgL = super.doServerCheckBase();
			createSundryItmCache(up1());
			createMfgInstCache(up1());
			msgL.addAll(lockAndCheckBase());
			msgL.addAll(chkOutsrcUpri(up0(), up1()));
			if (!msgL.isEmpty()) {
				return msgL;
			}

			compBase();
			MCJoinKey<MCList<Schd_IoR>> _d2i = null;
			_d2i = up1().join(Schd_DtlR.$peg_no, up2(), Schd_IoR.$dtl_peg_no);

			for (Schd_DtlR r : up1()) {
				MCList<Schd_IoR> iol = r.getJoined(_d2i);
				if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
					iol.setString(IoR.$lot_no, MAC_STR.NULL_VAL.value());
				}
				if (MAC_LOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
					iol.setString(IoR.$sublot_no, MAC_STR.NULL_VAL.value());
				}
			}

			return msgL;
		}

		@Override
		protected <E extends MCConstRow> MCMessageList doSvrChkListLogicMain(
				MCNumber paramIndex, MCList<E> chkTarL, String chkTarCol,
				String listLogicId, String listIn, String listInBase, String listOut,
				String listOutBase) {
			if (isSame(chkTarCol, Schd_DtlR.$mfg_inst_no)) {
				chkTarL.removeAll(chkTarL.subList(r -> r.getBooleanNE(Schd_DtlR.$abort_flg)));
				if (chkTarL.isEmpty()) {
					return new MCMessageList();
				}
			}
			return super.doSvrChkListLogicMain(paramIndex, chkTarL, chkTarCol,
					listLogicId, listIn, listInBase, listOut, listOutBase);
		}

		protected MCMessageList lockAndCheckBase() {
			
			// 更新カウンタチェック、更新前データのDACチェック、トランザクションデータの検索を実装します
			// 取得したトランザクションデータはインスタンス変数に格納します（他の処理から参照できるように）
			// 単票なのでデータ量の制限があまりないため、select句は絞りません
			MCMessageList msgL = new MCMessageList();
			MST_PURC_RET_SCHD_R prSchdR = MST_PURC_RET_SCHD_R.create("T");
			dbSelectKeyForUpdateNoWait("MSBDL5170_MST_PURC_RET_SCHD_S01", prSchdR,
					MCQueryApiBuilder.create(prSchdR), up0());
			msgL.addAll(checkUpdCntrNE(up0(), Schd_HdrR.$pr_schd_upd_cntr, prSchdR));

			if (!msgL.isEmpty()) {
				return msgL;
			}

			//データ更新前のDACチェック
			prSchdR.setAttributes(up0());
			msgL.addAll(checkWritableDptCdDac(prSchdR, Schd_HdrR.$purc_dpt_cd));
			if (!msgL.isEmpty()) {
				return msgL;
			}
						
			selectSchdD(_prSchdDL, up0());
			seletSchdIo(_prSchdIOL, up0());
			return msgL;
		}

		protected void compBase() {
			
			// トランザクションデータからの補完処理はここに実装する
			// それ以外の補完処理はリストロジックチェックで補完された情報などが前提となる場合があり、ここには実装しない

			
			_d2i = up1().join(Schd_DtlR.$peg_no, up2(), Schd_IoR.$dtl_peg_no);
			_ad2bd = up1().join(Schd_DtlR.$purc_ret_schd_d_no, _prSchdDL, Schd_DtlR.$purc_ret_schd_d_no);
			_ai2bi = up2().join(Schd_IoR.$purc_ret_schd_io_no, _prSchdIOL, Schd_IoR.$purc_ret_schd_io_no);

			//打切行の補完
			compAbort();
			
			// 各負担項目ＮＯの存在チェック用のトランザクションデータを取得する
			getDataForExistChk(up1());
			
		}
		
		/**
		 * 打切データの上り電文項目の補完
		 */
		protected void compAbort() {
			Schd_DtlL<Schd_DtlR> up1 = up1();

			up1.forEach(r -> {
				Schd_DtlR br = r.getJoinedRow(_ad2bd);
				if (r.abort_flg() || (br != null && br.abort_flg())) {
					getAbortCompCols1().forEach(col -> r.setValue(col, br.getValue(col)));
					
					r.getJoined(_d2i).forEach(ir -> {
						Schd_IoR bir = ir.getJoinedRow(_ai2bi);
						if (bir != null) {
							getAbortCompCols2().forEach(col -> ir.setValue(col, bir.getValue(col)));
						}
					});
				}
				
			});
			
		}
		protected List<String> _abortCompCols1 = null;
		/**
		 * 打切時にトランザクションから取得する明細項目のリスト
		 */
		protected List<String> getAbortCompCols1() {
			if (_abortCompCols1 == null) {
				_abortCompCols1 =  Arrays.asList(PDef.MS_MSBDL5170_Schd_Upd01_UP_BLOCK1().transItems())
						.stream().filter(i-> !i.isIgnore() && !i.isInnerRow()
								&& !isSame(i.id, Schd_DtlR.$abort_flg)
								&& !isSame(i.id, Schd_DtlR.$peg_no)
								)
						.map(i-> i.id).collect(Collectors.toList());
			}
			return _abortCompCols1;
		}
		protected List<String> _abortCompCols2 = null;
		/**
		 * 打切時にトランザクションから取得する詳細項目のリスト
		 */
		protected List<String> getAbortCompCols2() {
			if (_abortCompCols2 == null) {
				_abortCompCols2 =  Arrays.asList(PDef.MS_MSBDL5170_Schd_Upd01_UP_BLOCK2().transItems())
						.stream().filter(i-> !i.isIgnore() && !i.isInnerRow()
								&& !isSame(i.id, Schd_IoR.$peg_no)
								&& !isSame(i.id, Schd_IoR.$dtl_peg_no)
								)
						.map(i-> i.id).collect(Collectors.toList());
			}
			return _abortCompCols2;
		}
		@Override
		protected MCMessageList doServerCheckSub() {
			
			// 単票のチェックロジックでは、doServerCheckSubは必ず以下のような実装になります
			// ・checkSubで条件付チェック
			// ・エラーがなければ（doServerCheckSub以前のチェック結果含む）compSubで補完する
			MCMessageList msgL = super.doServerCheckSub();
			
			if (!msgL.isEmpty() || hasErrFlgOn(up0())) {
				return msgL;
			}
			
			msgL.addAll(checkAtLeastOneDtl(up0(), up1()));
			msgL.addAll(MSBDL_PurcUtil.checkAtLeastOneIo(up1(), up2()));

			setParentErrFlg(up0(), up1());
			
			msgL.addAll(existItmDtlCheck(up0(), 
					getChkList(up1(),MCRow.CREATE, MCRow.MODIFY, MCRow.NONE), 
					_d2i));

			msgL.addAll(checkSub(up0(), 
					getChkList(up1(),MCRow.CREATE, MCRow.MODIFY, MCRow.NONE), 
					up2(), _d2i));

			
			msgL.addAll(checkPurcRetSchdSyncCols(getChkList(up1(),MCRow.CREATE, MCRow.MODIFY, MCRow.NONE), 
					_d2i));
			
			msgL.addAll(checkSubForUpd(up0(), 
					getChkList(up1(),MCRow.CREATE, MCRow.MODIFY, MCRow.NONE, MCRow.DELETE), 
					 _ad2bd, _d2i));

			msgL.addAll(existBdCheck(up1()));

			if (!msgL.isEmpty() || hasErrFlgOn(up0(), up1())) {
				return msgL;
			}

			compSub();

			msgL.addAll(chkDtlAndIo(getChkList(up1(),MCRow.CREATE, MCRow.MODIFY, MCRow.NONE),
					_d2i));
			return msgL;
		}

				
		protected void compSub() {
			
			// リストロジックチェックで補完しきれない項目を補完する
			// 明細と受払のpeg_noは画面側で設定されていることを想定

			compSubImpl(up0(), up1(), up2());
			if (!up0().sppl_iv_flg()) {
				up0().rcpt_iv_no(null);
				up0().ref_rcpt_iv_no(null);
			}
		}

		@Override
		protected void putListLogicCheckBind() {
			
			// リストロジックが別のブロックの項目を引数にとる場合、ここに実装する
			super.putListLogicCheckBind();

			// 返品元場所
			ListLogicBind loc1Bind = getListLogicBind(up1(), Schd_DtlR.$purc_ret_loc_cd);
			loc1Bind.putBind(MAUAC_List.LocCols.$i_dt, up0(), Schd_HdrR.$reg_dt);

			ListLogicBind loc2Bind = getListLogicBind(up2(), Schd_IoR.$purc_ret_loc_cd);
			loc2Bind.putBind(MAUAC_List.LocCols.$i_dt, up0(), Schd_HdrR.$reg_dt);
			
			// 債務部門
			ListLogicBind apDptBind = getListLogicBind(up1(), Schd_DtlR.$ap_dpt_cd);
			apDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0(), Schd_HdrR.$reg_dt);
			
			// 負担部門
			ListLogicBind bdDptBind = getListLogicBind(up1(), Schd_DtlR.$bd_dpt_cd);
			bdDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0(), Schd_HdrR.$reg_dt);

			// メーカー
			ListLogicBind itmDtlMakerBind = getListLogicBind(up1(), Schd_DtlR.$maker_cd);
			itmDtlMakerBind.putBind(MSUAC_List.ItmDtlMakerCols.$i_master_dt, up0(), Schd_HdrR.$reg_dt);
			itmDtlMakerBind.putBind(MSUAC_List.ItmDtlMakerCols.$i_sppl_cd, up0(), Schd_HdrR.$sppl_cd);

		}
		
		protected void callChkService() {

			Schd_IoL<Schd_IoR> iol = getProvTgt(_ad2bd, _ai2bi, up1(), up2());
			
			//キー作成
			MCJoinKey<MCList<Schd_DtlR>> i2d = 
					up2().join(Schd_IoR.$dtl_peg_no, up1(), Schd_DtlR.$peg_no);
			
			//支給予定サービス実行
			callProvSchdChk(up0(), i2d, iol, this);

		}

		protected void setDown() {
			
			// チェックの結果や補完の結果は全て上り電文に入っているので、そのまま下り電文に設定しなおす
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}
	}
	
	
	/**
	 * Schd_Chk03オペレーション.<p>
	 *
	 */
	public class Schd_Chk03 extends MSBDL_PurcRetRegService_MC_A.Schd_Chk03 {

		protected MCJoinKey<MCList<Schd_IoR>> _ai2bi = null;
		protected MCJoinKey<MCList<Schd_DtlR>> _ad2bd = null;
		protected MCJoinKey<MCList<Schd_IoR>> _d2i;
		
		protected Schd_DtlL<Schd_DtlR> _prSchdDL = createSchd_DtlL();
		protected Schd_IoL<Schd_IoR> _prSchdIOL = createSchd_IoL();
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();
			
			// 単票のチェックロジックでは、doItは必ず以下のような実装になります
			// ・自身のチェックでエラーがなければ他のサービスのチェックロジックを呼び出す
			// ・チェックが終わったら下り電文を設定する
			// 単票画面の場合、外部からデータを取り込む機能がないため、キー項目の整合性などはチェックしません

			if (!hasErr()) {
				callChkService();
			}

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			
			// 単票のチェックロジックでは、doServerCheckBaseは必ず以下のような実装になります
			// ・lockAndCheckBaseで更新カウンタチェック対象、補完に必要なトランザクションデータを検索する
			// ・エラーがなければcompBaseでトランザクションデータから補完する
			MCMessageList msgL = super.doServerCheckBase();

			msgL.addAll(lockAndCheckBase());

			if (!msgL.isEmpty()) {
				return msgL;
			}

			compBase();

			return msgL;
		}

		protected MCMessageList lockAndCheckBase() {
			
			// 更新カウンタチェック、更新前データのDACチェック、トランザクションデータの検索を実装します
			// 取得したトランザクションデータはインスタンス変数に格納します（他の処理から参照できるように）
			// 単票なのでデータ量の制限があまりないため、select句は絞りません
			MCMessageList msgL = new MCMessageList();
			MST_PURC_RET_SCHD_R prSchdR = MST_PURC_RET_SCHD_R.create("T");
			dbSelectKeyForUpdateNoWait("MSBDL5170_MST_PURC_RET_SCHD_S02", prSchdR,
					MCQueryApiBuilder.create(prSchdR), up0());
			msgL.addAll(checkUpdCntrNE(up0(), Schd_HdrR.$pr_schd_upd_cntr, prSchdR));

			if (!msgL.isEmpty()) {
				return msgL;
			}

			//データ更新前のDACチェック
			prSchdR.setAttributes(up0());
			msgL.addAll(checkWritableDptCdDac(prSchdR, Schd_HdrR.$purc_dpt_cd));

			if (!msgL.isEmpty()) {
				return msgL;
			}

			selectSchdD(_prSchdDL, up0());
			seletSchdIo(_prSchdIOL, up0());
			_prSchdDL.setStatus(MCRow.DELETE);
			_prSchdIOL.setStatus(MCRow.DELETE);
			
			up0().peg_no(MCNumber.ZERO);
			_prSchdDL.forEach(r -> r.hdr_peg_no(up0().peg_no()));
			setPegNo(_prSchdDL);
			setPegNo(_prSchdIOL);
			MCIndexKey k = _prSchdDL.createIndex(Schd_DtlR.$purc_ret_schd_d_no);
			_prSchdIOL.forEach(r -> {
				Schd_DtlR dr = _prSchdDL.getFirst(k, r.purc_ret_schd_d_no());
				r.dtl_peg_no(dr.peg_no());
			});
			
			return msgL;
		}

		protected void compBase() {
			
			// トランザクションデータからの補完処理はここに実装する
			// それ以外の補完処理はリストロジックチェックで補完された情報などが前提となる場合があり、ここには実装しない

			_d2i = _prSchdDL.join(Schd_DtlR.$purc_ret_schd_d_no, _prSchdIOL, Schd_IoR.$purc_ret_schd_d_no);
			//削除なので変更前も変更後も同じ
			_ad2bd = _prSchdDL.join(Schd_DtlR.$purc_ret_schd_d_no, _prSchdDL, Schd_DtlR.$purc_ret_schd_d_no);
			_ai2bi = _prSchdIOL.join(Schd_IoR.$purc_ret_schd_io_no, _prSchdIOL, Schd_IoR.$purc_ret_schd_io_no);
	
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			
			// 単票のチェックロジックでは、doServerCheckSubは必ず以下のような実装になります
			// ・checkSubで条件付チェック
			// ・エラーがなければ（doServerCheckSub以前のチェック結果含む）compSubで補完する
			MCMessageList msgL = super.doServerCheckSub();

			if (!msgL.isEmpty() || hasErrFlgOn(up0())) {
				return msgL;
			}

			MST_PURC_RET_ACT_R ar = MST_PURC_RET_ACT_R.create("T");
			MCQueryApiBuilder ar_bldr = MCQueryApiBuilder.create(ar);
			ar_bldr.setSelect(ar.purc_ret_act_no);
			ar_bldr.setWhere(ar.purc_ret_schd_no.eq(bind("1"))
					.and(ar.can_flg.eq(value(false))), up0().purc_ret_schd_no());
			if  (0 < dbSelect("MSBDL5170_MST_PURC_RET_ACT_S02", ar, ar_bldr)) {
				msgL.add(new MCMessage(up0(), Schd_HdrR.$purc_ret_schd_no, MSBDL0017, 
						up0().purc_ret_schd_no(), ar.purc_ret_act_no()));
			}

			if (!msgL.isEmpty() || hasErrFlgOn(up0())) {
				return msgL;
			}

			compSub();

			return msgL;
		}

		
				
		protected void compSub() {
			
			// リストロジックチェックで補完しきれない項目を補完する
			
			up0().peg_no(MCNumber.ONE);
			MCNumber dpeg = MCNumber.ONE;
			MCNumber ipeg = MCNumber.ONE;
			for(Schd_DtlR dr : _prSchdDL) {
				dr.hdr_peg_no(up0().peg_no());
				dr.peg_no(dpeg);
				dr.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				dpeg = dpeg.add(MCNumber.ONE);
				for(Schd_IoR ir : dr.getJoined(_d2i)) {
					ir.dtl_peg_no(dr.peg_no());
					ir.peg_no(dpeg);
					ipeg = dpeg.add(MCNumber.ONE);
					ir.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					ipeg = ipeg.add(MCNumber.ONE);
				}
			}
		}

		@Override
		protected void putListLogicCheckBind() {
			
			// リストロジックが別のブロックの項目を引数にとる場合、ここに実装する
			super.putListLogicCheckBind();

		}
		
		protected void callChkService() {

			Schd_IoL<Schd_IoR> iol = getProvTgt(_ad2bd, _ai2bi, _prSchdDL, _prSchdIOL);
			
			//キー作成
			MCJoinKey<MCList<Schd_DtlR>> i2d = 
					_prSchdIOL.join(Schd_IoR.$dtl_peg_no, _prSchdDL, Schd_DtlR.$peg_no);

			//支給予定サービス実行
			callProvSchdChk(up0(), i2d, iol, this);
		}

		protected void setDown() {
			
			// チェックの結果や補完の結果は全て上り電文に入っているので、そのまま下り電文に設定しなおす
			MCRow.copyall(down0(), up0());
		}
	}
	

	
	
	/**
	 * Schd_Chk04オペレーション.<p>
	 *
	 */
	public class Schd_Chk04 extends MSBDL_PurcRetRegService_MC_A.Schd_Chk04 {

		protected MCJoinKey<MCList<Schd_IoR>> _ai2bi = null;
		protected MCJoinKey<MCList<Schd_DtlR>> _ad2bd = null;
		protected MCJoinKey<MCList<Schd_IoR>> _d2i = null;
		protected Schd_DtlL<Schd_DtlR> _prSchdDL = Schd_DtlL.createMS_MSBDL5170_Schd_Dtl(Schd_DtlR.class);
		protected Schd_IoL<Schd_IoR> _prSchdIOL = Schd_IoL.createMS_MSBDL5170_Schd_Io(Schd_IoR.class);
		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();
			
			// 単票のチェックロジックでは、doItは必ず以下のような実装になります
			// ・自身のチェックでエラーがなければ他のサービスのチェックロジックを呼び出す
			// ・チェックが終わったら下り電文を設定する
			// 単票画面の場合、外部からデータを取り込む機能がないため、キー項目の整合性などはチェックしません

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			
			// 単票のチェックロジックでは、doServerCheckBaseは必ず以下のような実装になります
			// ・lockAndCheckBaseで更新カウンタチェック対象、補完に必要なトランザクションデータを検索する
			// ・エラーがなければcompBaseでトランザクションデータから補完する
			MCMessageList msgL = super.doServerCheckBase();

			createMfgInstCache(up1());
			msgL.addAll(lockAndCheckBase());

			if (!msgL.isEmpty()) {
				return msgL;
			}

			compBase();

			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckExistsKey(
				MCList<? extends MCConstRow> up) {
			//返品予定の登録はしないため、新規ステータスの場合の存在チェックは無効にする
			return new MCMessageList();
		}

		@Override
		protected IfValidater getPositiveValidater(String col) {
			//返品予定の登録はしないため、取引単位数量のチェックは無効にする
			return new FXUCL_PositiveValidater(r -> false);
		}
		
		protected MCMessageList lockAndCheckBase() {
			
			// 更新カウンタチェック、更新前データのDACチェック、トランザクションデータの検索を実装します
			// 取得したトランザクションデータはインスタンス変数に格納します（他の処理から参照できるように）
			// 単票なのでデータ量の制限があまりないため、select句は絞りません
			MCMessageList msgL = new MCMessageList();
			MST_PURC_RET_SCHD_R prSchdR = MST_PURC_RET_SCHD_R.create("T");
			dbSelectKeyForUpdateNoWait("MSBDL5170_MST_PURC_RET_SCHD_S03", prSchdR,
					MCQueryApiBuilder.create(prSchdR), up0());
			msgL.addAll(checkUpdCntrNE(up0(), Schd_HdrR.$pr_schd_upd_cntr, prSchdR));

			if (!msgL.isEmpty()) {
				return msgL;
			}

			//データ更新前のDACチェック
			prSchdR.setAttributes(up0());
			msgL.addAll(checkWritableDptCdDac(prSchdR, Schd_HdrR.$purc_dpt_cd));
			if (!msgL.isEmpty()) {
				return msgL;
			}
			
			selectSchdD(_prSchdDL, up0());
			seletSchdIo(_prSchdIOL, up0());
			return msgL;
		}

		protected void compBase() {
			
			// トランザクションデータからの補完処理はここに実装する
			// それ以外の補完処理はリストロジックチェックで補完された情報などが前提となる場合があり、ここには実装しない

			
			_d2i = up1().join(Schd_DtlR.$peg_no, up2(), Schd_IoR.$dtl_peg_no);
			_ad2bd = up1().join(Schd_DtlR.$purc_ret_schd_d_no, _prSchdDL, Schd_DtlR.$purc_ret_schd_d_no);
			_ai2bi = up2().join(Schd_IoR.$purc_ret_schd_io_no, _prSchdIOL, Schd_IoR.$purc_ret_schd_io_no);
			}

		@Override
		protected MCMessageList doServerCheckSub() {
			
			// 単票のチェックロジックでは、doServerCheckSubは必ず以下のような実装になります
			// ・checkSubで条件付チェック
			// ・エラーがなければ（doServerCheckSub以前のチェック結果含む）compSubで補完する
			MCMessageList msgL = super.doServerCheckSub();

			if (!msgL.isEmpty() || hasErrFlgOn(up0())) {
				return msgL;
			}
			
			msgL.addAll(existItmDtlCheck(up0(), 
					getChkList(up1(),MCRow.CREATE, MCRow.MODIFY, MCRow.NONE), 
					_d2i));
			
			msgL.addAll(checkSub(up0(), 
					getChkList(up1(),MCRow.CREATE, MCRow.MODIFY, MCRow.NONE), 
					up2(), _d2i));

			msgL.addAll(checkPurcRetSchdSyncCols(getChkList(up1(),MCRow.CREATE, MCRow.MODIFY, MCRow.NONE), 
					_d2i));
			
			msgL.addAll(checkSubForUpd(up0(), 
					getChkList(up1(),MCRow.CREATE, MCRow.MODIFY, MCRow.NONE, MCRow.DELETE), 
					_ad2bd, _d2i));

			if (!msgL.isEmpty() || hasErrFlgOn(up0(), up1())) {
				return msgL;
			}

			compSub();

			
			return msgL;
		}
				
		protected void compSub() {
			
			// リストロジックチェックで補完しきれない項目を補完する
			// 明細と受払のpeg_noは画面側で設定されていることを想定

			compSubImpl(up0(), up1(), up2());
		}

		@Override
		protected void putListLogicCheckBind() {
			
			// リストロジックが別のブロックの項目を引数にとる場合、ここに実装する
			super.putListLogicCheckBind();

			// 返品元場所
			ListLogicBind loc1Bind = getListLogicBind(up1(), Schd_DtlR.$purc_ret_loc_cd);
			loc1Bind.putBind(MAUAC_List.LocCols.$i_dt, up0(), Schd_HdrR.$reg_dt);

			ListLogicBind loc2Bind = getListLogicBind(up2(), Schd_IoR.$purc_ret_loc_cd);
			loc2Bind.putBind(MAUAC_List.LocCols.$i_dt, up0(), Schd_HdrR.$reg_dt);
			
			// 債務部門
			ListLogicBind apDptBind = getListLogicBind(up1(), Schd_DtlR.$ap_dpt_cd);
			apDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0(), Schd_HdrR.$reg_dt);
			
			// 負担部門
			ListLogicBind bdDptBind = getListLogicBind(up1(), Schd_DtlR.$bd_dpt_cd);
			bdDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0(), Schd_HdrR.$reg_dt);

			// メーカー
			ListLogicBind itmDtlMakerBind = getListLogicBind(up1(), Schd_DtlR.$maker_cd);
			itmDtlMakerBind.putBind(MSUAC_List.ItmDtlMakerCols.$i_master_dt, up0(), Schd_HdrR.$reg_dt);
			itmDtlMakerBind.putBind(MSUAC_List.ItmDtlMakerCols.$i_sppl_cd, up0(), Schd_HdrR.$sppl_cd);

		}

		protected void setDown() {
			
			// チェックの結果や補完の結果は全て上り電文に入っているので、そのまま下り電文に設定しなおす
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}
	}
	
	/**
	 * 仕入返品予定ＮＯを設定します。
	 * @param up0 ヘッダ
	 */
	protected void setPurcRetSchdNo(Schd_HdrR hr) {
		ElmArgsR arg = ElmArgsR.create();
		arg.peg_no(hr.peg_no());
		arg.dpt_cd(hr.purc_dpt_cd());
		arg.bp_cd(hr.sppl_cd());
		arg.wg_cd(hr.wg_cd());
		arg.trd_cd(hr.trd_cd());
		arg.dt(hr.reg_dt());
		arg.co_cd(getCo().co_cd());
		
		hr.purc_ret_schd_no(
				getNum(MAC_NUM_BIZ_TYP.PURCRETSCHD, arg));
	}
	/**
	 * 仕入返品予定ＮＯ、仕入返品予定明細ＮＯを設定します。
	 */
	protected void setPurcRetSchdDNo(Schd_DtlL<Schd_DtlR> up1, Schd_HdrR hr) {
		doSeqCache(MSC_NUM_SYS_TYP.PURCRETSCHDD, up1.subList(r -> r.isStatusCreate()).size());
		up1.forEach(r -> {
			r.purc_ret_schd_no(hr.purc_ret_schd_no());
			if (r.isStatusCreate()) {
				r.purc_ret_schd_d_no(getStrSeq(MSC_NUM_SYS_TYP.PURCRETSCHDD));
			}
		});
	}
	
	protected void setIoSchdPrNo(Schd_IoL<Schd_IoR> up2) {
		up2 = up2.subList(r -> r.isStatusCreate());
		doSeqCache(MSC_NUM_SYS_TYP.IOSCHDPR, up2.size());
		up2.forEach(r -> {
			r.io_schd_pr_no(getStrSeq(MSC_NUM_SYS_TYP.IOSCHDPR));
		});
	}
	/**
	 * 仕入返品予定明細ＮＯ、仕入返品予定受払ＮＯを設定します。
	 */
	protected void setPurcRetSchdIoNo(Schd_IoL<Schd_IoR> up2, MCJoinKey<MCList<Schd_DtlR>> i2d) {
		doSeqCache(MSC_NUM_SYS_TYP.PURCRETSCHDIO, up2.subList(r -> r.isStatusCreate()).size());
		up2.forEach(r -> {
			r.purc_ret_schd_d_no(r.getJoinedRow(i2d).purc_ret_schd_d_no());
			if (r.isStatusCreate()) {
				r.purc_ret_schd_io_no(getStrSeq(MSC_NUM_SYS_TYP.PURCRETSCHDIO));
			}
		});
	}

	protected MCMessageList checkSub(Schd_HdrR up0, MCList<Schd_DtlR> up1_CU, MCList<Schd_IoR> up2, MCJoinKey<MCList<Schd_IoR>> d2i) {
		MCMessageList msgL = new MCMessageList();
		Schd_HdrR hr = up0;
		MCList<Schd_DtlR> dl = up1_CU;

		if (hr.err_flg() || up1_CU.size() == 0) {
			return msgL;
		}
		
		//自社在庫のリスト（支給戻しの結果自社在庫になるものも含む）
		MCList<Schd_DtlR> costkDtl = dl.createInstance();
		MCList<Schd_IoR> costkIo = up2.subList(dr -> 
			MSC_STK_ID_TYP.isCOSTK(dr.stk_id_typ()) || MSC_STK_ID_TYP.isONR_PROV(dr.stk_id_typ()));
		MCJoinKey<MCList<Schd_DtlR>> i2d = costkIo.join(IoR.$dtl_peg_no, dl, DtlR.$peg_no);
		Set<Schd_DtlR> tmp = new HashSet<>();
		costkIo.forEach(r -> {
			Schd_DtlR dr = r.getJoinedRow(i2d);
			if (dr != null && !dr.err_flg()) {
				tmp.add(dr);
			}
		});
		costkDtl.setAll(tmp);
		
		if (costkIo.size() > 0) {
			msgL.addAll(check(hr, Schd_HdrR.$schd_dt, new FXUCL_RequiredValidater()));
			msgL.addAll(check(hr, Schd_HdrR.$trd_cur_cd, new FXUCL_RequiredValidater()));
			
			if (hr.xrate_inpt_flg() || !isSame(hr.trd_cur_cd(), hr.base_cur_cd())) {
				msgL.addAll(check(hr, Schd_HdrR.$xrate, new FXUCL_RequiredValidater()));
			}

			if (hr.ptax_xrate_inpt_flg() || !isSame(hr.ptax_cur_cd(), hr.base_cur_cd())) {
				msgL.addAll(check(hr, Schd_HdrR.$ptax_xrate, new FXUCL_RequiredValidater()));
			}
		}
		
		if (dl.size() > 0) {
			msgL.addAll(check(dl, Schd_DtlR.$dscnt_rsn_cd, 
					new FXUCL_RequiredValidater(r -> !isNull(((Schd_DtlR)r).trd_cur_dscnt_amt()))));
		}
		if (costkDtl.size() > 0) {
			msgL.addAll(check(costkDtl, Schd_DtlR.$trd_cur_upri, new FXUCL_RequiredValidater()));
			msgL.addAll(check(costkDtl, Schd_DtlR.$tax_cd, new FXUCL_RequiredValidater()));
			if(!isNull(getCo().ptax_cur_cd())) {
				msgL.addAll(check(costkDtl, Schd_DtlR.$ptax_cur_tax_amt, new FXUCL_RequiredValidater()));
			}
			msgL.addAll(check(costkDtl, Schd_DtlR.$ap_dpt_cd, new FXUCL_RequiredValidater()));
			msgL.addAll(check(costkDtl, Schd_DtlR.$pay_crryovr_times, new FXUCL_RequiredValidater()));
		
			if (MAC_TRD_PTN_TYP.isPURC_RTN_XPNS(hr.trd_ptn_typ())) {
				msgL.addAll(check(costkDtl, Schd_DtlR.$bd_dpt_cd, new FXUCL_RequiredValidater(r -> {
					Schd_DtlR dr = (Schd_DtlR)r;
					return MAC_ASSET_MNG_TYP.isNOT_MNG(dr.asset_mng_typ()) || dr.xpns_purc_flg();
				})));
			}
		}
		
		dl.forEach(dr -> {

			if (dr.sundry_itm_flg()) {
				msgL.addAll(check(dr, Schd_DtlR.$itm_nm, new FXUCL_RequiredValidater()));
				if (hr.sppl_iv_flg()) {
					msgL.addAll(check(dr, Schd_DtlR.$iv_itm_nm, new FXUCL_RequiredValidater()));
				}
			}
			
			// 取引が経費購買の場合、資産管理する品目は不可
			if (MAC_TRD_PTN_TYP.isPURC_RTN_XPNS(hr.trd_ptn_typ()) && MAC_ASSET_MNG_TYP.isMNG(dr.asset_mng_typ())) {
				msgL.add(new MCMessage(dr, null, MSBDL0194, toDispItm(dr.itm_cd(), dr.itm_sub1(), dr.itm_sub2(), dr.itm_sub3()),
						toDispGUIIndex(dr)));
			}
			// 資産管理する品目は経費購買の理由を設定できない
			if (MAC_ASSET_MNG_TYP.isMNG(dr.asset_mng_typ()) && dr.xpns_purc_flg()) {
				msgL.add(new MCMessage(dr, null, MSBDL0150, toDispItm(dr.itm_cd(), dr.itm_sub1(), dr.itm_sub2(), dr.itm_sub3()),
						dr.ret_rsn_cd(), toDispGUIIndex(dr)));
			}
			// 資産管理しない品目は経費購買の理由しか設定できない
			if (MAC_ASSET_MNG_TYP.isNOT_MNG(dr.asset_mng_typ()) && !dr.xpns_purc_flg()) {
				msgL.add(new MCMessage(dr, null, MSBDL0151, toDispItm(dr.itm_cd(), dr.itm_sub1(), dr.itm_sub2(), dr.itm_sub3()),
						dr.ret_rsn_cd(), toDispGUIIndex(dr)));
			}

			MCList<Schd_IoR> iol = dr.getJoined(d2i);
			if (iol != null) {
				iol = iol.subList(r -> !r.isStatusDelete());
				if (!MAC_LOT_MNG_TYP.isNOT_MNG(dr.lot_mng_typ())) {
					msgL.addAll(check(iol, Schd_IoR.$lot_no, new FXUCL_RequiredValidater()));
				}
				if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(dr.sublot_mng_typ())) {
					msgL.addAll(check(iol, Schd_IoR.$sublot_no, new FXUCL_RequiredValidater()));
				}
				if (dr.cont_fctr_flg()) {
					msgL.addAll(check(iol, Schd_IoR.$purc_cont_qty, new FXUCL_RequiredValidater()));
				}

			}
			
			msgL.addAll(checkExistMfgInst(hr, dr));
		});			
		
		//存在チェック
		MCList<MST_PO_R> pol = MCList.create(MST_PO_R.class);
		initPoCache(pol, dl);
		dl.forEach(dr -> {
			if (isNull(dr.po_no()) || dr.abort_flg()) {
				return;
			}
			if (getPoCache().get(dr.po_no()) == null) {
				msgL.add(new MCMessage(dr, Schd_DtlR.$po_no, MSBDL0084 , dr.po_no()));
			}
		});
		
		//定型エラーチェック（必須・存在チェック以外）
		msgL.addAll(checkWritableDptCdDac(hr, Schd_HdrR.$purc_dpt_cd));
		
		FXUCL_SmallLargeValidater gteZero = new FXUCL_SmallLargeValidater(
				null,
				MCNumber.ZERO, (MCNumber)null);

		if (costkDtl.size() > 0) {
			msgL.addAll(check(costkDtl, 
					new String[]{Schd_DtlR.$trd_cur_upri},
					gteZero));
	
			msgL.addAll(check(costkDtl, 
					new String[]{Schd_DtlR.$ptax_cur_tax_amt},
					gteZero));
			
			msgL.addAll(check(costkDtl, 
					new String[]{Schd_DtlR.$trd_cur_upri},
					new FXUCL_PositiveValidater(
							r -> MAC_PURC_ID_TYP.isONR_RCV(((Schd_DtlR)r).purc_id_typ()))));
			msgL.addAll(check(costkDtl, Schd_DtlR.$trd_cur_dscnt_amt, new FXUCL_PositiveValidater()));
		}
		msgL.addAll(checkDecPlace(dl, Schd_DtlR.$trd_unit_dec_place, Schd_DtlR.$trd_unit_qty));
		for(Schd_DtlR dr : dl) {
			msgL.addAll(checkDecPlace(dr.getJoined(d2i),
					Schd_IoR.$trd_unit_dec_place, Schd_IoR.$trd_unit_qty));
		}
		
		if (!hr.err_flg()) {
			//固有チェック
			for(Schd_DtlR dr : costkDtl) {
				//ヘッダの取引通貨が設定されていない場合
				if (isNull(hr.trd_cur_cd())) {
					hr.err_flg(true);
					MCMessagePool.add(new MCMessage(hr, 
							HdrR.$trd_cur_cd, MSBDL0007));
					break;
				}
				//単価0で値引額が登録されている場合
				MCMessageList ml = MSBDL_PurcUtil.checkDscntAmt(
						dr, Schd_DtlR.$trd_cur_upri, Schd_DtlR.$trd_cur_dscnt_amt);
				if (ml.size() > 0) {
					MCMessagePool.addAll(ml);
					dr.err_flg(true);
					hr.err_flg(true);
				}
			}
		}
		
		MCList<Schd_IoR> onrPrvs = up2.createInstance();
		up2.forEach(ir -> {
			
			if (MSC_STK_ID_TYP.isRTN_PRE_ACCPT(ir.stk_id_typ())
					|| MSC_STK_ID_TYP.isPURC_PRE_ACCPT(ir.stk_id_typ())
					|| MSC_STK_ID_TYP.isCSTSTK(ir.stk_id_typ())
					|| MSC_STK_ID_TYP.isSLF_SUPPRT(ir.stk_id_typ())) {
				MCMessagePool.add(new MCMessage(ir, IoR.$stk_id_typ, MSBDL0005, ir.stk_id_typ(), toDispGUIIndex(ir)));
			}
			
			//在庫識別区分に「有償支給」が設定されている行のリストを作成
			if (MSC_STK_ID_TYP.isONR_PROV(ir.stk_id_typ())) {
				onrPrvs.add(ir);
			}
		});
		chkSundry(up1_CU);
		//在庫識別区分に「有償支給」が指定されているが、返品元場所が外注場所でない場合
		if (onrPrvs.size() == 0) {
			return msgL;
		}
		
		onrPrvs.forEach(ir -> {
			if (isNull(ir.purc_ret_sppl_cd())) {
				msgL.add(new MCMessage(
					ir, IoR.$purc_ret_loc_cd, 
					MSBDL0006, ir.purc_ret_loc_cd(), toDispGUIIndex(ir)));
			}
		});
	
		return msgL;
	}
	
	/**
	 * チェック処理（製造指図関連）
	 */
	protected MCMessageList checkExistMfgInst(Schd_HdrR hdrR, Schd_DtlR dtlR) {
		MCMessageList msgL = new MCMessageList();
		if (!isNull(dtlR.mfg_inst_no())) {
			MST_MFG_INST_R mfgInstR = _cacheMfgInst.get(dtlR.mfg_inst_no());
			MST_ITM_MFG_INST_R itmMfgInstR = _cacheItmMftInst.get(mfgInstR.itm_mfg_inst_no());
			
			if (!(isSame(dtlR.itm_cd(), itmMfgInstR.itm_cd())
					&& isSame(dtlR.itm_sub1(), itmMfgInstR.itm_sub1())
					&& isSame(dtlR.itm_sub2(), itmMfgInstR.itm_sub2())
					&& isSame(dtlR.itm_sub3(), itmMfgInstR.itm_sub3())
					&& isSame(dtlR.sno1(), itmMfgInstR.sno1())
					&& isSame(dtlR.sno2(), itmMfgInstR.sno2())
					&& isSame(dtlR.sno3(), itmMfgInstR.sno3())
					&& isSame(dtlR.sno4(), itmMfgInstR.sno4())
				)) {
				// 品目、手配ＮＯ不一致
				msgL.add(new MCMessage(dtlR, null, MSBDL0106, toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
						toDispSno(dtlR.sno1(), dtlR.sno2(), dtlR.sno3(), dtlR.sno4()), dtlR.mfg_inst_no(), toDispGUIIndex(dtlR)));
			}
			if (!isSame(hdrR.sppl_cd(), itmMfgInstR.sppl_cd())) {
				// 発注先不一致
				msgL.add(new MCMessage(dtlR, null , MSBDL0107, hdrR.sppl_cd(), dtlR.mfg_inst_no(), toDispGUIIndex(dtlR)));
			}

		}
		return msgL;
	}
	
	protected String[] getPurcRetSchdSyncCheckTgtCols() {
		return new String[]{
				Schd_DtlR.$quality_typ,
				Schd_DtlR.$gd_cd,
				Schd_DtlR.$purc_ret_loc_cd,
				Schd_DtlR.$str_ln_cd,
				Schd_DtlR.$lot_no,
				Schd_DtlR.$sublot_no,
				Schd_DtlR.$stk_id_typ,
				Schd_DtlR.$stk_arrv_bp_cd};
	}

	protected String[] getPurcRetActSyncCheckTgtCols() {
		return new String[]{
				DtlR.$quality_typ,
				DtlR.$gd_cd,
				DtlR.$purc_ret_loc_cd,
				DtlR.$str_ln_cd,
				DtlR.$lot_no,
				DtlR.$sublot_no,
				DtlR.$stk_id_typ,
				DtlR.$stk_arrv_bp_cd};
	}
	protected void setStrLn(MCRow r, String purcRetLocCdCol, String strLnCdCol) {

		if (!isNull(r.getString(purcRetLocCdCol))) {
			if (isNull(r.getString(strLnCdCol))) {
				r.setValue(strLnCdCol, MAC_STR.NULL_VAL.value());
			}
		}
	}
	protected void setAmt(Schd_HdrR up0, Schd_DtlL<Schd_DtlR> dl, Schd_IoL<Schd_IoR> iol) {
		Schd_HdrR bindUp0 = Schd_HdrR.create();
		MCRow.copyall(bindUp0, up0);
		// 基準通貨情報
		bindUp0.base_cur_cd(getBaseCur().cur_cd());
		bindUp0.base_cur_upri_dec_place(getBaseCur().upri_dec_place());
		bindUp0.base_cur_amt_dec_place(getBaseCur().amt_dec_place());
		// 納税通貨情報
		bindUp0.ptax_cur_cd(getPtaxCur().cur_cd());
		bindUp0.ptax_cur_upri_dec_place(getPtaxCur().upri_dec_place());
		bindUp0.ptax_cur_amt_dec_place(getPtaxCur().amt_dec_place());
		// 為替レート端数処理区分
		bindUp0.xrate_rnd_typ(getCo().xrate_rnd_typ());
		// 源泉税額端数処理区分
		bindUp0.wtax_rnd_typ(getCo().wtax_rnd_typ());
		for (Schd_DtlR rowD : dl) {
			if (MAC_PURC_ID_TYP.isFFR_RCV(rowD.purc_id_typ())
					|| MAC_PURC_ID_TYP.isVMI(rowD.purc_id_typ())
					|| MSC_STK_ID_TYP.isACCPT_DFCT(rowD.stk_id_typ())
					) {
				continue;
			}
			
			complProcUpriAmt(rowD);
			
			if (up0.amt_calc_flg()) {
				// 金額・消費税額
				MCNumber ptamt = rowD.ptax_cur_tax_amt();
				MCNumber btamt = rowD.base_cur_tax_amt();
				MSBDL_PurcUtil.setAmtInfo(bindUp0, rowD);
				
				MCNumber trdCurIncTaxAmt = rowD.trd_cur_amt().add(rowD.trd_cur_tax_amt());
				MCNumber baseCurIncTaxAmt = rowD.base_cur_amt().add(rowD.base_cur_tax_amt());
				MCNumber ptaxCurIncTaxAmt = null;
				if (!isNull(getCo().ptax_cur_cd())) {
					ptaxCurIncTaxAmt = rowD.ptax_cur_amt().add(rowD.ptax_cur_tax_amt());	
				}
				
				if (isNull(getCo().ptax_cur_cd())) {
					if (isSame(up0.trd_cur_cd(), getCo().base_cur_cd())) {
						rowD.trd_cur_tax_amt(btamt);
					}
					else {
						rowD.trd_cur_tax_amt(btamt.divide(
								  up0.xrate()
								, up0.trd_cur_amt_dec_place().intValue()
								, MAC_RND_TYP.toMC(getCo().xrate_rnd_typ()))
								);
					}
				}
				else {
					rowD.ptax_cur_tax_amt(ptamt);
					if (isSame(up0.trd_cur_cd(), getCo().ptax_cur_cd())) {
						rowD.trd_cur_tax_amt(ptamt);
					}
					else {
						rowD.trd_cur_tax_amt(ptamt.divide(
								  up0.ptax_xrate()
								, up0.trd_cur_amt_dec_place().intValue()
								, MAC_RND_TYP.toMC(getCo().xrate_rnd_typ()))
								);
					}
					if (isSame(getCo().base_cur_cd(), getCo().ptax_cur_cd())) {
						rowD.base_cur_tax_amt(rowD.ptax_cur_tax_amt());
					}
					else {
						rowD.base_cur_tax_amt(convToBaseCur(rowD.trd_cur_tax_amt(), up0.xrate(), up0.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
					}
				}
				if (rowD.inc_tax_flg()) {
					// 取引通貨での金額
					rowD.trd_cur_amt(trdCurIncTaxAmt.subtract(rowD.trd_cur_tax_amt()));
					
					// 基準通貨での金額
					if (isSame(up0.trd_cur_cd(), getCo().base_cur_cd())) {
						rowD.base_cur_amt(rowD.trd_cur_amt());
					}
					else {
						rowD.base_cur_amt(baseCurIncTaxAmt.subtract(rowD.base_cur_tax_amt()));
						
					}
	
					// 納税通貨での金額
					if (!isNull(getCo().ptax_cur_cd())) {
						if (isSame(up0.trd_cur_cd(), getCo().ptax_cur_cd())) {
							rowD.ptax_cur_amt(rowD.trd_cur_amt());
						}
						else {
							rowD.ptax_cur_amt(ptaxCurIncTaxAmt.subtract(rowD.ptax_cur_tax_amt()));
							
						}	
					}
					// 外注の場合、加工金額・有償支給金額を算出する
					if(!MAC_PURC_TYP.isPURC_ITM(rowD.purc_typ())) {
						if(up0.repurc_obli_flg()) {
							MCNumber procAmt = MAUCL_AmtUtil.getAmt(rowD.trd_cur_proc_upri(),
									rowD.trd_unit_qty(),
									up0.trd_cur_amt_dec_place(),
									up0.purc_amt_rnd_typ(),
									rowD.trd_cur_dscnt_amt());
							MCNumber incTaxAmt = !isNull(rowD.trd_cur_amt()) ? rowD.trd_cur_amt().add(nvl(rowD.trd_cur_tax_amt(), MCNumber.ZERO)) : null;
							rowD.trd_cur_proc_amt(!isNull(procAmt) ? procAmt.subtract(nvl(rowD.trd_cur_tax_amt(), MCNumber.ZERO)) : null);
							rowD.trd_cur_onr_prov_amt(!isNull(incTaxAmt) ? incTaxAmt.subtract(nvl(procAmt, MCNumber.ZERO)) : null);
						}
						else {
							MCList<MCRow> retL = MSUCL_ConvQtyAmtUtil.calcPropOutSrcUpri(rowD.trd_cur_amt(), up0.trd_cur_amt_dec_place(),
									rowD.trd_cur_onr_prov_upri(), rowD.trd_cur_proc_upri(), rowD.trd_cur_dscnt_amt());
							rowD.trd_cur_onr_prov_amt(retL.getNumberNE(0, "amt"));
							rowD.trd_cur_proc_amt(retL.getNumberNE(1, "amt"));
						}
					}
				}
			}
			
			// 明細行に紐付く、詳細行の補完
			MCIndexKey ioIdx = iol.createIndex(Schd_IoR.$dtl_peg_no);
			for (Schd_IoR rowIo : iol.subList(ioIdx, rowD.peg_no())) {
				
				// 基準単位
				rowIo.base_unit_cd(rowD.base_unit_cd());
				
				// 基準単位数量
				MCNumber baseUnitQtyIo = convToBaseUnit(rowIo.trd_unit_qty(), rowIo.trd_unit_dmn_qty(),	
						rowIo.trd_unit_conv_qty(), rowD.base_unit_dec_place(), rowD.base_unit_rnd_typ());
				rowIo.base_unit_qty(baseUnitQtyIo);
			}
			
		}
		
		
	}

	protected void setBaseUnitQty(Schd_DtlR Schd_DtlR) {
		if (isSame(Schd_DtlR.trd_unit_cd(), Schd_DtlR.base_unit_cd())) {
			Schd_DtlR.base_unit_qty(Schd_DtlR.trd_unit_qty());
		}
		else {
			Schd_DtlR.base_unit_qty(convToBaseUnit(Schd_DtlR.trd_unit_qty(),
					Schd_DtlR.trd_unit_dmn_qty(), Schd_DtlR.trd_unit_conv_qty(),
					Schd_DtlR.base_unit_dec_place(), Schd_DtlR.base_unit_rnd_typ()));
		}
	}

	protected void setBaseUnitQty(Schd_IoR Schd_IoR) {
		if (isSame(Schd_IoR.trd_unit_cd(), Schd_IoR.base_unit_cd())) {
			Schd_IoR.base_unit_qty(Schd_IoR.trd_unit_qty());
		}
		else {
			Schd_IoR.base_unit_qty(convToBaseUnit(Schd_IoR.trd_unit_qty(),
					Schd_IoR.trd_unit_dmn_qty(), Schd_IoR.trd_unit_conv_qty(),
					Schd_IoR.base_unit_dec_place(), Schd_IoR.base_unit_rnd_typ()));
		}
	}
	
	/**
	 * 登録時のサービスを実行します。
	 */
	
	/**
	 * 仕入返品予定の登録・更新・削除、打切更新から呼ばれる共通処理です<br>
	 * 各種サービスを実行します。<br>
	 * @param hr ヘッダ電文 
	 * @param dl 明細上り電文,または登録済の仕入返品予定明細
	 * @param iol 詳細上り電文, または登録済の仕入返品予定受払
	 * @param i2d 詳細上り電文に結合している明細上り電文を取得する, または仕入返品予定受払に結合している仕入返品予定明細を取得する為のMCJoinKey
	 * @param d2h 明細上り電文に結合しているヘッダ上り電文を取得する, または仕入返品予定明細に結合している仕入返品予定ヘッダを取得する為のMCJoinKey
	 * @param ad2bd 明細上り電文に結合している仕入返品予定明細(変更前)を取得する為のMCJoinKey
	 * @param ai2bi 詳細上り電文に結合している仕入返品予定受払(変更前)を取得する前のMCJoinKey
	 * @param ope 呼出元のオペレーション
	 */
	protected void callSaveService(Schd_HdrR hr, Schd_DtlL<Schd_DtlR> dl, Schd_IoL<Schd_IoR> iol, 
			MCJoinKey<MCList<Schd_DtlR>> i2d, MCJoinKey<MCList<Schd_HdrR>> d2h, 
			MCJoinKey<MCList<Schd_DtlR>> ad2bd, MCJoinKey<MCList<Schd_IoR>> ai2bi, MCOperation ope) {

		//打切更新用オペレーション（Schd_Upd02）では支給予定の更新はしない
		if (!(ope instanceof Schd_Upd02)) {
			//支給更新対象のものを取得
			Schd_IoL<Schd_IoR> pi_u2 = getProvTgt(ad2bd, ai2bi, dl, iol);
			//支給予定サービス実行
			callProvSchdService(hr, i2d, pi_u2, ope);
		}
		
		//引当ロック対象
		Schd_IoL<Schd_IoR> allocio = getAllocMngTgt(dl, iol, i2d, ai2bi);
		
		//受払対象：新規、更新、削除に分ける
		Schd_IoL<Schd_IoR> cio = null;
		Schd_IoL<Schd_IoR> uio = null;
		Schd_IoL<Schd_IoR> dio = null;
		Schd_IoL[] ios = getIoSchdTgt(hr, dl, iol, i2d, ad2bd, ai2bi);
		cio = ios[0];
		uio = ios[1];
		dio = ios[2];
		
		//受払、引当削除
		Schd_IoL<Schd_IoR> delTgt = createSchd_IoL();
		delTgt.addAll(uio);
		delTgt.addAll(dio);
		if (delTgt.size() > 0) {
			callIoSchdServiceForDel(delTgt);
		}

		//引当ロック
		callAllocMngService(hr, i2d, allocio, ope);
		
		//受払、引当登録
		Schd_IoL<Schd_IoR> crtTgt = createSchd_IoL();
		crtTgt.addAll(uio);
		crtTgt.addAll(cio);
		crtTgt.removeIf(r -> MCNumber.ZERO.gte(r.base_unit_qty()));//数量0は追加しない
		if (crtTgt.size() > 0) {
			callIoSchdServiceForCreate(d2h, i2d, crtTgt, ope);
		}
		
		
	}
	protected Schd_IoL<Schd_IoR> getAllocMngTgt(
			Schd_IoL<Schd_IoR> iol, MCJoinKey<MCList<Schd_IoR>> ai2bi
			) {
		Schd_IoL<Schd_IoR> allocio = createSchd_IoL();
		iol.forEach(ir -> {
			//仕入返品の在庫識別区分（品目とは異なる）を使用して在庫更新対象を決定
			if(MAC_STK_MNG_TYP.isMNG(ir.stk_mng_typ())) {
				allocio.add(getRemainQtyRow(ir, ai2bi));
			}
		});
		return allocio;
	}
	
	protected Schd_IoL<Schd_IoR> getAllocMngTgt(Schd_DtlL<Schd_DtlR> dl,
			Schd_IoL<Schd_IoR> iol, 
			MCJoinKey<MCList<Schd_DtlR>> i2d, 
			MCJoinKey<MCList<Schd_IoR>> ai2bi
			) {
		Schd_IoL<Schd_IoR> allocio = createSchd_IoL();
		iol.forEach(ir -> {
			Schd_DtlR dr = ir.getJoinedRow(i2d);
			
			// 打切行は対象外
			if(dr.abort_flg()) {
				return;
			}
			//仕入返品の在庫識別区分（品目とは異なる）を使用して在庫更新対象を決定
			if(MAC_STK_MNG_TYP.isMNG(ir.stk_mng_typ())) {
				allocio.add(getRemainQtyRow(ir, ai2bi));
			}
		});
		return allocio;
	}
	
	/**
	 * 変更が必要だった場合は引数irの複製を残数に変更したインスタンスを返す。
	 * @param ir 詳細
	 * @param ai2bi 変更前の詳細を取得するためのキー
	 * @return
	 */
	protected Schd_IoR getRemainQtyRow(Schd_IoR ir, MCJoinKey<MCList<Schd_IoR>> ai2bi) {
		if (ai2bi != null) {
			Schd_IoR bfrIr = ir.getJoinedRow(ai2bi);
			if (bfrIr != null && !isNull(bfrIr.ret_qty())) {
				ir.base_unit_qty(bfrIr.base_unit_qty().subtract(bfrIr.ret_qty()));
				ir.trd_unit_qty(rvrsBaseUnitConv(ir.base_unit_qty(), bfrIr.trd_unit_dmn_qty(),
						bfrIr.trd_unit_conv_qty(), bfrIr.trd_unit_dec_place(),bfrIr.trd_unit_rnd_typ()));
			}
		}
		return ir;
		
	}
	
	protected Schd_IoL<Schd_IoR>[] getIoSchdTgt(Schd_HdrR hr, Schd_DtlL<Schd_DtlR> dl,
			Schd_IoL<Schd_IoR> iol, 
			MCJoinKey<MCList<Schd_DtlR>> i2d, 
			MCJoinKey<MCList<Schd_DtlR>> ad2bd, MCJoinKey<MCList<Schd_IoR>> ai2bi) {
		Schd_IoL<Schd_IoR> cio = createSchd_IoL();
		Schd_IoL<Schd_IoR> uio = createSchd_IoL();
		Schd_IoL<Schd_IoR> dio = createSchd_IoL();
		iol.forEach(ir -> {
			Schd_DtlR bdr = null;
			Schd_DtlR dr = ir.getJoinedRow(i2d);
				
			if (ad2bd != null) {
				bdr = dr.getJoinedRow(ad2bd);
			}
			//打切解除か新規
			if ((bdr != null && bdr.abort_flg() && !dr.abort_flg()) || 
					MAC_DATA_CRUD_TYP.isCRT(dr.data_crud_typ())	|| 
					MAC_DATA_CRUD_TYP.isCRT(ir.data_crud_typ())) {
				cio.add(getRemainQtyRow(ir, ai2bi));
			}
			//打切か削除
			else if (dr.abort_flg() || 
					MAC_DATA_CRUD_TYP.isDEL(dr.data_crud_typ()) || 
					MAC_DATA_CRUD_TYP.isDEL(ir.data_crud_typ())) {
				dio.add(getRemainQtyRow(ir, ai2bi));
			}
			//それ以外の更新
			else {
				uio.add(getRemainQtyRow(ir, ai2bi));
			}
		
		});
		return new Schd_IoL[]{cio, uio, dio};
	}
		
	protected void callIoSchdServiceForDel(Schd_IoL<Schd_IoR> iol) {
		MSBEL_IoSchdService.IoSchd_Del01 ope = MSBEL_IoSchdService.crtIoSchd_Del01();
		addAll(ope.up0(), iol, createMap_MSW_IO_SCHD_DEL_R_Schd_IoR());
		ope.exec();
		
	}
	protected void callProvSchdChk(Schd_HdrR hr,
			MCJoinKey<MCList<Schd_DtlR>> i2d, Schd_IoL<Schd_IoR> iol, MCOperation ope) {
		
		MSBEL_ProvSchdService.ProvSchd_Chk01 pope = MSBEL_ProvSchdService.crtProvSchd_Chk01();	
		Map_ProvSchdChk01_DtlR_IoR<ProvSchd_DtlR,Schd_IoR> pmap = createMap_ProvSchdChk01_DtlR_IoR();
		pmap.setWith(i2d, hr, ope);
		addAll(pope.up0(), iol, pmap);
		pope.exec();
	}


	protected void callAllocMngService(Schd_HdrR hr,
			MCJoinKey<MCList<Schd_DtlR>> i2d, Schd_IoL<Schd_IoR> iol, MCOperation ope) {
		MSBEL_AllocMngService.Alloc_Lock_Upd01 uope = 
				MSBEL_AllocMngService.crtAlloc_Lock_Upd01();
		
		addAll(uope.up0(), iol, createMap_MSW_ALLOC_LOC_MAP_R_IoR());
		uope.exec();
		
		MSBEL_AllocMngService.Alloc_Srch01 sope = 
				MSBEL_AllocMngService.crtAlloc_Srch01();
		
		sope.up0().short_ope_typ(MSC_SHORT_OPE_TYP.PROCEED.value());
		Map_Srch_TgtR_IoR<Srch_TgtR,Schd_IoR> map = createMap_Srch_TgtR_IoR();
		map.setWith(i2d, hr, ope);
		addAll(sope.up1(), iol, map);
		if(!sope.up1().isEmpty() && !hr.skip_alloc_flg()) {
			sope.exec();
		}
		
		//未引当情報が存在する場合はエラー
		if(sope.down2().size() > 0) {
			sope.down2().forEach(r -> {
				MCMessagePool.add(new MCMessage(
						r,
						null,
						MSBDL0018,
						toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
						r.gi_loc_cd(), r.gi_str_ln_cd(),
						r.lot_no(), r.sublot_no(),
						toDispSno(r.sno1(), r.sno2(), r.sno3(), r.sno4()),
						r.pack_unit_cd(), r.gd_cd(),
						r.quality_typ(), r.stk_id_typ(), r.stk_bp_cd(), r.gi_stk_arrv_bp_cd()));
			});
			throwUpdErr();
		}
	}
		
	protected void callProvSchdService(Schd_HdrR hr,
			MCJoinKey<MCList<Schd_DtlR>> i2d, Schd_IoL<Schd_IoR> iol, MCOperation ope) {
		
		MSBEL_ProvSchdService.ProvSchd_Upd01 pope = MSBEL_ProvSchdService.crtProvSchd_Upd01();	
		Map_ProvSchd_DtlR_IoR<ProvSchd_DtlR,Schd_IoR> pmap = createMap_ProvSchd_DtlR_IoR();
		pmap.setWith(i2d, hr, ope);
		addAll(pope.up0(), iol.subList(r -> isProvTgt(r, r.getJoinedRow(i2d))), pmap);
		pope.exec();
		
	}
	
	protected void callIoSchdServiceForCreate(MCJoinKey<MCList<Schd_HdrR>> d2h,
			MCJoinKey<MCList<Schd_DtlR>> i2d, Schd_IoL<Schd_IoR> iol, MCOperation ope) {
		MSBEL_IoSchdService.IoSchd_Ins01 iope = MSBEL_IoSchdService.crtIoSchd_Ins01();
		Map_IoSchd_Ins01_DtlR_Schd_IoR<IoSchd_Ins01_DtlR, Schd_IoR>  imap = createMap_IoSchd_Ins01_DtlR_Schd_IoR();
		imap.setWith(i2d, d2h, iope);
		addAll(iope.up0(), iol, imap);
		iope.exec();
	}
	
	protected boolean isCostkTgt(DtlR dr, IoR ir) {
		if (dr == null || dr.can_flg() || ir == null || ir.can_flg()) {
			return false;
		}
		String aftrPrvStkIdTyp = ir.after_prov_stk_id_typ();
		if (isNull(aftrPrvStkIdTyp)) {
			// 有償支給の場合は自社在庫固定
			if(MSC_STK_ID_TYP.isONR_PROV(ir.stk_id_typ())) {
				aftrPrvStkIdTyp = MSC_STK_ID_TYP.COSTK.value();
			}
			else {
				aftrPrvStkIdTyp = ir.stk_id_typ();
			}
		}
		
		return MSC_STK_ID_TYP.isCOSTK(aftrPrvStkIdTyp);
	}

	protected void compSubImpl(Schd_HdrR up0, Schd_DtlL<Schd_DtlR> up1, Schd_IoL<Schd_IoR> up2) {
		// 明細と受払のpeg_noは画面側で設定されていることを想定
		up0.peg_no(MCNumber.ONE);
		up1.forEach(r -> {
			setStkMngTyp(r);
			if (r.isStatusCreate()) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
			else if (r.isStatusDelete()) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
			else {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
			
			r.hdr_peg_no(up0.peg_no());
			r.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
			r.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
			setBaseUnitQty(r);
			setStrLn(r, Schd_DtlR.$purc_ret_loc_cd, Schd_DtlR.$str_ln_cd);
		});
		
		up2.forEach(r -> {
			if (r.isStatusCreate()) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
			else if (r.isStatusDelete()) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
			else {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
			
			setBaseUnitQty(r);
			r.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
			r.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
			setStrLn(r, Schd_IoR.$purc_ret_loc_cd, Schd_IoR.$str_ln_cd);
		});
		
		setAmt(up0,up1,up2);
		setDispSeq(up1);
	}
	protected boolean isOutSrc(Schd_DtlR rowD) {
		return !MAC_PURC_TYP.isPURC_ITM(rowD.purc_typ());
	}
	protected void complProcUpriAmt(Schd_DtlR rowD) {
		if (isOutSrc(rowD)) {
			if (isNull(rowD.trd_cur_proc_upri())) {
				rowD.trd_cur_proc_upri(MCNumber.ZERO);
				rowD.trd_cur_proc_amt(MCNumber.ZERO);
			}
		}
	}

	protected Map_MSW_ALLOC_LOC_MAP_R_IoR<MSW_ALLOC_LOC_MAP_R,Schd_IoR> createMap_MSW_ALLOC_LOC_MAP_R_IoR() {
		return new Map_MSW_ALLOC_LOC_MAP_R_IoR<MSW_ALLOC_LOC_MAP_R, Schd_IoR>();
	}

	public class Map_MSW_ALLOC_LOC_MAP_R_IoR<D extends MSW_ALLOC_LOC_MAP_R, S extends Schd_IoR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_cd, Schd_IoR.$itm_cd);
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub1, Schd_IoR.$itm_sub1);
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub2, Schd_IoR.$itm_sub2);
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub3, Schd_IoR.$itm_sub3);
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$gi_loc_cd, Schd_IoR.$purc_ret_loc_cd);

		}
	}
	
	protected Map_Srch_TgtR_IoR<Srch_TgtR,Schd_IoR> createMap_Srch_TgtR_IoR() {
		return new Map_Srch_TgtR_IoR<Srch_TgtR, Schd_IoR>();
	}

	public class Map_Srch_TgtR_IoR<D extends Srch_TgtR, S extends Schd_IoR> extends MCRowMapper<D,S>{
		
		protected MCJoinKey<MCList<Schd_DtlR>> _i2d;
		protected Schd_HdrR _hr;
		protected MCOperation _ope;
		/**
		 * データ連携時に必要なデータを設定します。
		 * @param _hr ヘッダ
		 * @param _clr 実行元オペレーション
		 */
		public void setWith(MCJoinKey<MCList<Schd_DtlR>> i2d, Schd_HdrR hr, MCOperation ope){
			this._i2d = i2d;
			this._hr = hr;
			this._ope = ope;
		}
		
		@Override
		protected void setupColumnPathMap() {

			addColumnPathMap(Srch_TgtR.$peg_no, Schd_IoR.$peg_no);
			addColumnPathMap(Srch_TgtR.$itm_cd, Schd_IoR.$itm_cd);
			addColumnPathMap(Srch_TgtR.$itm_sub1, Schd_IoR.$itm_sub1);
			addColumnPathMap(Srch_TgtR.$itm_sub2, Schd_IoR.$itm_sub2);
			addColumnPathMap(Srch_TgtR.$itm_sub3, Schd_IoR.$itm_sub3);
			addColumnPathMap(Srch_TgtR.$ver_no, Schd_IoR.$ver_no);
			addColumnPathMap(Srch_TgtR.$gi_loc_cd, Schd_IoR.$purc_ret_loc_cd);
			addColumnPathMap(Srch_TgtR.$gi_str_ln_cd, Schd_IoR.$str_ln_cd);
			addColumnPathMap(Srch_TgtR.$gi_stk_arrv_bp_cd, Schd_IoR.$stk_arrv_bp_cd);
			addColumnPathMap(Srch_TgtR.$quality_typ, Schd_IoR.$quality_typ);
			addColumnPathMap(Srch_TgtR.$stk_id_typ, Schd_IoR.$stk_id_typ);
			addColumnPathMap(Srch_TgtR.$gd_cd, Schd_IoR.$gd_cd);
			addColumnPathMap(Srch_TgtR.$lot_no, Schd_IoR.$lot_no);
			addColumnPathMap(Srch_TgtR.$sublot_no, Schd_IoR.$sublot_no);
			addColumnPathMap(Srch_TgtR.$pack_unit_cd, Schd_IoR.$trd_unit_cd);
			addColumnPathMap(Srch_TgtR.$pack_unit_qty, Schd_IoR.$trd_unit_qty);
			addColumnPathMap(Srch_TgtR.$base_unit_cd, Schd_IoR.$base_unit_cd);
			addColumnPathMap(Srch_TgtR.$base_unit_qty, Schd_IoR.$base_unit_qty);
		
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.gi_schd_dt(_hr.schd_dt());
			Schd_DtlR dr = src.getJoinedRow(_i2d);
			dest.sno1(dr.sno1());
			dest.sno2(dr.sno2());
			dest.sno3(dr.sno3());
			dest.sno4(dr.sno4());
			dest.stk_bp_cd(getStkBpCd(src.stk_id_typ(), _hr.sppl_cd(), dr.purc_ret_sppl_cd()));
			dest.io_schd_typ(getIoSchdTyp(src.purc_ret_sppl_cd()));
		}
	}
	
	/**
	 * 在庫取引先を返します。
	 * @param stk_id_typ 在庫識別区分
	 * @param sppl_cd 発注先
	 * @param pr_src_sppl_cd 場所の発注先
	 * @return 在庫取引先
	 */
	protected String getStkBpCd(String stk_id_typ, String sppl_cd, String pr_src_sppl_cd) {
		String sit = stk_id_typ;
		
		if (MSC_STK_ID_TYP.isONR_PROV(sit) ) {
			return pr_src_sppl_cd;
		}
		else if (!MSC_STK_ID_TYP.isCOSTK(sit)) {
			return sppl_cd;
		}
		else {
			return MAC_STR.NULL_VAL.value();
		}
	}
	
	protected Map_MSW_IO_SCHD_DEL_R_Schd_IoR<MSW_IO_SCHD_DEL_R,Schd_IoR> createMap_MSW_IO_SCHD_DEL_R_Schd_IoR() {
		return new Map_MSW_IO_SCHD_DEL_R_Schd_IoR<MSW_IO_SCHD_DEL_R, Schd_IoR>();
	}

	public class Map_MSW_IO_SCHD_DEL_R_Schd_IoR<D extends MSW_IO_SCHD_DEL_R, S extends Schd_IoR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MSW_IO_SCHD_DEL_R.$io_schd_no, Schd_IoR.$purc_ret_schd_io_no);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.io_schd_typ(getIoSchdTyp(src.purc_ret_sppl_cd()));
			dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());
		}
	}

	protected Map_OutSrcAct_Sprt02_CndR_DtlR<OutSrcAct_Sprt02_CndR,Schd_DtlR> createMap_OutSrcAct_Sprt02_CndR_DtlR() {
		return new Map_OutSrcAct_Sprt02_CndR_DtlR<OutSrcAct_Sprt02_CndR, Schd_DtlR>();
	}

	public class Map_OutSrcAct_Sprt02_CndR_DtlR<D extends OutSrcAct_Sprt02_CndR, S extends Schd_DtlR> extends MCRowMapper<D,S>{
		Schd_HdrR _hr;
		protected void setWith(Schd_HdrR hr) {
			_hr = hr;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(OutSrcAct_Sprt02_CndR.$peg_no, Schd_DtlR.$peg_no);
			addColumnPathMap(OutSrcAct_Sprt02_CndR.$mfg_inst_no, Schd_DtlR.$mfg_inst_no);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
		}
	}
	
	protected Map_ProvSchd_DtlR_IoR<ProvSchd_DtlR,Schd_IoR> createMap_ProvSchd_DtlR_IoR() {
		return new Map_ProvSchd_DtlR_IoR<ProvSchd_DtlR, Schd_IoR>();
	}

	public class Map_ProvSchd_DtlR_IoR<D extends ProvSchd_DtlR, S extends Schd_IoR> extends MCRowMapper<D,S>{
		protected MCJoinKey<MCList<Schd_DtlR>> _i2d;
		protected Schd_HdrR _hr;
		protected MCOperation _ope;
		/**
		 * データ連携時に必要なデータを設定します。
		 * @param _hr ヘッダ
		 * @param _clr 実行元オペレーション
		 */
		public void setWith(MCJoinKey<MCList<Schd_DtlR>> i2d, Schd_HdrR hr, MCOperation ope){
			this._i2d = i2d;
			this._hr = hr;
			this._ope = ope;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ProvSchd_DtlR.$peg_no, Schd_IoR.$peg_no);
			addColumnPathMap(ProvSchd_DtlR.$data_crud_typ, Schd_IoR.$data_crud_typ);
			

			addColumnPathMap(ProvSchd_DtlR.$base_unit_cd, Schd_IoR.$base_unit_cd);
			addColumnPathMap(ProvSchd_DtlR.$base_unit_qty, Schd_IoR.$base_unit_qty);

			addColumnPathMap(ProvSchd_DtlR.$stk_id_typ, Schd_IoR.$stk_id_typ);
			addColumnPathMap(ProvSchd_DtlR.$stk_arrv_bp_cd, Schd_IoR.$stk_arrv_bp_cd);
			addColumnPathMap(ProvSchd_DtlR.$wg_cd, Schd_IoR.$purc_ret_loc_wg_cd);
			addColumnPathMap(ProvSchd_DtlR.$prsppl_cd, Schd_IoR.$purc_ret_sppl_cd);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			String dct = src.getStringNE($prov_data_crud_typ);

			dest.data_crud_typ(dct);

			dest.trd_ptn_typ(MAC_TRD_PTN_TYP.PROV_RTN.value());

			dest.prov_src_schd_typ(MSC_PROV_SRC_SCHD_TYP.RET_DDLV.value());
			dest.prov_src_schd_no1(src.purc_ret_schd_io_no());

			dest.prov_typ(getProvTyp(src.stk_id_typ()));
			
			dest.itm_cd(src.itm_cd());
			dest.itm_sub1(src.itm_sub1());
			dest.itm_sub2(src.itm_sub2());
			dest.itm_sub3(src.itm_sub3());
			dest.accpt_schd_dt(_hr.schd_dt());
		}
	}
	protected Map_ProvSchdChk01_DtlR_IoR<ProvSchd_DtlR,Schd_IoR> createMap_ProvSchdChk01_DtlR_IoR() {
		return new Map_ProvSchdChk01_DtlR_IoR<ProvSchd_DtlR, Schd_IoR>();
	}

	public class Map_ProvSchdChk01_DtlR_IoR<D extends ProvSchd_DtlR, S extends Schd_IoR> extends MCRowMapper<D,S>{
		protected MCJoinKey<MCList<Schd_DtlR>> _i2d;
		protected Schd_HdrR _hr;
		protected MCOperation _ope;
		/**
		 * データ連携時に必要なデータを設定します。
		 * @param _hr ヘッダ
		 * @param _clr 実行元オペレーション
		 */
		public void setWith(MCJoinKey<MCList<Schd_DtlR>> i2d, Schd_HdrR hr, MCOperation ope){
			this._i2d = i2d;
			this._hr = hr;
			this._ope = ope;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ProvSchd_DtlR.$peg_no, Schd_IoR.$peg_no);
			addColumnPathMap(ProvSchd_DtlR.$wg_cd, Schd_IoR.$purc_ret_loc_wg_cd);
			addColumnPathMap(ProvSchd_DtlR.$prsppl_cd, Schd_IoR.$purc_ret_sppl_cd);
			addColumnPathMap(ProvSchd_DtlR.$itm_cd, Schd_IoR.$itm_cd);
			addColumnPathMap(ProvSchd_DtlR.$itm_sub1, Schd_IoR.$itm_sub1);
			addColumnPathMap(ProvSchd_DtlR.$itm_sub2, Schd_IoR.$itm_sub2);
			addColumnPathMap(ProvSchd_DtlR.$itm_sub3, Schd_IoR.$itm_sub3);
			addColumnPathMap(ProvSchd_DtlR.$stk_id_typ, Schd_IoR.$stk_id_typ);
			addColumnPathMap(ProvSchd_DtlR.$stk_arrv_bp_cd, Schd_IoR.$stk_arrv_bp_cd);

		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			String dct = src.getStringNE($prov_data_crud_typ);

			dest.data_crud_typ(dct);

			dest.accpt_schd_dt(_hr.schd_dt());
			
			dest.prov_typ(getProvTyp(src.stk_id_typ()));
		}
	}
	
	/**
	 * 支給更新対象のレコードの在庫識別区分に対応する支給区分を返します。<p>
	 * 
	 * @param stkIdTyp 支給更新対象のレコードの在庫識別区分
	 * @return　支給区分
	 */
	protected String getProvTyp(String stkIdTyp) {
		if (MSC_STK_ID_TYP.isONR_PROV(stkIdTyp)) {
			return MAC_PROV_TYP.ONR_PROV.value();
		}
		else {
			return MAC_PROV_TYP.FFR_PROV.value();
		}
	}
	/**
	 * 品目詳細マスタの存在チェックを行います。
	 * @return
	 */
	protected MCMessageList existItmDtlCheck(Schd_HdrR hr, MCList<Schd_DtlR> dtlL, MCJoinKey<MCList<Schd_IoR>> d2i) {
		MCList<MAM_ITM_DTL_R> itmDtlL = MCList.create(MAM_ITM_DTL_R.class);
		for (Schd_DtlR r : dtlL) {
			// 品目詳細マスタの存在チェックを行う
			MCList<Schd_IoR> iol = r.getJoined(d2i).subList(ir -> !ir.isStatusDelete()).groupBy(Schd_IoR.$purc_ret_loc_wg_cd);
			for(Schd_IoR i : iol) {
				MAM_ITM_DTL_R itmDtlR = MAM_ITM_DTL_R.create();
				itmDtlR.setAttributes(r);
				itmDtlR.itm_cd(r.itm_cd());
				itmDtlR.itm_sub1(r.itm_sub1());
				itmDtlR.itm_sub2(r.itm_sub2());
				itmDtlR.itm_sub3(r.itm_sub3());
				itmDtlR.sppl_cd(hr.sppl_cd());
				itmDtlR.maker_cd(r.maker_cd());
				itmDtlR.wg_cd(i.purc_ret_loc_wg_cd());
				itmDtlR.st_dt(hr.reg_dt());
				itmDtlL.add(itmDtlR);
			}
		}
		return MSUCL_ProdUtil.chkItmDtlPurc(itmDtlL);
	}

	/**
	 * 負担項目の各種ＮＯの存在チェックを行います。
	 * @param dtlL 明細上り電文リスト(新規、または更新)
	 * @return メッセージリスト
	 */
	protected MCMessageList existBdCheck(MCList<Schd_DtlR> dtlL) {
		MCMessageList msgL = new MCMessageList();
		MCList<Schd_DtlR> bdLotChkTgtL = MCList.create(Schd_DtlR.class);
				
		for (Schd_DtlR dr : dtlL) {
			if (dr.getStatus() == MCRow.DELETE || dr.abort_flg()) {
				continue;
			}
			if (!isNull(dr.po_no())) {
				if (!existsPoNo(dr.po_no())) {
					msgL.add(new MCMessage(dr, DtlR.$po_no, MSBDL0084, dr.po_no(), toDispGUIIndex(dr)));
				}
			}
			if (!isNull(dr.bd_po_no())) {
				if (!existsPoNo(dr.bd_po_no())) {
					msgL.add(new MCMessage(dr, DtlR.$bd_po_no, MSBDL0175, dr.bd_po_no(), toDispGUIIndex(dr)));
				}
			}
			if (!isNull(dr.bd_slo_no())) {
				if (!existsSloNo(dr.bd_slo_no())) {
					msgL.add(new MCMessage(dr, DtlR.$bd_slo_no, MSBDL0177, dr.bd_slo_no(), toDispGUIIndex(dr)));
				}
			}
			if (!isNull(dr.bd_lot_no()) && !isNull(dr.bd_itm_cd())) {
				bdLotChkTgtL.add(dr);
			}
			if (!isNull(dr.bd_iv_no())) {
				if (!existsBdIvNo(dr.bd_iv_no())) {
					msgL.add(new MCMessage(dr, DtlR.$bd_iv_no, MSBDL0179, dr.bd_iv_no(), toDispGUIIndex(dr)));
				}
			}
			
		}		
		callLotServiceChkBdItm(bdLotChkTgtL);
		
		return msgL;
	}
	/**
	 * 外注単価のチェックを行います
	 * @param up0 チェック対象の上り電文ヘッダ
	 * @param up1 チェック対象の上り電文明細
	 * @return
	 */
	protected MCMessageList chkOutsrcUpri(Schd_HdrR up0, MCList<Schd_DtlR> up1) {
		MCMessageList ml = new MCMessageList();
		up1.forEach(dr -> {
			if(!isNull(dr.trd_cur_proc_upri()) || !isNull(dr.trd_cur_onr_prov_upri())) {
				MCNumber upri = nvl(dr.trd_cur_proc_upri(), MCNumber.ZERO).add(nvl(dr.trd_cur_onr_prov_upri(), MCNumber.ZERO));
				if(!isSame(dr.trd_cur_upri(), upri)) {
					ml.add(new MCMessage(dr, Schd_DtlR.$trd_cur_upri, MSBDL0501, upri, dr.trd_cur_upri(), toDispGUIIndex(dr)));
				}
			}
		});
		return ml;
	}
	/**
	 * ロット存在チェックサービスを呼出し、負担ロットの存在チェックを行います。
	 * @param dtlL 明細上り電文リスト(新規、または更新)
	 */
	protected void callLotServiceChkBdItm(MCList<Schd_DtlR> dtlL) {
		if (dtlL.isEmpty()) {
			return;
		}		
		MSBFL_LotService.Lot_Chk03 ope = MSBFL_LotService.crtLot_Chk03();
		addAll(ope.up0(), dtlL, createMap_Lot_Chk03_CndR_Schd_DtlR());
		ope.exec();		
		copyErrFlg(dtlL, ope.up0());
	}

	protected DtlL<DtlR> _purcRetActDCache = null;

	protected static DtlL<DtlR> getPurcRetActDCache(HdrL<HdrR> hl) {
		DtlL<DtlR> l = object(CLAZZ)._purcRetActDCache;
		if (l == null) {
			return object(CLAZZ)._purcRetActDCache = getPurcRetActDImpl(hl, false);
		}
		return l;
	}

	protected FXUCL_MCDbcCache<MST_PO_R> _poCache = null;

	protected static void initPoCache(MCList<MST_PO_R> dbcL, MCList<Schd_DtlR> dl) {
		object(CLAZZ)._initPoCache(dbcL, dl);
	}

	protected static FXUCL_MCDbcCache<MST_PO_R> getPoCache() {
		return object(CLAZZ)._poCache;
	}

	protected void _initPoCache(MCList<MST_PO_R> prov, MCList<Schd_DtlR> dl) {
		_poCache = new FXUCL_MCDbcCache<MST_PO_R>(
				prov,
				MCQueryApiBuilder.create(MST_PO_R.create("T")),
				dl,
				Schd_DtlR.$po_no);
	}
	/**
	 * 在庫管理区分の設定 <p>
	 * 品目マスタの在庫管理区分・資産管理区分と、上り電文の経費購買FLGの組合せで、<br>
	 * 連携する在庫管理区分の値を決定し、入れ替える<br>
	 */
	protected void setStkMngTyp(Schd_DtlR r) {
		if (MSBDL_PurcUtil.isUpdStk(r.stk_mng_typ(), r.asset_mng_typ(), r.xpns_purc_flg())) {
			r.stk_mng_typ(MAC_STK_MNG_TYP.MNG.value());
		}
		
		else {
			r.stk_mng_typ(MAC_STK_MNG_TYP.NOT_MNG.value());
		}
	}
	
	protected boolean isProvTgt(Schd_IoR r, Schd_DtlR dr) {
		if (r == null || dr == null) {
			return false;
		}
		if (isNull(r.purc_ret_sppl_cd())) {
			return false;
		}
		//使用基準の支給（場所の発注先があり、自社在庫かつ在庫着荷先がNULL文字）は対象外
		if (MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ()) && MAC_STR.isNULL_VAL(r.stk_arrv_bp_cd())) {					
			return false;
		}
		return true;
	}
	
	protected boolean isProvTgt(IoR r) {
		if (r == null || r.can_flg()) {
			return false;
		}
		//使用基準の支給（場所の発注先があり、自社在庫かつ在庫着荷先がNULL文字）は対象外
		if (isNull(r.purc_ret_sppl_cd())) {
			return false;
		}
		if (MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ()) && MAC_STR.isNULL_VAL(r.stk_arrv_bp_cd())) {					
			return false;
		}
		return true;
	}
		
	/**
	 * 支給サービス用のDATA_CRUD_TYPを{@link #$prov_data_crud_typ}の項目に設定し、
	 * 設定されなかった行を除いたリストを返します。
	 * @param _a2b 変更前の行を取得するためのキー（明細用）
	 * @param _ai2bi 変更前の行を取得するためのキー（受払用）
	 * @param _prSchdDL 明細
	 * @param _prSchdIOL 受払
	 */
	protected Schd_IoL<Schd_IoR> getProvTgt(
			MCJoinKey<MCList<Schd_DtlR>> _a2b,
			MCJoinKey<MCList<Schd_IoR>> _ai2bi,
			Schd_DtlL<Schd_DtlR> _prSchdDL,
			Schd_IoL<Schd_IoR> _prSchdIOL
			) {
		MCIndexKey dk = _prSchdDL.createIndex(Schd_DtlR.$peg_no);

		//支給予定用のDATA_CRUPD_TYPを設定
		_prSchdIOL.forEach(r -> r.setStringNE($prov_data_crud_typ,
				getProvTgtDataCrudTyp(r, _prSchdDL.getFirst(dk, r.dtl_peg_no()),
				_a2b, _ai2bi)));
		
		//未設定の行を除外
		return _prSchdIOL.subList(r -> 
			!isNull(r.getStringNE($prov_data_crud_typ)));
	}
	/**
	 * 支給サービス用のDATA_CRUD_TYPを{@link #$prov_data_crud_typ}の項目に設定し、
	 * 設定されなかった行を除いたリストを返します。
	 * @param _a2b 変更前の行を取得するためのキー（明細用）
	 * @param _ai2bi 変更前の行を取得するためのキー（受払用）
	 * @param _prActDL 明細
	 * @param _prActIOL 受払
	 */
	protected IoL<IoR> getProvTgt(
			MCJoinKey<MCList<DtlR>> _a2b,
			MCJoinKey<MCList<IoR>> _ai2bi,
			DtlL<DtlR> _prActDL,
			IoL<IoR> _prActIOL
			) {
		MCIndexKey dk = _prActDL.createIndex(DtlR.$peg_no);

		//支給用のDATA_CRUPD_TYPを設定
		_prActIOL.forEach(r -> r.setStringNE($prov_data_crud_typ,
				getProvTgtDataCrudTyp(r, _prActDL.getFirst(dk, r.dtl_peg_no()),
				_a2b, _ai2bi)));
		
		//未設定の行を除外
		return _prActIOL.subList(r -> 
			!isNull(r.getStringNE($prov_data_crud_typ)));
	}
	
	/**
	 * 支給対象のDATA_CRUD_TYPを返します。
	 */
	protected String getProvTgtDataCrudTyp(Schd_IoR ir, 
			Schd_DtlR dr, MCJoinKey<MCList<Schd_DtlR>> a2b, MCJoinKey<MCList<Schd_IoR>> ai2bi) {
		
		Schd_DtlR bdr = null;
		Schd_IoR bir = null;
		
		//変更前情報を取得
		if (a2b != null) {	
			bdr = dr.getJoinedRow(a2b);
		}
		if (ai2bi != null) {
			bir = ir.getJoinedRow(ai2bi);
		}
		
		//打切の変更は支給更新対象外にする
		if (dr.abort_flg() || 
				(bdr != null && (bdr.abort_flg() != dr.abort_flg()))) {
			return null;
		}
		
		//DATA_CRUD_TYPの決定
		if (bdr == null) {
			if (isProvTgt(ir, dr)) {
				return MAC_DATA_CRUD_TYP.CRT.value();
			}
		}
		else if ( ir.isStatusModify() || ir.isStatusNone()) {
			if (isProvTgt(bir, bdr)) {
				if (isProvTgt(ir, dr)) {
					return MAC_DATA_CRUD_TYP.UPD.value();
				}
				else {	
					return MAC_DATA_CRUD_TYP.DEL.value();
				}
			}
			else {
				if (isProvTgt(ir, dr)) {
					return MAC_DATA_CRUD_TYP.CRT.value();
				}
			}
		}
		else if (ir.isStatusDelete()) {
			if (isProvTgt(bir, bdr)) {
				return MAC_DATA_CRUD_TYP.DEL.value();
			}
		}
		return null;
	}

	/**
	 * 支給対象のDATA_CRUD_TYPを返します。
	 */
	protected String getProvTgtDataCrudTyp(IoR ir, 
			DtlR dr, MCJoinKey<MCList<DtlR>> a2b, MCJoinKey<MCList<IoR>> ai2bi) {
		
		IoR bir = null;
		
		//変更前情報を取得
		if (ai2bi != null) {
			bir = ir.getJoinedRow(ai2bi);
		}
		
		//DATA_CRUD_TYPの決定
		if (ir.isStatusCreate()) {
			if (isProvTgt(ir)) {
				return MAC_DATA_CRUD_TYP.CRT.value();
			}
		}
		else if ( ir.isStatusModify() || ir.isStatusNone()) {
			if (isProvTgt(bir)) {
				if (isProvTgt(ir)) {
					return MAC_DATA_CRUD_TYP.UPD.value();
				}
				else {	
					return MAC_DATA_CRUD_TYP.DEL.value();
				}
			}
			else {
				if (isProvTgt(ir)) {
					return MAC_DATA_CRUD_TYP.CRT.value();
				}
			}
		}
		else if (ir.isStatusDelete()) {
			if (isProvTgt(bir)) {
				return MAC_DATA_CRUD_TYP.DEL.value();
			}
		}
		else if (ir.isStatusNone()) {
			if (isProvTgt(ir)) {
				return MAC_DATA_CRUD_TYP.UPD.value();
			}
			
		}
		return null;
	}
	
	protected void setItmNm(Schd_DtlL<Schd_DtlR> up1) {
		
		up1.forEach(dr -> {
			if (MAC_STK_MNG_TYP.isNOT_MNG(dr.stk_mng_typ()) && dr.sundry_itm_flg()) {
				//そのまま上らせる
			}
			else if (MAC_STK_MNG_TYP.isMNG(dr.stk_mng_typ()) && dr.sundry_itm_flg()) {
				MAM_SUNDRY_ITM_R sundryItm = getSundryItm(dr.itm_cd(), dr.itm_sub1(), dr.itm_sub2(), dr.itm_sub3(), dr.sno1(), dr.sno2(), dr.sno3(),
						dr.sno4());
				dr.itm_nm(sundryItm.itm_nm());
			}
			else {
				dr.itm_nm(null);
				dr.iv_itm_nm(null);
			}
		});
	}
	protected void setItmNm(DtlL<DtlR> up1) {
		
		up1.forEach(dr -> {
			if (MAC_STK_MNG_TYP.isNOT_MNG(dr.stk_mng_typ()) && dr.sundry_itm_flg()) {
				//そのまま上らせる
			}
			else if (MAC_STK_MNG_TYP.isMNG(dr.stk_mng_typ()) && dr.sundry_itm_flg()) {
				MAM_SUNDRY_ITM_R sundryItm = getSundryItm(dr.itm_cd(), dr.itm_sub1(), dr.itm_sub2(), dr.itm_sub3(), dr.sno1(), dr.sno2(), dr.sno3(),
						dr.sno4());
				dr.itm_nm(sundryItm.itm_nm());
			}
			else {
				dr.itm_nm(null);
				dr.iv_itm_nm(null);
			}
		});
	}

	protected void chkSundry(MCList<Schd_DtlR>  dtlL) {
		for (Schd_DtlR r : dtlL)
			if (MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ()) && r.sundry_itm_flg()) {
				MAM_SUNDRY_ITM_R sundryItm = getSundryItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.sno1(), r.sno2(), r.sno3(),
						r.sno4());
				if (isNull(sundryItm) || sundryItm.isEmpty()) {
					MCMessagePool.add(new MCMessage(r, null, MSBDL0058, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
							toDispSno(r.sno1(), r.sno2(), r.sno3(), r.sno4()), toDispGUIIndex(r)));
				}
			}
	}
	protected void setParentErrFlg(Schd_HdrR up0, MCList<Schd_DtlR> up1) {
		for(Schd_DtlR dr:up1){
			if(dr.err_flg()) {
				up0.err_flg(true);
				return;
			}				
		}
	}

	protected MCMessageList checkSubForUpd(Schd_HdrR up0, MCList<Schd_DtlR> up1_CU, 
			MCJoinKey<MCList<Schd_DtlR>> _ad2bd,
			MCJoinKey<MCList<Schd_IoR>> _d2i) {
		MCMessageList msgL = new MCMessageList();
		Schd_HdrR hr = up0;

		if (hr.err_flg()) {
			return msgL;
		}
		MCList<Schd_DtlR> updl = up1_CU.subList(dr -> !dr.abort_flg() && !isNull(dr.purc_ret_schd_d_no()));
		updl.forEach(dr -> {
			Schd_DtlR bdr = dr.getJoinedRow(_ad2bd);
			if (bdr != null) {
				
				//完了している予定の打切は不可
				if (bdr.cmpl_flg() && !bdr.abort_flg() && dr.abort_flg()) {
					msgL.add(new MCMessage(dr, Schd_DtlR.$abort_flg, MSBDL0086, 
							dr.purc_ret_schd_d_no(), toDispGUIIndex(dr)));
				}
			}
		});
		
		return msgL;
	}
	/**
	 * 実績があるかどうかを判定する。
	 * @param before 返品済数量を保持する変更前データ
	 */
	protected boolean hasAct(Schd_IoR before) {
		return !isNull(before) && !isNull(before.ret_qty()) && before.ret_qty().gt(MCNumber.ZERO);
	}
	/**
	 * 実績があるかどうかを判定する。
	 * @param before 返品済数量を保持する変更前データ
	 */
	protected boolean hasAct(Schd_DtlR before) {
		return !isNull(before) && !isNull(before.ret_qty()) && before.ret_qty().gt(MCNumber.ZERO);
	}

	
	protected void setSplitMsg(HdrL<HdrR> hdrList, HdrL<HdrR> divList) {
		HdrL<HdrR> splitHdrList = hdrList.subList(HdrR.$split_flg, true);
		if (splitHdrList.size() > 0) {
			if (!isNull(divList)) {
				for (HdrR divRow : divList) {
					MCMessage msg = new MCMessage(MSBDL0196, divRow.purc_ret_act_no(), toDispGUIIndex(divRow));
					MCMessagePool.add(msg);
				}
			}
			for (HdrR hdrRow : hdrList) {
				MCMessage msg = new MCMessage(MSBDL0196, hdrRow.purc_ret_act_no(), toDispGUIIndex(hdrRow));
				MCMessagePool.add(msg);
			}
			MCMessagePool.add(new MCMessage(MSBDL0140));
		}
	}
	protected Map_Lot_Chk03_CndR_Schd_DtlR<Lot_Chk03_CndR,Schd_DtlR> createMap_Lot_Chk03_CndR_Schd_DtlR() {
		return new Map_Lot_Chk03_CndR_Schd_DtlR<Lot_Chk03_CndR, Schd_DtlR>();
	}

	public class Map_Lot_Chk03_CndR_Schd_DtlR<D extends Lot_Chk03_CndR, S extends Schd_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Lot_Chk03_CndR.$peg_no, Schd_DtlR.$peg_no);
			addColumnPathMap(Lot_Chk03_CndR.$itm_cd, Schd_DtlR.$bd_itm_cd);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub1, Schd_DtlR.$bd_itm_sub1);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub2, Schd_DtlR.$bd_itm_sub2);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub3, Schd_DtlR.$bd_itm_sub3);
			addColumnPathMap(Lot_Chk03_CndR.$lot_no, Schd_DtlR.$bd_lot_no);
			addColumnPathMap(Lot_Chk03_CndR.$sublot_no, Schd_DtlR.$bd_sublot_no);
			addColumnPathMap(Lot_Chk03_CndR.$err_flg, Schd_DtlR.$err_flg);
		}
	}
	/**
	 * PurcRet_RevUpd01オペレーション.<p>
	 *
	 * 仕入返品実績（改訂履歴）テーブルを更新する。改訂履歴データ更新用の共通処理（MAUCL5020）から呼び出される。<br>
	 */
	public class PurcRet_RevUpd01 extends MSBDL_PurcRetRegService_MC_A.PurcRet_RevUpd01 {

		MCList<MST_PURC_RET_ACT_R> _hCurrentL = MCList.create(MST_PURC_RET_ACT_R.class);
		MCList<MST_PURC_RET_ACT_D_R> _dCurrentL = MCList.create(MST_PURC_RET_ACT_D_R.class);
		MCList<MST_PURC_RET_ACT_IO_R> _ioCurrentL = MCList.create(MST_PURC_RET_ACT_IO_R.class);
		MCList<MST_PURC_RET_ACT_P_R> _hRevL = MCList.create(MST_PURC_RET_ACT_P_R.class);
		MCList<MST_PURC_RET_ACT_D_P_R> _dRevL = MCList.create(MST_PURC_RET_ACT_D_P_R.class);
		MCList<MST_PURC_RET_ACT_IO_P_R> _ioRevL = MCList.create(MST_PURC_RET_ACT_IO_P_R.class);

		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			wkInsert();
			selectCurrent();
			revisionInsOrUpd();
		}

		/**
		 * 上り電文の項目を本体・改訂履歴ヘッダーのワークテーブルに設定
		 */
		private void wkInsert() {
			MCList<MST_PURC_RET_ACT_R> wkL = MCList.create(MST_PURC_RET_ACT_R.class);
			for (RevData_Upd01_DtlR r : up0()) {
				MST_PURC_RET_ACT_R wkR = MST_PURC_RET_ACT_R.create();
				wkR.purc_ret_act_no(r.rev_data_src_no());
				wkL.add(wkR);
			}
			MST_PURC_RET_ACT_R wkL_t = MST_PURC_RET_ACT_R.create("T");
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(wkL_t);
			dbWkDelete("MSBDL5170_MSW_PURC_RET_ACT_D01", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBDL5170_MSW_PURC_RET_ACT_I01", wkL.groupBy(wkL_t.getKeyColumn()), wkL_bldr.getBaseDbc());
			

			MCList<MST_PURC_RET_ACT_P_R> wkpL = MCList.create(MST_PURC_RET_ACT_P_R.class);
			for (RevData_Upd01_DtlR r : up0()) {
				MST_PURC_RET_ACT_P_R wkpR = MST_PURC_RET_ACT_P_R.create();
				wkpR.purc_ret_act_no(r.rev_data_src_no());
				wkpR.purc_ret_act_rev(r.rev_no());
				wkpL.add(wkpR);
			}
			MST_PURC_RET_ACT_P_R wkpL_t = MST_PURC_RET_ACT_P_R.create("T");
			MCQueryApiBuilder wkpL_bldr = MCQueryApiBuilder.create(wkpL_t);
			dbWkDelete("MSBDL5170_MSW_PURC_RET_ACT_P_D01", wkpL_bldr.getBaseDbc());
			dbWkInsert("MSBDL5170_MSW_PURC_RET_ACT_P_I01", wkpL.groupBy(wkpL_t.getKeyColumn()), wkpL_bldr.getBaseDbc());
		}

		/**
		 * 本体テーブルと改訂履歴テーブルからリストを取得
		 */
		private void selectCurrent() {
			MSW_PURC_RET_ACT_KEY_R w1 = MSW_PURC_RET_ACT_KEY_R.create("W");

			MST_PURC_RET_ACT_R hCurrentL_t = MST_PURC_RET_ACT_R.create("T");
			MCQueryApiBuilder hCurrentL_bldr = MCQueryApiBuilder.create(hCurrentL_t);
			hCurrentL_bldr.addInnerJoin(w1,
					bracket(hCurrentL_t.purc_ret_act_no.eq(w1.purc_ret_act_no)));
			dbSelect("MSBDL5170_MST_PURC_RET_ACT_S03", _hCurrentL, hCurrentL_bldr);

			MST_PURC_RET_ACT_D_R dCurrentL_t = MST_PURC_RET_ACT_D_R.create("T");
			MCQueryApiBuilder dCurrentL_bldr = MCQueryApiBuilder.create(dCurrentL_t);
			dCurrentL_bldr.addInnerJoin(w1,
					bracket(dCurrentL_t.purc_ret_act_no.eq(w1.purc_ret_act_no)));
			dbSelect("MSBDL5170_MST_PURC_RET_ACT_D_S02", _dCurrentL, dCurrentL_bldr);

			MST_PURC_RET_ACT_IO_R ioCurrentL_t = MST_PURC_RET_ACT_IO_R.create("T");
			MCQueryApiBuilder ioCurrentL_bldr = MCQueryApiBuilder.create(ioCurrentL_t);
			ioCurrentL_bldr.addInnerJoin(w1,
					bracket(ioCurrentL_t.purc_ret_act_no.eq(w1.purc_ret_act_no)));
			dbSelect("MSBDL5170_MST_PURC_RET_ACT_IO_S02", _ioCurrentL, ioCurrentL_bldr);

			MSW_PURC_RET_ACT_P_KEY_R w2 = MSW_PURC_RET_ACT_P_KEY_R.create("W");

			MST_PURC_RET_ACT_P_R hRevL_t = MST_PURC_RET_ACT_P_R.create("T");
			MCQueryApiBuilder hRevL_bldr = MCQueryApiBuilder.create(hRevL_t);
			hRevL_bldr.addInnerJoin(w2,
					bracket(hRevL_t.purc_ret_act_no.eq(w2.purc_ret_act_no)
							.and(hRevL_t.purc_ret_act_rev.eq(w2.purc_ret_act_rev))));
			dbSelect("MSBDL5170_MST_PURC_RET_ACT_P_S01", _hRevL, hRevL_bldr);

			MST_PURC_RET_ACT_D_P_R dRevL_t = MST_PURC_RET_ACT_D_P_R.create("T");
			MCQueryApiBuilder dRevL_bldr = MCQueryApiBuilder.create(dRevL_t);
			dRevL_bldr.addInnerJoin(w2,
					bracket(dRevL_t.purc_ret_act_no.eq(w2.purc_ret_act_no)
							.and(dRevL_t.purc_ret_act_rev.eq(w2.purc_ret_act_rev))));
			dbSelect("MSBDL5170_MST_PURC_RET_ACT_D_P_S01", _dRevL, dRevL_bldr);

			MST_PURC_RET_ACT_IO_P_R ioRevL_t = MST_PURC_RET_ACT_IO_P_R.create("T");
			MCQueryApiBuilder ioRevL_bldr = MCQueryApiBuilder.create(ioRevL_t);
			ioRevL_bldr.addInnerJoin(w2,
					bracket(ioRevL_t.purc_ret_act_no.eq(w2.purc_ret_act_no)
							.and(ioRevL_t.purc_ret_act_rev.eq(w2.purc_ret_act_rev))));
			dbSelect("MSBDL5170_MST_PURC_RET_ACT_IO_P_S01", _ioRevL, ioRevL_bldr);
		}

		/**
		 * 本番テーブルのデータを元に、改訂履歴テーブルを追加または更新する。
		 */
		private void revisionInsOrUpd() {
			// ヘッダーの改訂履歴テーブルを追加または更新する。
			MCIndexKey hRevIdx = _hRevL.createIndex(MST_PURC_RET_ACT_P_R.$purc_ret_act_no, MST_PURC_RET_ACT_P_R.$purc_ret_act_rev);
			MCList<MST_PURC_RET_ACT_P_R> hUpd = MCList.create(MST_PURC_RET_ACT_P_R.class);
			MCList<MST_PURC_RET_ACT_P_R> hIns = MCList.create(MST_PURC_RET_ACT_P_R.class);

			for (MST_PURC_RET_ACT_R hcurrentR : _hCurrentL) {
				MST_PURC_RET_ACT_P_R tempRevR = MST_PURC_RET_ACT_P_R.create();
				tempRevR.setByName(hcurrentR);
				if (_hRevL == null || isNull(_hRevL.getFirst(hRevIdx, hcurrentR.purc_ret_act_no(), hcurrentR.purc_ret_act_rev()))) {
					hIns.add(tempRevR);
				}
				else {
					hUpd.add(tempRevR);
				}
			}
			if (!isNull(hIns)) {
				dbInsert("MSBDL5170_MST_PURC_RET_ACT_P_I01", hIns,
						MCQueryApiBuilder.create(MST_PURC_RET_ACT_P_R.create("T")));
			}
			if (!isNull(hUpd)) {
				MCQueryApiBuilder hUpd_bldr = MCQueryApiBuilder.create(MST_PURC_RET_ACT_P_R.create("T"));
				hUpd_bldr.removeSet(hUpd_bldr.getBaseDbc().getKeyColumn());
				dbUpdateKey("MSBDL5170_MST_PURC_RET_ACT_P_U01", hUpd, hUpd_bldr);
			}

			// 明細の改訂履歴テーブルを追加または更新する。
			MCIndexKey dRevIdx = _dRevL.createIndex(MST_PURC_RET_ACT_D_P_R.$purc_ret_act_d_no, MST_PURC_RET_ACT_D_P_R.$purc_ret_act_rev);
			MCIndexKey hCurrentIdx = _hCurrentL.createIndex(MST_PURC_RET_ACT_P_R.$purc_ret_act_no);
			MCList<MST_PURC_RET_ACT_D_P_R> dUpd = MCList.create(MST_PURC_RET_ACT_D_P_R.class);
			MCList<MST_PURC_RET_ACT_D_P_R> dIns = MCList.create(MST_PURC_RET_ACT_D_P_R.class);

			for (MST_PURC_RET_ACT_D_R dcurrentR : _dCurrentL) {
				MST_PURC_RET_ACT_D_P_R tempRevR = MST_PURC_RET_ACT_D_P_R.create();
				tempRevR.setByName(dcurrentR);

				// ヘッダーより改訂番号を取得
				MST_PURC_RET_ACT_R hCurrentR = _hCurrentL.getFirst(hCurrentIdx, dcurrentR.purc_ret_act_no());
				tempRevR.purc_ret_act_rev(hCurrentR.purc_ret_act_rev());
				if (_dRevL == null ||isNull(_dRevL.getFirst(dRevIdx, tempRevR.purc_ret_act_d_no(), tempRevR.purc_ret_act_rev()))) {
					dIns.add(tempRevR);
				}
				else {
					dUpd.add(tempRevR);
				}
			}
			if (!isNull(dIns)) {
				dbInsert("MSBDL5170_MST_PURC_RET_ACT_D_P_I01", dIns,
						MCQueryApiBuilder.create(MST_PURC_RET_ACT_D_P_R.create("T")));
			}
			if (!isNull(dUpd)) {
				MCQueryApiBuilder dUpd_bldr = MCQueryApiBuilder.create(MST_PURC_RET_ACT_D_P_R.create("T"));
				dUpd_bldr.removeSet(dUpd_bldr.getBaseDbc().getKeyColumn());
				dbUpdateKey("MSBDL5170_MST_PURC_RET_ACT_D_P_U01", dUpd, dUpd_bldr);
			}

			// 受払の改訂履歴テーブルを追加または更新する。
			MCIndexKey ioRevIdx = _ioRevL.createIndex(MST_PURC_RET_ACT_IO_P_R.$purc_ret_act_io_no, MST_PURC_RET_ACT_IO_P_R.$purc_ret_act_rev);
			MCList<MST_PURC_RET_ACT_IO_P_R> ioUpd = MCList.create(MST_PURC_RET_ACT_IO_P_R.class);
			MCList<MST_PURC_RET_ACT_IO_P_R> ioIns = MCList.create(MST_PURC_RET_ACT_IO_P_R.class);

			for (MST_PURC_RET_ACT_IO_R iocurrentR : _ioCurrentL) {
				MST_PURC_RET_ACT_IO_P_R tempRevR = MST_PURC_RET_ACT_IO_P_R.create();
				tempRevR.setByName(iocurrentR);

				// ヘッダーより改訂番号を取得
				MST_PURC_RET_ACT_R hCurrentR = _hCurrentL.getFirst(hCurrentIdx, iocurrentR.purc_ret_act_no());
				tempRevR.purc_ret_act_rev(hCurrentR.purc_ret_act_rev());
				if (_ioRevL == null ||isNull(_ioRevL.getFirst(ioRevIdx, tempRevR.purc_ret_act_io_no(), tempRevR.purc_ret_act_rev()))) {
					ioIns.add(tempRevR);
				}
				else {
					ioUpd.add(tempRevR);
				}
			}
			if (!isNull(ioIns)) {
				dbInsert("MSBDL5170_MST_PURC_RET_ACT_IO_P_I01", ioIns,
						MCQueryApiBuilder.create(MST_PURC_RET_ACT_IO_P_R.create("T")));
			}
			if (!isNull(ioUpd)) {
				MCQueryApiBuilder ioUpd_bldr = MCQueryApiBuilder.create(MST_PURC_RET_ACT_IO_P_R.create("T"));
				ioUpd_bldr.removeSet(ioUpd_bldr.getBaseDbc().getKeyColumn());
				dbUpdateKey("MSBDL5170_MST_PURC_RET_ACT_IO_P_U01", ioUpd, ioUpd_bldr);
			}
		}
	}

	//FMCB CUSTOM END
}