package mcframe.serverMSBH.MSBHL5020;

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
 * "MSBHL_ApDtlRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHL_ApDtlRegService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBH";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBHL5020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBHL_ApDtlRegService.ApDtl_Chk01 aApDtl_Chk01;

	protected void initApDtl_Chk01() {
		this.info = PDef.MS_MSBHL5020_ApDtl_Chk01_INFO;
		this.aApDtl_Chk01 = ((MSBHL_ApDtlRegService)this).new ApDtl_Chk01();
	}

	public static MSBHL_ApDtlRegService.ApDtl_Chk01 crtApDtl_Chk01() {
		MSBHL_ApDtlRegService lgc = new MSBHL_ApDtlRegService();
		lgc.initApDtl_Chk01();
		return lgc.aApDtl_Chk01;
	}

	protected void paramApDtl_Chk01(MCParam p) {
		if (this.aApDtl_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aApDtl_Chk01.up0());
		p.addDownBlock(aApDtl_Chk01.down0());
	}

	protected void doApDtl_Chk01() {
		aApDtl_Chk01.call();
	};

	/**
	 * ApDtl_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR createApDtl_Chk01_DtlR(){
		return mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR.create();
	}

	/**
	 * ApDtl_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR> createApDtl_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR.class);
	}
	protected MSBHL_ApDtlRegService.ApDtl_Chk03 aApDtl_Chk03;

	protected void initApDtl_Chk03() {
		this.info = PDef.MS_MSBHL5020_ApDtl_Chk03_INFO;
		this.aApDtl_Chk03 = ((MSBHL_ApDtlRegService)this).new ApDtl_Chk03();
	}

	public static MSBHL_ApDtlRegService.ApDtl_Chk03 crtApDtl_Chk03() {
		MSBHL_ApDtlRegService lgc = new MSBHL_ApDtlRegService();
		lgc.initApDtl_Chk03();
		return lgc.aApDtl_Chk03;
	}

	protected void paramApDtl_Chk03(MCParam p) {
		if (this.aApDtl_Chk03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aApDtl_Chk03.up0());
		p.addDownBlock(aApDtl_Chk03.down0());
	}

	protected void doApDtl_Chk03() {
		aApDtl_Chk03.call();
	};

	/**
	 * ApDtl_Chk03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR createApDtl_Chk03_DtlR(){
		return mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR.create();
	}

	/**
	 * ApDtl_Chk03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR> createApDtl_Chk03_DtlL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR.class);
	}
	protected MSBHL_ApDtlRegService.ApDtl_Upd01 aApDtl_Upd01;

	protected void initApDtl_Upd01() {
		this.info = PDef.MS_MSBHL5020_ApDtl_Upd01_INFO;
		this.aApDtl_Upd01 = ((MSBHL_ApDtlRegService)this).new ApDtl_Upd01();
	}

	public static MSBHL_ApDtlRegService.ApDtl_Upd01 crtApDtl_Upd01() {
		MSBHL_ApDtlRegService lgc = new MSBHL_ApDtlRegService();
		lgc.initApDtl_Upd01();
		return lgc.aApDtl_Upd01;
	}

	protected void paramApDtl_Upd01(MCParam p) {
		if (this.aApDtl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aApDtl_Upd01.up0());
	}

	protected void doApDtl_Upd01() {
		aApDtl_Upd01.call();
	};

	/**
	 * ApDtl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR createApDtl_Upd01_DtlR(){
		return mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR.create();
	}

	/**
	 * ApDtl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR> createApDtl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR.class);
	}
	protected MSBHL_ApDtlRegService.ApDtl_Upd02 aApDtl_Upd02;

	protected void initApDtl_Upd02() {
		this.info = PDef.MS_MSBHL5020_ApDtl_Upd02_INFO;
		this.aApDtl_Upd02 = ((MSBHL_ApDtlRegService)this).new ApDtl_Upd02();
	}

	public static MSBHL_ApDtlRegService.ApDtl_Upd02 crtApDtl_Upd02() {
		MSBHL_ApDtlRegService lgc = new MSBHL_ApDtlRegService();
		lgc.initApDtl_Upd02();
		return lgc.aApDtl_Upd02;
	}

	protected void paramApDtl_Upd02(MCParam p) {
		if (this.aApDtl_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aApDtl_Upd02.up0());
		p.addDownBlock(aApDtl_Upd02.down0());
	}

	protected void doApDtl_Upd02() {
		aApDtl_Upd02.call();
	};

	/**
	 * ApDtl_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5020.ApDtl_Upd02_DtlR createApDtl_Upd02_DtlR(){
		return mcframe.serverMSBH.MSBHL5020.ApDtl_Upd02_DtlR.create();
	}

	/**
	 * ApDtl_Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5020.ApDtl_Upd02_DtlR> createApDtl_Upd02_DtlL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5020.ApDtl_Upd02_DtlR.class);
	}
	protected MSBHL_ApDtlRegService.ApDtl_Upd03 aApDtl_Upd03;

	protected void initApDtl_Upd03() {
		this.info = PDef.MS_MSBHL5020_ApDtl_Upd03_INFO;
		this.aApDtl_Upd03 = ((MSBHL_ApDtlRegService)this).new ApDtl_Upd03();
	}

	public static MSBHL_ApDtlRegService.ApDtl_Upd03 crtApDtl_Upd03() {
		MSBHL_ApDtlRegService lgc = new MSBHL_ApDtlRegService();
		lgc.initApDtl_Upd03();
		return lgc.aApDtl_Upd03;
	}

	protected void paramApDtl_Upd03(MCParam p) {
		if (this.aApDtl_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aApDtl_Upd03.up0());
		p.addDownBlock(aApDtl_Upd03.down0());
	}

	protected void doApDtl_Upd03() {
		aApDtl_Upd03.call();
	};

	/**
	 * ApDtl_Upd03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR createApDtl_Upd03_DtlR(){
		return mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR.create();
	}

	/**
	 * ApDtl_Upd03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR> createApDtl_Upd03_DtlL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR.class);
	}
	protected MSBHL_ApDtlRegService.ApDtl_Del01 aApDtl_Del01;

	protected void initApDtl_Del01() {
		this.info = PDef.MS_MSBHL5020_ApDtl_Del01_INFO;
		this.aApDtl_Del01 = ((MSBHL_ApDtlRegService)this).new ApDtl_Del01();
	}

	public static MSBHL_ApDtlRegService.ApDtl_Del01 crtApDtl_Del01() {
		MSBHL_ApDtlRegService lgc = new MSBHL_ApDtlRegService();
		lgc.initApDtl_Del01();
		return lgc.aApDtl_Del01;
	}

	protected void paramApDtl_Del01(MCParam p) {
		if (this.aApDtl_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aApDtl_Del01.up0());
	}

	protected void doApDtl_Del01() {
		aApDtl_Del01.call();
	};

	/**
	 * ApDtl_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5020.ApDtl_Del01_DtlR createApDtl_Del01_DtlR(){
		return mcframe.serverMSBH.MSBHL5020.ApDtl_Del01_DtlR.create();
	}

	/**
	 * ApDtl_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5020.ApDtl_Del01_DtlR> createApDtl_Del01_DtlL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5020.ApDtl_Del01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ApDtl_Chk01オペレーション.<p>
	 *
	 * 買掛明細の登録・更新・取消が可能かチェックをする。<br>
	 */
	abstract public class ApDtl_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ApDtl_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR> down0;
		
		
		// コンストラクタ
		protected ApDtl_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR.class);

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
			invoke((MSBHL_ApDtlRegService)MSBHL_ApDtlRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ApDtl_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR createApDtl_Chk01_DtlR(){
			return mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR.create();
		}

		/**
		 * ApDtl_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR> createApDtl_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR.class);
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
		 * 	<tr><td><br></td><td>old_purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_ym</td></tr>
		 * 	<tr><td><br></td><td>can_pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>ncv_flg</td></tr>
		 * 	<tr><td><br></td><td>accpt_dfct_flg</td></tr>
		 * 	<tr><td><br></td><td>apd.purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>apd.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>apd.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>apd.bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>apd.purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>apd.purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>apd.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>apd.ac_ym</td></tr>
		 * 	<tr><td><br></td><td>apd.pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>apd.pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>apd.pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>apd.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>apd.interim_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>old_purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_ym</td></tr>
		 * 	<tr><td><br></td><td>can_pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>ncv_flg</td></tr>
		 * 	<tr><td><br></td><td>accpt_dfct_flg</td></tr>
		 * 	<tr><td><br></td><td>apd.purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>apd.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>apd.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>apd.bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>apd.purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>apd.purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>apd.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>apd.ac_ym</td></tr>
		 * 	<tr><td><br></td><td>apd.pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>apd.pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>apd.pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>apd.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>apd.interim_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_ApDtlRegService)MSBHL_ApDtlRegService_MC_A.this).info;
		}


	}
	/**
	 * ApDtl_Chk03オペレーション.<p>
	 *
	 * 残高振替に伴う買掛明細の登録が可能かチェックをする。<br>
	 */
	abstract public class ApDtl_Chk03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ApDtl_Chk03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR> down0;
		
		
		// コンストラクタ
		protected ApDtl_Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR.class);

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
			invoke((MSBHL_ApDtlRegService)MSBHL_ApDtlRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ApDtl_Chk03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR createApDtl_Chk03_DtlR(){
			return mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR.create();
		}

		/**
		 * ApDtl_Chk03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR> createApDtl_Chk03_DtlL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>apd.bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>apd.pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>apd.pay_basis_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_ApDtlRegService)MSBHL_ApDtlRegService_MC_A.this).info;
		}


	}
	/**
	 * ApDtl_Upd01オペレーション.<p>
	 *
	 * 買掛明細を登録・更新・取消する。<br>
	 */
	abstract public class ApDtl_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ApDtl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR> up0;
		
		
		// コンストラクタ
		protected ApDtl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBHL_ApDtlRegService)MSBHL_ApDtlRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ApDtl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR createApDtl_Upd01_DtlR(){
			return mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR.create();
		}

		/**
		 * ApDtl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR> createApDtl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR.class);
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
		 * 	<tr><td><br></td><td>can_purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>can_purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>old_purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>can_ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_ym</td></tr>
		 * 	<tr><td><br></td><td>can_pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>ncv_flg</td></tr>
		 * 	<tr><td><br></td><td>accpt_dfct_flg</td></tr>
		 * 	<tr><td><br></td><td>apd.po_no</td></tr>
		 * 	<tr><td><br></td><td>apd.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>apd.purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>apd.purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>apd.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>apd.purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>apd.purc_act_rev</td></tr>
		 * 	<tr><td><br></td><td>apd.bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>apd.bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>apd.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>apd.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>apd.ap_typ</td></tr>
		 * 	<tr><td><br></td><td>apd.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>apd.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>apd.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>apd.asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>apd.bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>apd.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>apd.purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>apd.purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>apd.sno1</td></tr>
		 * 	<tr><td><br></td><td>apd.sno2</td></tr>
		 * 	<tr><td><br></td><td>apd.sno3</td></tr>
		 * 	<tr><td><br></td><td>apd.sno4</td></tr>
		 * 	<tr><td><br></td><td>apd.act_dt</td></tr>
		 * 	<tr><td><br></td><td>apd.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>apd.ac_ym</td></tr>
		 * 	<tr><td><br></td><td>apd.pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>apd.pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>apd.pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>apd.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>apd.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>apd.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>apd.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>apd.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>apd.sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>apd.sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>apd.sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>apd.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>apd.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>apd.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>apd.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>apd.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>apd.interim_flg</td></tr>
		 * 	<tr><td><br></td><td>apd.xrate</td></tr>
		 * 	<tr><td><br></td><td>apd.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>apd.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>apd.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>apd.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>apd.trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>apd.base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>apd.base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>apd.base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>apd.base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>apd.wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>apd.wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>apd.base_purc_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>apd.trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>apd.trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>apd.trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>apd.trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>apd.base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>apd.base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>apd.base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>apd.base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>apd.repurc_obli_flg</td></tr>
		 * 	<tr><td><br></td><td>apd.outsrc_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_ApDtlRegService)MSBHL_ApDtlRegService_MC_A.this).info;
		}


	}
	/**
	 * ApDtl_Upd02オペレーション.<p>
	 *
	 * 一部支払、もしくは全額支払に対する繰越処理を行う。<br>
	 */
	abstract public class ApDtl_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ApDtl_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5020.ApDtl_Upd02_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5020.ApDtl_Upd02_DtlR> down0;
		
		
		// コンストラクタ
		protected ApDtl_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5020.ApDtl_Upd02_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL5020.ApDtl_Upd02_DtlR.class);

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
			invoke((MSBHL_ApDtlRegService)MSBHL_ApDtlRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ApDtl_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5020.ApDtl_Upd02_DtlR createApDtl_Upd02_DtlR(){
			return mcframe.serverMSBH.MSBHL5020.ApDtl_Upd02_DtlR.create();
		}

		/**
		 * ApDtl_Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5020.ApDtl_Upd02_DtlR> createApDtl_Upd02_DtlL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5020.ApDtl_Upd02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>crryovr_src_ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>co_bsppl_cl_day</td></tr>
		 * 	<tr><td><br></td><td>co_bsppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>co_bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_onr_prov_amt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5020.ApDtl_Upd02_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>pay_ap_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5020.ApDtl_Upd02_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_ApDtlRegService)MSBHL_ApDtlRegService_MC_A.this).info;
		}


	}
	/**
	 * ApDtl_Upd03オペレーション.<p>
	 *
	 * 残高振替に伴う買掛明細を登録する。<br>
	 */
	abstract public class ApDtl_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ApDtl_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR> down0;
		
		
		// コンストラクタ
		protected ApDtl_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR.class);

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
			invoke((MSBHL_ApDtlRegService)MSBHL_ApDtlRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ApDtl_Upd03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR createApDtl_Upd03_DtlR(){
			return mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR.create();
		}

		/**
		 * ApDtl_Upd03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR> createApDtl_Upd03_DtlL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ap_appl_schd_no</td></tr>
		 * 	<tr><td><br></td><td>apd.ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>apd.asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>apd.bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>apd.bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>apd.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>apd.wrk_no</td></tr>
		 * 	<tr><td><br></td><td>apd.act_dt</td></tr>
		 * 	<tr><td><br></td><td>apd.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>apd.pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>apd.pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>apd.pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>apd.xrate</td></tr>
		 * 	<tr><td><br></td><td>apd.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>apd.base_cur_amt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ap_appl_schd_no</td></tr>
		 * 	<tr><td><br></td><td>to_ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>apd.ap_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5020.ApDtl_Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_ApDtlRegService)MSBHL_ApDtlRegService_MC_A.this).info;
		}


	}
	/**
	 * ApDtl_Del01オペレーション.<p>
	 *
	 * 一部支払、もしくは全額支払に対する繰越処理を取り消す。<br>
	 */
	abstract public class ApDtl_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ApDtl_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5020.ApDtl_Del01_DtlR> up0;
		
		
		// コンストラクタ
		protected ApDtl_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5020.ApDtl_Del01_DtlR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBHL_ApDtlRegService)MSBHL_ApDtlRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ApDtl_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5020.ApDtl_Del01_DtlR createApDtl_Del01_DtlR(){
			return mcframe.serverMSBH.MSBHL5020.ApDtl_Del01_DtlR.create();
		}

		/**
		 * ApDtl_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5020.ApDtl_Del01_DtlR> createApDtl_Del01_DtlL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5020.ApDtl_Del01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5020.ApDtl_Del01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_ApDtlRegService)MSBHL_ApDtlRegService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}