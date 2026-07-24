package mcframe.serverMABC.MABCL0810;

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
import mcframe.serverMABC.MABCL0810.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_NumPtnReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_NumPtnReg_MC extends MABCL_NumPtnReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * NumPtn_UpdChk01オペレーション.<p>
	 *
	 * 発番パタンマスタの登録前のチェックを行います。<br>
	 */
	public class NumPtn_UpdChk01 extends MABCL_NumPtnReg_MC_A.NumPtn_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(NumPtn_UpdChk01_DtlR r : up0()){
				if (isNotCd(r.num_ptn_cd())){
					msgList.add(new MCMessage(r, NumPtn_UpdChk01_DtlR.$num_ptn_cd, MABCL0306, 
									getLabel(r, NumPtn_UpdChk01_DtlR.$num_ptn_cd), r.num_ptn_cd(), toDispGUIIndex(r)));
					continue;
				}
				if (r.del_flg()) {
					continue ;
				}
				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				//SEQがある場合はデフォルトシーケンス区分は必須。
				if (hasSeq(r)) {
					if (isNull(r.def_seq_typ())) {
						msgList.add(new MCMessage(r, null, MABCL0166, toDispGUIIndex(r)));
					}
				}
				checkKeyDigit(msgList, r);
				checkSumDigit(msgList, r);
			}
			return msgList;
		}
		
		/**
		 * 「キー項目桁数」のチェック
		 * <P>
		 * 「キー項目桁数」は、「SEQより前の要素の桁の合計」以下でなければならない。<br>
		 * 「キー項目桁数」は、「要素の桁の合計」以下でなければならない。
		 * 
		 */
		protected void checkKeyDigit(MCMessageList m, NumPtn_UpdChk01_DtlR r) {
			
			MCNumber k = r.key_dgt();
			MCNumber s = MCNumber.ZERO;
			
			if(!isNull(k)){
				if(hasSeq(r)){
					s = getSumDigitforSeq(r, true, false);
					if (s.lt(k)) {m.add( new MCMessage(r, null,MABCL0167,k,s, toDispGUIIndex(r)));}	
				}else{	
					s = getSumDigitforSeq(r, false, false);
					if (s.lt(k)) {m.add( new MCMessage(r, null,MABCL0168,k,s, toDispGUIIndex(r)));	}
				}
			}
		}
		
		/**
		 * 「要素の桁の合計」のチェック
		 * <P>
		 * 「要素の表示桁の合計」は、１以上でなければならない。<br>
		 * 「要素の表示桁の合計」は、業務区分の属性length以下でなければならない。<br>
		 * 「要素の表示桁の合計」は、「定数 発番桁数」disp以下でなければならない。<br>
		 * 「要素の桁の合計」は、「定数 発番桁数」undisp以下でなければならない。
		 * 
		 */
		protected void checkSumDigit(MCMessageList m, NumPtn_UpdChk01_DtlR r) {
			
			MCNumber s = getSumDigitforSeq(r, false, true);
			MCNumber us = getSumDigitforSeq(r, true, false);
			
			if (s.lt(MCNumber.ONE)) {
				m.add( new MCMessage(r, null,MABCL0169, us, us.subtract(s), toDispGUIIndex(r)));
			}	
			
			MAC_NUM_BIZ_TYP bizTyp = MAC_NUM_BIZ_TYP.get(r.num_biz_typ());
			
			MCNumber ml = bizTyp.length();
			if (ml.lt(s)) {
				m.add( new MCMessage(r, null,MABCL0170, ml, s, toDispGUIIndex(r)));
				return;
			}
			
			MCNumber d = MAC_NUM_DGT.DISP.value();
			MCNumber ud = MAC_NUM_DGT.UNDISP.value();
			if (d.lt(s)) {
				m.add( new MCMessage(r, null,MABCL0171,  d, s, toDispGUIIndex(r)));
			}
			else if(ud.lt(us)){
				m.add( new MCMessage(r, null,MABCL0172, ud, us, toDispGUIIndex(r)));
			}
		}
	}
	
	protected boolean hasSeq(NumPtn_UpdChk01_DtlR row){
		return 0 < seqCnt(row);
	}
	
	protected int seqCnt(NumPtn_UpdChk01_DtlR row){
		int cnt = 0;
		for(String d: getColsForEmpTyp()){
			if(MAC_ELM_TYP.isSEQ(row.getString(d))){
				cnt++;
			}
		}
		return cnt;
	}

	/**要素区分の表示合計桁数を取得します。*/
	protected MCNumber getSumDigitforSeq(NumPtn_UpdChk01_DtlR r, Boolean seqFlg, Boolean dispFlg){
		MCNumber sum = MCNumber.ZERO;
		int i = 1;
		for(String d: getColsForEmpTyp()){
			if (seqFlg) {
				// SEQ(連番)が含まれない
				if(MAC_ELM_TYP.isSEQ(r.getString(d))){
					i++;
					continue;
				}
			}
			if (dispFlg) {
				// 非表示フラグ
				StringBuilder sbFlg = new StringBuilder();
				sbFlg.append("undisp_flg");
				sbFlg.append(i);
				String columnFlg = sbFlg.toString();
				if (r.getBoolean(columnFlg)) {
					sum = sum.add(MCNumber.ZERO);
					i++;
					continue;
				}
			}

			// 桁数
			StringBuilder sbDgt = new StringBuilder();
			sbDgt.append("elm_dgt");
			sbDgt.append(i);
			String columnDgt = sbDgt.toString();
			// 固定値
			StringBuilder sbFix = new StringBuilder();
			sbFix.append("fix");
			sbFix.append(i);
			String columnFix = sbFix.toString();
			
			String elmValue = r.getString(d);
			MCNumber dgtValue = r.getNumber(columnDgt);
			String fixValue = r.getString(columnFix);
			sum = sum.add(getDigit(elmValue, dgtValue, fixValue));
			i++;
		}
		return sum;
	}

	public MCNumber getDigit(String elmTypValue, MCNumber dgt, String fixS) {

		final MCNumber noMatchValue = MCNumber.ZERO;

		/*
		 * elm_typがnullの場合 0を返す。
		 */
		if (elmTypValue == null){
			return noMatchValue;
		}
		
		MAC_ELM_TYP ptn = MAC_ELM_TYP.get(elmTypValue);

		/*
		 * 固定桁指定のelm_typであれば、 MAC_ELM_TYPに設定された桁を返す。 例（YYYYだと4を返す）
		 */
		if (MAC_DGT_TYP.isFIX_DGT(ptn.dgt_typ())) {
			return ptn.fix_dgt();
		}
		/*
		 * elm_digit指定のelm_typであれば、 elm_digitを返す。
		 */
		else if (MAC_DGT_TYP.isELM_DGT(ptn.dgt_typ())) {
			
			if (!isNull(dgt)) {
				return dgt;
			}
			else {
				return noMatchValue;
			}
		}
		/*
		 * 文字数桁のelm_typであれば、 文字数を返す。 例(FIXでAAAだと3を返す）
		 */
		else if (MAC_DGT_TYP.isCHAR_CNT(ptn.dgt_typ())) {

			if (!isNull(fixS)) {
				return new MCNumber(fixS.length());
			}
			else {
				return noMatchValue;
			}
		}
		/*
		 * それ以外は、0を返す。
		 */
		else {
			return noMatchValue;
		}
	}

	protected String[] getColsForEmpTyp() {
		return new String[] {
				"elm_typ1",
				"elm_typ2",
				"elm_typ3",
				"elm_typ4",
				"elm_typ5",
				"elm_typ6",
				"elm_typ7",
				"elm_typ8",
				"elm_typ9",
				"elm_typ10"
		};
	}
	
	/**
	 * NumPtn_Upd01オペレーション.<p>
	 *
	 * 発番パタンマスタの登録を行います。<br>
	 */
	public class NumPtn_Upd01 extends MABCL_NumPtnReg_MC_A.NumPtn_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * NumPtnLcl_UpdChk01オペレーション.<p>
	 *
	 * 発番パタンマスタ(ロケール別情報)を登録する前のチェックをする。<br>
	 */
	public class NumPtnLcl_UpdChk01 extends MABCL_NumPtnReg_MC_A.NumPtnLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * NumPtnLcl_Upd01オペレーション.<p>
	 *
	 * 発番パタンマスタ(ロケール別情報)を登録する。<br>
	 */
	public class NumPtnLcl_Upd01 extends MABCL_NumPtnReg_MC_A.NumPtnLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 発番パタンマスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_NumPtnReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void down_SELECT_c0_0(Srch01_RsltR r_dest, MAM_NUM_PTN_R r_src) {
			super.down_SELECT_c0_0(r_dest, r_src);

			MAC_NUM_BIZ_TYP typ = MAC_NUM_BIZ_TYP.getNE(r_src.num_biz_typ());
			if (typ != null) {
				r_dest.max_digit(typ.length());
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 発番パタンマスタの登録を行います。<br>
	 */
	public class Upd01 extends MABCL_NumPtnReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * NumPtn_DelChk01オペレーション.<p>
	 *
	 * 発番パタンマスタの削除前のチェックを行います。<br>
	 */
	public class NumPtn_DelChk01 extends MABCL_NumPtnReg_MC_A.NumPtn_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * NumPtn_Del01オペレーション.<p>
	 *
	 * 発番パタンマスタの削除を行います。<br>
	 */
	public class NumPtn_Del01 extends MABCL_NumPtnReg_MC_A.NumPtn_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 発番パタンマスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_NumPtnReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}