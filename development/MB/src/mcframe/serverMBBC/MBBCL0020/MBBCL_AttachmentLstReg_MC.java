package mcframe.serverMBBC.MBBCL0020;

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
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.serverMBBC.MBBCL0020.Query.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverMBBC.MBBCL5020.*;
import java.util.Map;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBCL_AttachmentLstReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBCL_AttachmentLstReg_MC extends MBBCL_AttachmentLstReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 添付ファイル情報を検索する<br>
	 */
	public class Srch01 extends MBBCL_AttachmentLstReg_MC_A.Srch01 {

		MCList<MBT_ATTACHMENT_R> _list = MCList.create(MBT_ATTACHMENT_R.class);

		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			executeQuery(_list, MBBCL0020_MBT_ATTACHMENT_S01(), up0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			cache();
			MCIndexKey idxList = _list.createIndex(Srch01_RsltR.$biz_typ,
					Srch01_RsltR.$biz_key1,
					Srch01_RsltR.$biz_key2, Srch01_RsltR.$biz_key3,
					Srch01_RsltR.$biz_key4, Srch01_RsltR.$biz_key5,
					Srch01_RsltR.$biz_key6, Srch01_RsltR.$biz_key7,
					Srch01_RsltR.$biz_key8, Srch01_RsltR.$biz_key9,
					Srch01_RsltR.$biz_key10, Srch01_RsltR.$amt);

			MBBCL_AttachService.createRptExtSysCache(up0());
			for (Srch01_RsltR r : up0().groupBy(getKeysUp())) {
				r.ext_sys_cd(MBBCL_AttachService.getCacheRptExtSysCd(r.biz_typ(), r.bp_cd(), r.dt()));
				MCList<MBT_ATTACHMENT_R> srcL = _list.subList(idxList, r.biz_typ(),
						r.biz_key1(), r.biz_key2(), r.biz_key3(), r.biz_key4(),
						r.biz_key5(), r.biz_key6(), r.biz_key7(), r.biz_key8(),
						r.biz_key9(), r.biz_key10(), r.amt());

				if (!srcL.isEmpty()) {
					for (MBT_ATTACHMENT_R src : srcL) {
						//マージ
						Srch01_RsltR r2 = r.clone();
						copyValue(r2, src, createMap_Srch01_RsltR_MBT_ATTACHMENT_R());
						compRow(r2);
						down0().add(r2);
					}
				}
				else {
					MAM_BP_R bpR = getCacheBp(r.bp_cd());
					if (!isNull(bpR)) {
						r.bp_nm(bpR.bp_nm());
					}
					MAM_CUR_R curR = getCacheCur(r.cur_cd());
					if (!isNull(curR)) {
						r.cur_nm(curR.cur_nm());
					}
					compRow(r);
					down0().add(r);
				}
			}
			down0().sort(Srch01_RsltR.$biz_key1, Srch01_RsltR.$biz_key2,
					Srch01_RsltR.$biz_key3, Srch01_RsltR.$biz_key4,
					Srch01_RsltR.$biz_key5, Srch01_RsltR.$biz_key6,
					Srch01_RsltR.$biz_key7, Srch01_RsltR.$biz_key8,
					Srch01_RsltR.$biz_key9, Srch01_RsltR.$biz_key10);
		}

		protected String[] getKeysUp() {
			return new String[] {
					Srch01_RsltR.$biz_typ,
					Srch01_RsltR.$biz_key1, Srch01_RsltR.$biz_key2,
					Srch01_RsltR.$biz_key3, Srch01_RsltR.$biz_key4,
					Srch01_RsltR.$biz_key5, Srch01_RsltR.$biz_key6,
					Srch01_RsltR.$biz_key7, Srch01_RsltR.$biz_key8,
					Srch01_RsltR.$biz_key9, Srch01_RsltR.$biz_key10, Srch01_RsltR.$dt,
					Srch01_RsltR.$bp_cd, Srch01_RsltR.$cur_cd, Srch01_RsltR.$amt,
					Srch01_RsltR.$wg_cd, Srch01_RsltR.$sls_dpt_cd,
					Srch01_RsltR.$purc_dpt_cd, Srch01_RsltR.$ar_dpt_cd,
					Srch01_RsltR.$bill_dpt_cd, Srch01_RsltR.$bsppl_dpt_cd, Srch01_RsltR.$dlv_cd,
					Srch01_RsltR.$dest_cd1, Srch01_RsltR.$dest_cd2,
					Srch01_RsltR.$dest_cd3, Srch01_RsltR.$cst_cd, Srch01_RsltR.$acst_cd,
					Srch01_RsltR.$bcst_cd, Srch01_RsltR.$sppl_cd, Srch01_RsltR.$asppl_cd,
					Srch01_RsltR.$bsppl_cd, Srch01_RsltR.$psppl_cd,
					Srch01_RsltR.$cntry_cd, Srch01_RsltR.$ptax_cur_cd,
					Srch01_RsltR.$wrk_no, Srch01_RsltR.$tterm_cd1,
					Srch01_RsltR.$tterm_cd2, Srch01_RsltR.$tterm_cd3,
					Srch01_RsltR.$edi_sub_char1, Srch01_RsltR.$edi_sub_char2,
					Srch01_RsltR.$edi_sub_char3, Srch01_RsltR.$edi_sub_char4,
					Srch01_RsltR.$edi_sub_char5
			};
		}

		protected void compRow(Srch01_RsltR r) {
			if (!r.archive_flg()) {
				//保存先・ファイル名
				if(isNull(r.file_path())) {
					MAM_REPORT_STRG_PATH_R pathR = getCacheRptPath(r.biz_typ(), r.bp_cd());
					if (!isNull(pathR)) {
						r.file_path(MBBCL_AttachService.convPlaceHolder(pathR.report_strg_path(), r));
					}
				}
				if(isNull(r.file_nm())) {
					MAM_REPORT_FILE_NM_R nmR = getCacheRptFileNm(r.biz_typ());
					if (!isNull(nmR)) {
						r.file_nm(MBBCL_AttachService.getRptFileNm(r, nmR));
					}
				}
			}
			else {
				String extSysCd = MBBCL_AttachService.getCacheRptExtSysCd(r.biz_typ(), r.bp_cd(), r.dt());
				if (isPdfFile(r)) {
					r.preview_url(getPreviewUrl(extSysCd, r.doc_id()));
				}
			}
			MAM_EXT_SYS_R extSysR = getCacheExtSys(r.ext_sys_cd());
			if (!isNull(extSysR)) {
				r.fs_flg(!extSysR.web_api_flg());
			}
		}

		protected boolean isPdfFile(Srch01_RsltR r) {
			return r.file_nm().toLowerCase().endsWith(".pdf");
		}

		protected String getPreviewUrl(String extSysCd, String docId) {
			Map<String, String> extParams = MBBCL_AttachService.getExtParaMap(extSysCd);
			String webUrl = extParams.get("web_url");
			if (isNull(webUrl)) {
				return null;
			}
			return generatePreviewUrl(webUrl, docId);
		}

		private String generatePreviewUrl(String url, String docId) {
			return url.replaceAll("service$", "preview.jsp?docId=") + docId;
		}

		protected void cache() {
			createBpCache();
			createRptFileNmCache();
			createRptPathCache();
			createCurCache();
			createExtSysCache();
		}

		protected Map_Srch01_RsltR_MBT_ATTACHMENT_R<Srch01_RsltR,MBT_ATTACHMENT_R> createMap_Srch01_RsltR_MBT_ATTACHMENT_R() {
			return new Map_Srch01_RsltR_MBT_ATTACHMENT_R<Srch01_RsltR, MBT_ATTACHMENT_R>();
		}

		public class Map_Srch01_RsltR_MBT_ATTACHMENT_R<D extends Srch01_RsltR, S extends MBT_ATTACHMENT_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_RsltR.$archive_flg, MBT_ATTACHMENT_R.$archive_flg);
				addColumnPathMap(Srch01_RsltR.$data_no, MBT_ATTACHMENT_R.$data_no);
				addColumnPathMap(Srch01_RsltR.$edition, MBT_ATTACHMENT_R.$edition);
				addColumnPathMap(Srch01_RsltR.$rmrks1, MBT_ATTACHMENT_R.$rmrks1);
				addColumnPathMap(Srch01_RsltR.$rmrks2, MBT_ATTACHMENT_R.$rmrks2);
				addColumnPathMap(Srch01_RsltR.$rmrks3, MBT_ATTACHMENT_R.$rmrks3);
				addColumnPathMap(Srch01_RsltR.$rmrks4, MBT_ATTACHMENT_R.$rmrks4);
				addColumnPathMap(Srch01_RsltR.$rmrks5, MBT_ATTACHMENT_R.$rmrks5);
				addColumnPathMap(Srch01_RsltR.$file_path, MBT_ATTACHMENT_R.$file_path);
				addColumnPathMap(Srch01_RsltR.$file_nm, MBT_ATTACHMENT_R.$file_nm);
				addColumnPathMap(Srch01_RsltR.$rpt_attr1, MBT_ATTACHMENT_R.$rpt_attr1);
				addColumnPathMap(Srch01_RsltR.$rpt_attr2, MBT_ATTACHMENT_R.$rpt_attr2);
				addColumnPathMap(Srch01_RsltR.$rpt_attr3, MBT_ATTACHMENT_R.$rpt_attr3);
				addColumnPathMap(Srch01_RsltR.$rpt_attr4, MBT_ATTACHMENT_R.$rpt_attr4);
				addColumnPathMap(Srch01_RsltR.$rpt_attr5, MBT_ATTACHMENT_R.$rpt_attr5);
				addColumnPathMap(Srch01_RsltR.$rpt_attr6, MBT_ATTACHMENT_R.$rpt_attr6);
				addColumnPathMap(Srch01_RsltR.$rpt_attr7, MBT_ATTACHMENT_R.$rpt_attr7);
				addColumnPathMap(Srch01_RsltR.$rpt_attr8, MBT_ATTACHMENT_R.$rpt_attr8);
				addColumnPathMap(Srch01_RsltR.$rpt_attr9, MBT_ATTACHMENT_R.$rpt_attr9);
				addColumnPathMap(Srch01_RsltR.$rpt_attr10, MBT_ATTACHMENT_R.$rpt_attr10);
				addColumnPathMap(Srch01_RsltR.$rpt_attr11, MBT_ATTACHMENT_R.$rpt_attr11);
				addColumnPathMap(Srch01_RsltR.$rpt_attr12, MBT_ATTACHMENT_R.$rpt_attr12);
				addColumnPathMap(Srch01_RsltR.$rpt_attr13, MBT_ATTACHMENT_R.$rpt_attr13);
				addColumnPathMap(Srch01_RsltR.$rpt_attr14, MBT_ATTACHMENT_R.$rpt_attr14);
				addColumnPathMap(Srch01_RsltR.$rpt_attr15, MBT_ATTACHMENT_R.$rpt_attr15);
				addColumnPathMap(Srch01_RsltR.$rpt_attr16, MBT_ATTACHMENT_R.$rpt_attr16);
				addColumnPathMap(Srch01_RsltR.$rpt_attr17, MBT_ATTACHMENT_R.$rpt_attr17);
				addColumnPathMap(Srch01_RsltR.$rpt_attr18, MBT_ATTACHMENT_R.$rpt_attr18);
				addColumnPathMap(Srch01_RsltR.$rpt_attr19, MBT_ATTACHMENT_R.$rpt_attr19);
				addColumnPathMap(Srch01_RsltR.$rpt_attr20, MBT_ATTACHMENT_R.$rpt_attr20);
				addColumnPathMap(Srch01_RsltR.$ins_usr_id, MBT_ATTACHMENT_R.$ins_usr_id);
				addColumnPathMap(Srch01_RsltR.$ins_usr_nm, MBT_ATTACHMENT_R.$ins_usr_nm);
				addColumnPathMap(Srch01_RsltR.$ins_func_id, MBT_ATTACHMENT_R.$ins_func_id);
				addColumnPathMap(Srch01_RsltR.$ins_ts, MBT_ATTACHMENT_R.$ins_ts);
				addColumnPathMap(Srch01_RsltR.$upd_usr_id, MBT_ATTACHMENT_R.$upd_usr_id);
				addColumnPathMap(Srch01_RsltR.$upd_usr_nm, MBT_ATTACHMENT_R.$upd_usr_nm);
				addColumnPathMap(Srch01_RsltR.$upd_func_id, MBT_ATTACHMENT_R.$upd_func_id);
				addColumnPathMap(Srch01_RsltR.$upd_ts, MBT_ATTACHMENT_R.$upd_ts);
				addColumnPathMap(Srch01_RsltR.$upd_srv_req_no, MBT_ATTACHMENT_R.$upd_srv_req_no);
				addColumnPathMap(Srch01_RsltR.$upd_cntr, MBT_ATTACHMENT_R.$upd_cntr);
				addColumnPathMap(Srch01_RsltR.$data_crud_typ, MBT_ATTACHMENT_R.$data_crud_typ);
				addColumnPathMap(Srch01_RsltR.$doc_id, MBT_ATTACHMENT_R.$doc_id);

			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				if (isNull(dest.bp_cd())) {
					dest.bp_cd(src.bp_cd());
				}
				if (isNull(dest.bp_nm())) {
					dest.bp_nm(src.getStringNE(Srch01_RsltR.$bp_nm));
				}
				if (isNull(dest.dt())) {
					dest.dt(src.dt());
				}
				
				if (isNull(dest.cur_cd())) {
					dest.cur_cd(src.cur_cd());
				}
				if (isNull(dest.cur_nm())) {
					dest.cur_nm(src.getStringNE(Srch01_RsltR.$cur_nm));
				}
				if (isNull(dest.amt())) {
					dest.amt(src.amt());
				}
				if (isNull(dest.ext_sys_cd())) {
					dest.ext_sys_cd(src.getStringNE(Srch01_RsltR.$ext_sys_cd));
				}
			}
		}

		/**
		 * キャッシュ（取引先マスタ）
		 */
		protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBp;
		protected void createBpCache() {
			MCList<Srch01_RsltR> bindL = up0().groupBy(MAM_BP_R.$bp_cd);
			MAM_BP_R t = MAM_BP_R.create();
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.bp_cd, t.bp_nm, t.del_flg);
			_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(bldr, bindL, MAM_BP_R.$bp_cd);
		}
		protected MAM_BP_R getCacheBp(String bpCd) {
			MAM_BP_R r = _cacheBp.get(bpCd);
			if (!isNull(r.bp_cd()) && !r.del_flg()) {
				return r;
			}
			return null;
		}

		/**
		 * キャッシュ（帳票ファイル名称マスタ）
		 */
		protected FXUCL_MCDbcCache<MAM_REPORT_FILE_NM_R> _cacheRptFileNm;
		protected void createRptFileNmCache() {
			MCList<Srch01_RsltR> bindL = up0().groupBy(MAM_REPORT_FILE_NM_R.$biz_typ);
			MAM_REPORT_FILE_NM_R t = MAM_REPORT_FILE_NM_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.biz_typ, t.rpt_nm_elm_typ1, t.rpt_nm_elm_typ2,
					t.rpt_nm_elm_typ3, t.rpt_nm_elm_typ4, t.rpt_nm_elm_typ5,
					t.rpt_nm_elm_typ6, t.rpt_nm_elm_typ7, t.rpt_nm_elm_typ8,
					t.rpt_nm_elm_typ9, t.rpt_nm_elm_typ10, t.del_flg);
			_cacheRptFileNm = new FXUCL_MCDbcCache<MAM_REPORT_FILE_NM_R>(bldr, bindL,
					MAM_REPORT_FILE_NM_R.$biz_typ);
		}
		protected MAM_REPORT_FILE_NM_R getCacheRptFileNm(String bizTyp) {
			MAM_REPORT_FILE_NM_R r = _cacheRptFileNm.get(bizTyp);
			if (!isNull(r.biz_typ()) && !r.del_flg()) {
				return r;
			}
			return null;
		}

		/**
		 * キャッシュ（帳票保存先マスタ）
		 */
		protected FXUCL_MCDbcCache<MAM_REPORT_STRG_PATH_R> _cacheRptPath;
		protected void createRptPathCache() {
			MCList<Srch01_RsltR> bindL = up0().groupBy(MAM_REPORT_STRG_PATH_R.$biz_typ,
					MAM_REPORT_STRG_PATH_R.$bp_cd);
			MCList<Srch01_RsltR> bizL = bindL.groupBy(MAM_REPORT_STRG_PATH_R.$biz_typ);
			bizL.setStringNE(MAM_REPORT_STRG_PATH_R.$bp_cd, MAC_STR.NULL_VAL.value());
			bindL.addAll(bizL);
			MCList<Srch01_RsltR> bpL = bindL.groupBy(MAM_REPORT_STRG_PATH_R.$bp_cd);
			bpL.setStringNE(MAM_REPORT_STRG_PATH_R.$biz_typ, MAC_STR.NULL_VAL.value());
			bindL.addAll(bpL);
			Srch01_RsltR r = bindL.createRow();
			r.biz_typ(MAC_STR.NULL_VAL.value());
			r.bp_cd(MAC_STR.NULL_VAL.value());
			bindL.add(r);
			MAM_REPORT_STRG_PATH_R t = MAM_REPORT_STRG_PATH_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.biz_typ, t.bp_cd, t.report_strg_path, t.del_flg);
			_cacheRptPath = new FXUCL_MCDbcCache<MAM_REPORT_STRG_PATH_R>(bldr, bindL,
					MAM_REPORT_STRG_PATH_R.$biz_typ, MAM_REPORT_STRG_PATH_R.$bp_cd);
		}
		protected MAM_REPORT_STRG_PATH_R getCacheRptPath(String bizTyp, String bpCd) {
			MAM_REPORT_STRG_PATH_R r = _cacheRptPath.get(bizTyp, bpCd);
			if (!isNull(r.biz_typ()) && !r.del_flg()) {
				return r;
			}
			r = _cacheRptPath.get(bizTyp, MAC_STR.NULL_VAL.value());
			if (!isNull(r.biz_typ()) && !r.del_flg()) {
				return r;
			}
			r = _cacheRptPath.get(MAC_STR.NULL_VAL.value(), bpCd);
			if (!isNull(r.biz_typ()) && !r.del_flg()) {
				return r;
			}
			r = _cacheRptPath.get(MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value());
			if (!isNull(r.biz_typ()) && !r.del_flg()) {
				return r;
			}
			return null;
		}

		/**
		 * キャッシュ（通貨マスタ）
		 */
		protected FXUCL_MCDbcCache<MAM_CUR_R> _cacheCur;
		protected void createCurCache() {
			MCList<Srch01_RsltR> bindL = up0().groupBy(MAM_CUR_R.$cur_cd);
			MAM_CUR_R t = MAM_CUR_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.cur_cd, t.cur_nm, t.del_flg);
			_cacheCur = new FXUCL_MCDbcCache<MAM_CUR_R>(bldr, bindL, MAM_CUR_R.$cur_cd);
		}
		protected MAM_CUR_R getCacheCur(String curCd) {
			MAM_CUR_R r = _cacheCur.get(curCd);
			if (!isNull(r.cur_cd()) && !r.del_flg()) {
				return r;
			}
			return null;
		}

		/**
		 * キャッシュ（外部システムマスタ）
		 */
		protected FXUCL_MCDbcCache<MAM_EXT_SYS_R> _cacheExtSys;
		protected void createExtSysCache() {
			MCList<Srch01_RsltR> bindL = up0().groupBy(MAM_EXT_SYS_R.$ext_sys_cd);
			MAM_EXT_SYS_R t = MAM_EXT_SYS_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.ext_sys_cd, t.web_api_flg, t.del_flg);
			_cacheExtSys = new FXUCL_MCDbcCache<MAM_EXT_SYS_R>(bldr, bindL,
					MAM_EXT_SYS_R.$ext_sys_cd);
		}
		protected MAM_EXT_SYS_R getCacheExtSys(String extSysCd) {
			MAM_EXT_SYS_R r = _cacheExtSys.get(extSysCd);
			if (!isNull(r.ext_sys_cd()) && !r.del_flg()) {
				return r;
			}
			return null;
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 添付ファイル情報を登録または更新する<br>
	 */
	public class Upd01 extends MBBCL_AttachmentLstReg_MC_A.Upd01 {
		@Override
		protected void call() {
			try {
				setPegNo(up0());
				mapUpContainers(AT);
				so01.up1().upd_cntr_chk_flg(true);
				so01.exec();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}

		protected void setDown() {
			MCIndexKey idxkey = so01.down0().createIndex(Attach_Chk01_DtlR.$peg_no);
			for (Upd01_DtlR r : up0()) {
				Attach_Chk01_DtlR down = so01.down0().getFirst(idxkey, r.peg_no());
				if (down == null) {
					continue;
				}
				else if (down.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
				else {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
			down0().setAll(up0());
		}
	}

	//FMCB CUSTOM END
}