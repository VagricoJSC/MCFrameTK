package mcframe.serverMSBE.MSBEL5270;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MSBEL_ProvActService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_ProvActService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBEL5270";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_ProvActService.ProvAct_Chk01 aProvAct_Chk01;

	protected void initProvAct_Chk01() {
		this.info = PDef.MS_MSBEL5270_ProvAct_Chk01_INFO;
		this.aProvAct_Chk01 = ((MSBEL_ProvActService)this).new ProvAct_Chk01();
	}

	public static MSBEL_ProvActService.ProvAct_Chk01 crtProvAct_Chk01() {
		MSBEL_ProvActService lgc = new MSBEL_ProvActService();
		lgc.initProvAct_Chk01();
		return lgc.aProvAct_Chk01;
	}

	protected void paramProvAct_Chk01(MCParam p) {
		if (this.aProvAct_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aProvAct_Chk01.up0());
		p.addUpBlock(aProvAct_Chk01.up1());
		p.addDownBlock(aProvAct_Chk01.down0());
	}

	protected void doProvAct_Chk01() {
		aProvAct_Chk01.call();
	};

	/**
	 * ProvActChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5270.ProvActChk01_DtlR createProvActChk01_DtlR(){
		return mcframe.serverMSBE.MSBEL5270.ProvActChk01_DtlR.create();
	}

	/**
	 * ProvActChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5270.ProvActChk01_DtlR> createProvActChk01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5270.ProvActChk01_DtlR.class);
	}

	/**
	 * ProvActUpd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5270.ProvActUpd01_CndR createProvActUpd01_CndR(){
		return mcframe.serverMSBE.MSBEL5270.ProvActUpd01_CndR.create();
	}
	protected MSBEL_ProvActService.ProvAct_Upd01 aProvAct_Upd01;

	protected void initProvAct_Upd01() {
		this.info = PDef.MS_MSBEL5270_ProvAct_Upd01_INFO;
		this.aProvAct_Upd01 = ((MSBEL_ProvActService)this).new ProvAct_Upd01();
	}

	public static MSBEL_ProvActService.ProvAct_Upd01 crtProvAct_Upd01() {
		MSBEL_ProvActService lgc = new MSBEL_ProvActService();
		lgc.initProvAct_Upd01();
		return lgc.aProvAct_Upd01;
	}

	protected void paramProvAct_Upd01(MCParam p) {
		if (this.aProvAct_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aProvAct_Upd01.up0());
		p.addUpBlock(aProvAct_Upd01.up1());
		p.addDownBlock(aProvAct_Upd01.down0());
	}

	protected void doProvAct_Upd01() {
		aProvAct_Upd01.call();
	};

	/**
	 * ProvActUpd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5270.ProvActUpd01_DtlR createProvActUpd01_DtlR(){
		return mcframe.serverMSBE.MSBEL5270.ProvActUpd01_DtlR.create();
	}

	/**
	 * ProvActUpd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5270.ProvActUpd01_DtlR> createProvActUpd01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5270.ProvActUpd01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ProvAct_Chk01オペレーション.<p>
	 *
	 * 支給予定のマスタ補完が可能かチェックする<br>
	 */
	abstract public class ProvAct_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ProvAct_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5270.ProvActChk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5270.ProvActUpd01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5270.ProvActChk01_DtlR> down0;
		
		
		// コンストラクタ
		protected ProvAct_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5270.ProvActChk01_DtlR.class);
			up1 = mcframe.serverMSBE.MSBEL5270.ProvActUpd01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5270.ProvActChk01_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_ProvActService)MSBEL_ProvActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ProvActChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5270.ProvActChk01_DtlR createProvActChk01_DtlR(){
			return mcframe.serverMSBE.MSBEL5270.ProvActChk01_DtlR.create();
		}

		/**
		 * ProvActChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5270.ProvActChk01_DtlR> createProvActChk01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5270.ProvActChk01_DtlR.class);
		}

		/**
		 * ProvActUpd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5270.ProvActUpd01_CndR createProvActUpd01_CndR(){
			return mcframe.serverMSBE.MSBEL5270.ProvActUpd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>accpt_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_no1</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_no2</td></tr>
		 * 	<tr><td><br></td><td>prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>prov_src_act_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_src_act_no</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>prsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5270.ProvActChk01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>upd_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_out_flg</td></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5270.ProvActUpd01_CndR
		 */
		public mcframe.serverMSBE.MSBEL5270.ProvActUpd01_CndR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5270.ProvActChk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ProvActService)MSBEL_ProvActService_MC_A.this).info;
		}


	}
	/**
	 * ProvAct_Upd01オペレーション.<p>
	 *
	 * 支給実績にデータを登録する。支給実績のデータを更新削除する。<br>
	 */
	abstract public class ProvAct_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ProvAct_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5270.ProvActUpd01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5270.ProvActUpd01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5270.ProvActUpd01_DtlR> down0;
		
		
		// コンストラクタ
		protected ProvAct_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5270.ProvActUpd01_DtlR.class);
			up1 = mcframe.serverMSBE.MSBEL5270.ProvActUpd01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5270.ProvActUpd01_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_ProvActService)MSBEL_ProvActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ProvActUpd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5270.ProvActUpd01_DtlR createProvActUpd01_DtlR(){
			return mcframe.serverMSBE.MSBEL5270.ProvActUpd01_DtlR.create();
		}

		/**
		 * ProvActUpd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5270.ProvActUpd01_DtlR> createProvActUpd01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5270.ProvActUpd01_DtlR.class);
		}

		/**
		 * ProvActUpd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5270.ProvActUpd01_CndR createProvActUpd01_CndR(){
			return mcframe.serverMSBE.MSBEL5270.ProvActUpd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>not_completion_flg</td></tr>
		 * 	<tr><td><br></td><td>pa.prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_no1</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_no2</td></tr>
		 * 	<tr><td><br></td><td>pa.prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>pa.prov_src_act_typ</td></tr>
		 * 	<tr><td><br></td><td>pa.prov_src_act_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>pa.xfr_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pa.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pa.accpt_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>pa.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>pa.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.prsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.prov_typ</td></tr>
		 * 	<tr><td><br></td><td>pa.prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>pa.xrate</td></tr>
		 * 	<tr><td><br></td><td>pa.ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pa.wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>pa.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>pa.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>pa.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>pa.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.lot_no</td></tr>
		 * 	<tr><td><br></td><td>pa.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>pa.sno1</td></tr>
		 * 	<tr><td><br></td><td>pa.sno2</td></tr>
		 * 	<tr><td><br></td><td>pa.sno3</td></tr>
		 * 	<tr><td><br></td><td>pa.sno4</td></tr>
		 * 	<tr><td><br></td><td>pa.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>pa.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>pa.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>pa.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pa.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pa.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pa.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pa.base_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5270.ProvActUpd01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>upd_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_out_flg</td></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5270.ProvActUpd01_CndR
		 */
		public mcframe.serverMSBE.MSBEL5270.ProvActUpd01_CndR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>pa.prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>pa.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>pa.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>pa.prov_typ</td></tr>
		 * 	<tr><td><br></td><td>pa.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>pa.stk_bp_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5270.ProvActUpd01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ProvActService)MSBEL_ProvActService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}