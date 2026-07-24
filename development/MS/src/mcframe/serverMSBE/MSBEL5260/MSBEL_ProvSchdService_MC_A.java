package mcframe.serverMSBE.MSBEL5260;

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
 * "MSBEL_ProvSchdService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_ProvSchdService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBEL5260";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_ProvSchdService.ProvSchd_Upd01 aProvSchd_Upd01;

	protected void initProvSchd_Upd01() {
		this.info = PDef.MS_MSBEL5260_ProvSchd_Upd01_INFO;
		this.aProvSchd_Upd01 = ((MSBEL_ProvSchdService)this).new ProvSchd_Upd01();
	}

	public static MSBEL_ProvSchdService.ProvSchd_Upd01 crtProvSchd_Upd01() {
		MSBEL_ProvSchdService lgc = new MSBEL_ProvSchdService();
		lgc.initProvSchd_Upd01();
		return lgc.aProvSchd_Upd01;
	}

	protected void paramProvSchd_Upd01(MCParam p) {
		if (this.aProvSchd_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aProvSchd_Upd01.up0());
		p.addDownBlock(aProvSchd_Upd01.down0());
	}

	protected void doProvSchd_Upd01() {
		aProvSchd_Upd01.call();
	};

	/**
	 * ProvSchd_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR createProvSchd_DtlR(){
		return mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR.create();
	}

	/**
	 * ProvSchd_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR> createProvSchd_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR.class);
	}
	protected MSBEL_ProvSchdService.ProvSchd_Chk01 aProvSchd_Chk01;

	protected void initProvSchd_Chk01() {
		this.info = PDef.MS_MSBEL5260_ProvSchd_Chk01_INFO;
		this.aProvSchd_Chk01 = ((MSBEL_ProvSchdService)this).new ProvSchd_Chk01();
	}

	public static MSBEL_ProvSchdService.ProvSchd_Chk01 crtProvSchd_Chk01() {
		MSBEL_ProvSchdService lgc = new MSBEL_ProvSchdService();
		lgc.initProvSchd_Chk01();
		return lgc.aProvSchd_Chk01;
	}

	protected void paramProvSchd_Chk01(MCParam p) {
		if (this.aProvSchd_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aProvSchd_Chk01.up0());
		p.addDownBlock(aProvSchd_Chk01.down0());
	}

	protected void doProvSchd_Chk01() {
		aProvSchd_Chk01.call();
	};

	/**
	 * ProvSchdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR createProvSchdChk01_DtlR(){
		return mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR.create();
	}

	/**
	 * ProvSchdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR> createProvSchdChk01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR.class);
	}
	protected MSBEL_ProvSchdService.ProvSchd_Sprt01 aProvSchd_Sprt01;

	protected void initProvSchd_Sprt01() {
		this.info = PDef.MS_MSBEL5260_ProvSchd_Sprt01_INFO;
		this.aProvSchd_Sprt01 = ((MSBEL_ProvSchdService)this).new ProvSchd_Sprt01();
	}

	public static MSBEL_ProvSchdService.ProvSchd_Sprt01 crtProvSchd_Sprt01() {
		MSBEL_ProvSchdService lgc = new MSBEL_ProvSchdService();
		lgc.initProvSchd_Sprt01();
		return lgc.aProvSchd_Sprt01;
	}

	protected void paramProvSchd_Sprt01(MCParam p) {
		if (this.aProvSchd_Sprt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aProvSchd_Sprt01.up0());
		p.addDownBlock(aProvSchd_Sprt01.down0());
	}

	protected void doProvSchd_Sprt01() {
		aProvSchd_Sprt01.call();
	};

	/**
	 * ProvSchd_Sprt01ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR createProvSchd_Sprt01R(){
		return mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR.create();
	}

	/**
	 * ProvSchd_Sprt01ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR> createProvSchd_Sprt01L(){
		return MCList.create(mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ProvSchd_Upd01オペレーション.<p>
	 *
	 * 支給予定にデータを登録する。支給予定のデータを更新削除する。<br>
	 */
	abstract public class ProvSchd_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ProvSchd_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR> down0;
		
		
		// コンストラクタ
		protected ProvSchd_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR.class);

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
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_ProvSchdService)MSBEL_ProvSchdService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ProvSchd_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR createProvSchd_DtlR(){
			return mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR.create();
		}

		/**
		 * ProvSchd_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR> createProvSchd_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR.class);
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
		 * 	<tr><td><br></td><td>ps.prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ps.prov_src_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>ps.prov_src_schd_no1</td></tr>
		 * 	<tr><td><br></td><td>ps.prov_src_schd_no2</td></tr>
		 * 	<tr><td><br></td><td>ps.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>ps.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ps.xfr_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>ps.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ps.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>ps.accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ps.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ps.prsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ps.prov_typ</td></tr>
		 * 	<tr><td><br></td><td>ps.prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>ps.xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ps.xrate</td></tr>
		 * 	<tr><td><br></td><td>ps.ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ps.ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>ps.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ps.tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>ps.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>ps.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ps.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ps.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ps.wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>ps.wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>ps.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ps.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>ps.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>ps.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>not_completion_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ps.prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ps.prov_src_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>ps.prov_src_schd_no1</td></tr>
		 * 	<tr><td><br></td><td>ps.prov_src_schd_no2</td></tr>
		 * 	<tr><td><br></td><td>ps.prov_typ</td></tr>
		 * 	<tr><td><br></td><td>ps.prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>ps.xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ps.xrate</td></tr>
		 * 	<tr><td><br></td><td>ps.ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ps.ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>ps.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ps.tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>ps.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>ps.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ps.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ps.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ps.wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>ps.wtax_amt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ProvSchdService)MSBEL_ProvSchdService_MC_A.this).info;
		}


	}
	/**
	 * ProvSchd_Chk01オペレーション.<p>
	 *
	 * 支給予定のマスタ補完が可能かチェックする<br>
	 */
	abstract public class ProvSchd_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ProvSchd_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR> down0;
		
		
		// コンストラクタ
		protected ProvSchd_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR.class);

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
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_ProvSchdService)MSBEL_ProvSchdService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ProvSchdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR createProvSchdChk01_DtlR(){
			return mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR.create();
		}

		/**
		 * ProvSchdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR> createProvSchdChk01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR.class);
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
		 * 	<tr><td><br></td><td>ps.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ps.accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ps.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ps.prsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ps.prov_typ</td></tr>
		 * 	<tr><td><br></td><td>ps.prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>ps.xrate</td></tr>
		 * 	<tr><td><br></td><td>ps.ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>ps.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ps.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>ps.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ps.prov_typ</td></tr>
		 * 	<tr><td><br></td><td>ps.prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>ps.xrate</td></tr>
		 * 	<tr><td><br></td><td>ps.ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>ps.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>ps.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ProvSchdService)MSBEL_ProvSchdService_MC_A.this).info;
		}


	}
	/**
	 * ProvSchd_Sprt01オペレーション.<p>
	 *
	 * マスタ値や金額を補完します。<br>
	 */
	abstract public class ProvSchd_Sprt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ProvSchd_Sprt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR> down0;
		
		
		// コンストラクタ
		protected ProvSchd_Sprt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR.class);

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
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_ProvSchdService)MSBEL_ProvSchdService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ProvSchd_Sprt01ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR createProvSchd_Sprt01R(){
			return mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR.create();
		}

		/**
		 * ProvSchd_Sprt01ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR> createProvSchd_Sprt01L(){
			return MCList.create(mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ps.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ps.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>ps.accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ps.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ps.prsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ps.prov_typ</td></tr>
		 * 	<tr><td><br></td><td>ps.prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>ps.xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ps.xrate</td></tr>
		 * 	<tr><td><br></td><td>ps.ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ps.ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>ps.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ps.tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>ps.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>ps.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ps.wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>not_completion_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ps.prov_typ</td></tr>
		 * 	<tr><td><br></td><td>ps.prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>ps.xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ps.xrate</td></tr>
		 * 	<tr><td><br></td><td>ps.ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ps.ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>ps.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ps.tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>ps.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>ps.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ps.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ps.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ps.wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>ps.wtax_amt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ProvSchdService)MSBEL_ProvSchdService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}