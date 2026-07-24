package mcframe.serverMBBC.MBBCL5020;

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
 * "MBBCL_AttachService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBCL_AttachService_MC_A extends mcframe.serverMBUD.MBUDL5010.MBUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MB";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MBBC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MBBCL5020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MBBCL_AttachService.Attach_Chk01 aAttach_Chk01;

	protected void initAttach_Chk01() {
		this.info = PDef.MB_MBBCL5020_Attach_Chk01_INFO;
		this.aAttach_Chk01 = ((MBBCL_AttachService)this).new Attach_Chk01();
	}

	public static MBBCL_AttachService.Attach_Chk01 crtAttach_Chk01() {
		MBBCL_AttachService lgc = new MBBCL_AttachService();
		lgc.initAttach_Chk01();
		return lgc.aAttach_Chk01;
	}

	protected void paramAttach_Chk01(MCParam p) {
		if (this.aAttach_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAttach_Chk01.up0());
		p.addUpBlock(aAttach_Chk01.up1());
		p.addDownBlock(aAttach_Chk01.down0());
		p.addDownBlock(aAttach_Chk01.down1());
	}

	protected void doAttach_Chk01() {
		aAttach_Chk01.call();
	};

	/**
	 * Attach_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR createAttach_Chk01_DtlR(){
		return mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR.create();
	}

	/**
	 * Attach_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR> createAttach_Chk01_DtlL(){
		return MCList.create(mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR.class);
	}

	/**
	 * Attach_Chk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBC.MBBCL5020.Attach_Chk01_HdrR createAttach_Chk01_HdrR(){
		return mcframe.serverMBBC.MBBCL5020.Attach_Chk01_HdrR.create();
	}
	protected MBBCL_AttachService.Attach_Chk02 aAttach_Chk02;

	protected void initAttach_Chk02() {
		this.info = PDef.MB_MBBCL5020_Attach_Chk02_INFO;
		this.aAttach_Chk02 = ((MBBCL_AttachService)this).new Attach_Chk02();
	}

	public static MBBCL_AttachService.Attach_Chk02 crtAttach_Chk02() {
		MBBCL_AttachService lgc = new MBBCL_AttachService();
		lgc.initAttach_Chk02();
		return lgc.aAttach_Chk02;
	}

	protected void paramAttach_Chk02(MCParam p) {
		if (this.aAttach_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAttach_Chk02.up0());
		p.addDownBlock(aAttach_Chk02.down0());
	}

	protected void doAttach_Chk02() {
		aAttach_Chk02.call();
	};

	/**
	 * Attach_Chk02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBC.MBBCL5020.Attach_Chk02_DtlR createAttach_Chk02_DtlR(){
		return mcframe.serverMBBC.MBBCL5020.Attach_Chk02_DtlR.create();
	}

	/**
	 * Attach_Chk02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBC.MBBCL5020.Attach_Chk02_DtlR> createAttach_Chk02_DtlL(){
		return MCList.create(mcframe.serverMBBC.MBBCL5020.Attach_Chk02_DtlR.class);
	}
	protected MBBCL_AttachService.Attach_Upd01 aAttach_Upd01;

	protected void initAttach_Upd01() {
		this.info = PDef.MB_MBBCL5020_Attach_Upd01_INFO;
		this.aAttach_Upd01 = ((MBBCL_AttachService)this).new Attach_Upd01();
	}

	public static MBBCL_AttachService.Attach_Upd01 crtAttach_Upd01() {
		MBBCL_AttachService lgc = new MBBCL_AttachService();
		lgc.initAttach_Upd01();
		return lgc.aAttach_Upd01;
	}

	protected void paramAttach_Upd01(MCParam p) {
		if (this.aAttach_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAttach_Upd01.up0());
		p.addUpBlock(aAttach_Upd01.up1());
		p.addUpBlock(aAttach_Upd01.up2());
		p.addDownBlock(aAttach_Upd01.down0());
	}

	protected void doAttach_Upd01() {
		aAttach_Upd01.call();
	};

	/**
	 * Attach_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR createAttach_Upd01_DtlR(){
		return mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR.create();
	}

	/**
	 * Attach_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR> createAttach_Upd01_DtlL(){
		return MCList.create(mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR.class);
	}

	/**
	 * Attach_Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBC.MBBCL5020.Attach_Chk01_HdrR createAttach_Upd01_HdrR(){
		return mcframe.serverMBBC.MBBCL5020.Attach_Chk01_HdrR.create();
	}

	/**
	 * Attach_Upd01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBC.MBBCL5020.Attach_Upd01_Dtl2R createAttach_Upd01_Dtl2R(){
		return mcframe.serverMBBC.MBBCL5020.Attach_Upd01_Dtl2R.create();
	}

	/**
	 * Attach_Upd01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBC.MBBCL5020.Attach_Upd01_Dtl2R> createAttach_Upd01_Dtl2L(){
		return MCList.create(mcframe.serverMBBC.MBBCL5020.Attach_Upd01_Dtl2R.class);
	}
	protected MBBCL_AttachService.Attach_Del01 aAttach_Del01;

	protected void initAttach_Del01() {
		this.info = PDef.MB_MBBCL5020_Attach_Del01_INFO;
		this.aAttach_Del01 = ((MBBCL_AttachService)this).new Attach_Del01();
	}

	public static MBBCL_AttachService.Attach_Del01 crtAttach_Del01() {
		MBBCL_AttachService lgc = new MBBCL_AttachService();
		lgc.initAttach_Del01();
		return lgc.aAttach_Del01;
	}

	protected void paramAttach_Del01(MCParam p) {
		if (this.aAttach_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAttach_Del01.up0());
	}

	protected void doAttach_Del01() {
		aAttach_Del01.call();
	};

	/**
	 * Attach_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBC.MBBCL5020.Attach_Chk02_DtlR createAttach_Del01_DtlR(){
		return mcframe.serverMBBC.MBBCL5020.Attach_Chk02_DtlR.create();
	}

	/**
	 * Attach_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBC.MBBCL5020.Attach_Chk02_DtlR> createAttach_Del01_DtlL(){
		return MCList.create(mcframe.serverMBBC.MBBCL5020.Attach_Chk02_DtlR.class);
	}
	protected MBBCL_AttachService.Attach_Copy01 aAttach_Copy01;

	protected void initAttach_Copy01() {
		this.info = PDef.MB_MBBCL5020_Attach_Copy01_INFO;
		this.aAttach_Copy01 = ((MBBCL_AttachService)this).new Attach_Copy01();
	}

	public static MBBCL_AttachService.Attach_Copy01 crtAttach_Copy01() {
		MBBCL_AttachService lgc = new MBBCL_AttachService();
		lgc.initAttach_Copy01();
		return lgc.aAttach_Copy01;
	}

	protected void paramAttach_Copy01(MCParam p) {
		if (this.aAttach_Copy01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAttach_Copy01.up0());
	}

	protected void doAttach_Copy01() {
		aAttach_Copy01.call();
	};

	/**
	 * Attach_Copy01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBC.MBBCL5020.Attach_Copy01_HdrR createAttach_Copy01_HdrR(){
		return mcframe.serverMBBC.MBBCL5020.Attach_Copy01_HdrR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Attach_Chk01オペレーション.<p>
	 *
	 * 添付ファイル情報登録・更新前チェック<br>
	 */
	abstract public class Attach_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Attach_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMBBC.MBBCL5020.Attach_Chk01_HdrR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMBBC.MBBCL5020.Attach_Chk01_HdrR down1;
		
		
		// コンストラクタ
		protected Attach_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR.class);
			up1 = mcframe.serverMBBC.MBBCL5020.Attach_Chk01_HdrR.create();
			down0 = MCList.create(mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR.class);
			down1 = mcframe.serverMBBC.MBBCL5020.Attach_Chk01_HdrR.create();

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
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MBBCL_AttachService)MBBCL_AttachService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Attach_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR createAttach_Chk01_DtlR(){
			return mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR.create();
		}

		/**
		 * Attach_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR> createAttach_Chk01_DtlL(){
			return MCList.create(mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR.class);
		}

		/**
		 * Attach_Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBC.MBBCL5020.Attach_Chk01_HdrR createAttach_Chk01_HdrR(){
			return mcframe.serverMBBC.MBBCL5020.Attach_Chk01_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>edition</td></tr>
		 * 	<tr><td><br></td><td>biz_typ</td></tr>
		 * 	<tr><td><br></td><td>biz_key1</td></tr>
		 * 	<tr><td><br></td><td>biz_key2</td></tr>
		 * 	<tr><td><br></td><td>biz_key3</td></tr>
		 * 	<tr><td><br></td><td>biz_key4</td></tr>
		 * 	<tr><td><br></td><td>biz_key5</td></tr>
		 * 	<tr><td><br></td><td>biz_key6</td></tr>
		 * 	<tr><td><br></td><td>biz_key7</td></tr>
		 * 	<tr><td><br></td><td>biz_key8</td></tr>
		 * 	<tr><td><br></td><td>biz_key9</td></tr>
		 * 	<tr><td><br></td><td>biz_key10</td></tr>
		 * 	<tr><td><br></td><td>report_id</td></tr>
		 * 	<tr><td><br></td><td>dt</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>amt</td></tr>
		 * 	<tr><td><br></td><td>rmrks1</td></tr>
		 * 	<tr><td><br></td><td>rmrks2</td></tr>
		 * 	<tr><td><br></td><td>rmrks3</td></tr>
		 * 	<tr><td><br></td><td>rmrks4</td></tr>
		 * 	<tr><td><br></td><td>rmrks5</td></tr>
		 * 	<tr><td><br></td><td>file_bin</td></tr>
		 * 	<tr><td><br></td><td>doc_id</td></tr>
		 * 	<tr><td><br></td><td>file_path</td></tr>
		 * 	<tr><td><br></td><td>file_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char4</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char5</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>select_file_flg</td></tr>
		 * 	<tr><td><br></td><td>attach_file_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBC.MBBCL5020.Attach_Chk01_HdrR
		 */
		public mcframe.serverMBBC.MBBCL5020.Attach_Chk01_HdrR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>edition</td></tr>
		 * 	<tr><td><br></td><td>biz_typ</td></tr>
		 * 	<tr><td><br></td><td>biz_key1</td></tr>
		 * 	<tr><td><br></td><td>biz_key2</td></tr>
		 * 	<tr><td><br></td><td>biz_key3</td></tr>
		 * 	<tr><td><br></td><td>biz_key4</td></tr>
		 * 	<tr><td><br></td><td>biz_key5</td></tr>
		 * 	<tr><td><br></td><td>biz_key6</td></tr>
		 * 	<tr><td><br></td><td>biz_key7</td></tr>
		 * 	<tr><td><br></td><td>biz_key8</td></tr>
		 * 	<tr><td><br></td><td>biz_key9</td></tr>
		 * 	<tr><td><br></td><td>biz_key10</td></tr>
		 * 	<tr><td><br></td><td>report_id</td></tr>
		 * 	<tr><td><br></td><td>dt</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>amt</td></tr>
		 * 	<tr><td><br></td><td>rmrks1</td></tr>
		 * 	<tr><td><br></td><td>rmrks2</td></tr>
		 * 	<tr><td><br></td><td>rmrks3</td></tr>
		 * 	<tr><td><br></td><td>rmrks4</td></tr>
		 * 	<tr><td><br></td><td>rmrks5</td></tr>
		 * 	<tr><td><br></td><td>file_bin</td></tr>
		 * 	<tr><td><br></td><td>doc_id</td></tr>
		 * 	<tr><td><br></td><td>file_path</td></tr>
		 * 	<tr><td><br></td><td>file_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char4</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char5</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>select_file_flg</td></tr>
		 * 	<tr><td><br></td><td>attach_file_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBC.MBBCL5020.Attach_Chk01_HdrR
		 */
		public mcframe.serverMBBC.MBBCL5020.Attach_Chk01_HdrR down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBCL_AttachService)MBBCL_AttachService_MC_A.this).info;
		}


	}
	/**
	 * Attach_Chk02オペレーション.<p>
	 *
	 * 添付ファイル情報削除前チェック<br>
	 */
	abstract public class Attach_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Attach_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBC.MBBCL5020.Attach_Chk02_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBC.MBBCL5020.Attach_Chk02_DtlR> down0;
		
		
		// コンストラクタ
		protected Attach_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBC.MBBCL5020.Attach_Chk02_DtlR.class);
			down0 = MCList.create(mcframe.serverMBBC.MBBCL5020.Attach_Chk02_DtlR.class);

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
			invoke((MBBCL_AttachService)MBBCL_AttachService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Attach_Chk02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBC.MBBCL5020.Attach_Chk02_DtlR createAttach_Chk02_DtlR(){
			return mcframe.serverMBBC.MBBCL5020.Attach_Chk02_DtlR.create();
		}

		/**
		 * Attach_Chk02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBC.MBBCL5020.Attach_Chk02_DtlR> createAttach_Chk02_DtlL(){
			return MCList.create(mcframe.serverMBBC.MBBCL5020.Attach_Chk02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>biz_typ</td></tr>
		 * 	<tr><td><br></td><td>biz_key1</td></tr>
		 * 	<tr><td><br></td><td>biz_key2</td></tr>
		 * 	<tr><td><br></td><td>biz_key3</td></tr>
		 * 	<tr><td><br></td><td>biz_key4</td></tr>
		 * 	<tr><td><br></td><td>biz_key5</td></tr>
		 * 	<tr><td><br></td><td>biz_key6</td></tr>
		 * 	<tr><td><br></td><td>biz_key7</td></tr>
		 * 	<tr><td><br></td><td>biz_key8</td></tr>
		 * 	<tr><td><br></td><td>biz_key9</td></tr>
		 * 	<tr><td><br></td><td>biz_key10</td></tr>
		 * 	<tr><td><br></td><td>report_id</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBC.MBBCL5020.Attach_Chk02_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>biz_typ</td></tr>
		 * 	<tr><td><br></td><td>biz_key1</td></tr>
		 * 	<tr><td><br></td><td>biz_key2</td></tr>
		 * 	<tr><td><br></td><td>biz_key3</td></tr>
		 * 	<tr><td><br></td><td>biz_key4</td></tr>
		 * 	<tr><td><br></td><td>biz_key5</td></tr>
		 * 	<tr><td><br></td><td>biz_key6</td></tr>
		 * 	<tr><td><br></td><td>biz_key7</td></tr>
		 * 	<tr><td><br></td><td>biz_key8</td></tr>
		 * 	<tr><td><br></td><td>biz_key9</td></tr>
		 * 	<tr><td><br></td><td>biz_key10</td></tr>
		 * 	<tr><td><br></td><td>report_id</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBC.MBBCL5020.Attach_Chk02_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBCL_AttachService)MBBCL_AttachService_MC_A.this).info;
		}


	}
	/**
	 * Attach_Upd01オペレーション.<p>
	 *
	 * 添付ファイル情報を登録・更新する<br>
	 */
	abstract public class Attach_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Attach_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMBBC.MBBCL5020.Attach_Chk01_HdrR up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBC.MBBCL5020.Attach_Upd01_Dtl2R> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR> down0;
		
		
		// コンストラクタ
		protected Attach_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR.class);
			up1 = mcframe.serverMBBC.MBBCL5020.Attach_Chk01_HdrR.create();
			up2 = MCList.create(mcframe.serverMBBC.MBBCL5020.Attach_Upd01_Dtl2R.class);
			down0 = MCList.create(mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR.class);

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
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MBBCL_AttachService)MBBCL_AttachService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Attach_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR createAttach_Upd01_DtlR(){
			return mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR.create();
		}

		/**
		 * Attach_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR> createAttach_Upd01_DtlL(){
			return MCList.create(mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR.class);
		}

		/**
		 * Attach_Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBC.MBBCL5020.Attach_Chk01_HdrR createAttach_Upd01_HdrR(){
			return mcframe.serverMBBC.MBBCL5020.Attach_Chk01_HdrR.create();
		}

		/**
		 * Attach_Upd01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBC.MBBCL5020.Attach_Upd01_Dtl2R createAttach_Upd01_Dtl2R(){
			return mcframe.serverMBBC.MBBCL5020.Attach_Upd01_Dtl2R.create();
		}

		/**
		 * Attach_Upd01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBC.MBBCL5020.Attach_Upd01_Dtl2R> createAttach_Upd01_Dtl2L(){
			return MCList.create(mcframe.serverMBBC.MBBCL5020.Attach_Upd01_Dtl2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>edition</td></tr>
		 * 	<tr><td><br></td><td>biz_typ</td></tr>
		 * 	<tr><td><br></td><td>biz_key1</td></tr>
		 * 	<tr><td><br></td><td>biz_key2</td></tr>
		 * 	<tr><td><br></td><td>biz_key3</td></tr>
		 * 	<tr><td><br></td><td>biz_key4</td></tr>
		 * 	<tr><td><br></td><td>biz_key5</td></tr>
		 * 	<tr><td><br></td><td>biz_key6</td></tr>
		 * 	<tr><td><br></td><td>biz_key7</td></tr>
		 * 	<tr><td><br></td><td>biz_key8</td></tr>
		 * 	<tr><td><br></td><td>biz_key9</td></tr>
		 * 	<tr><td><br></td><td>biz_key10</td></tr>
		 * 	<tr><td><br></td><td>report_id</td></tr>
		 * 	<tr><td><br></td><td>dt</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>amt</td></tr>
		 * 	<tr><td><br></td><td>rmrks1</td></tr>
		 * 	<tr><td><br></td><td>rmrks2</td></tr>
		 * 	<tr><td><br></td><td>rmrks3</td></tr>
		 * 	<tr><td><br></td><td>rmrks4</td></tr>
		 * 	<tr><td><br></td><td>rmrks5</td></tr>
		 * 	<tr><td><br></td><td>file_bin</td></tr>
		 * 	<tr><td><br></td><td>file_path</td></tr>
		 * 	<tr><td><br></td><td>file_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char4</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char5</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>select_file_flg</td></tr>
		 * 	<tr><td><br></td><td>attach_file_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBC.MBBCL5020.Attach_Chk01_HdrR
		 */
		public mcframe.serverMBBC.MBBCL5020.Attach_Chk01_HdrR up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>biz_typ</td></tr>
		 * 	<tr><td><br></td><td>report_id</td></tr>
		 * 	<tr><td><br></td><td>biz_key1</td></tr>
		 * 	<tr><td><br></td><td>biz_key2</td></tr>
		 * 	<tr><td><br></td><td>biz_key3</td></tr>
		 * 	<tr><td><br></td><td>biz_key4</td></tr>
		 * 	<tr><td><br></td><td>biz_key5</td></tr>
		 * 	<tr><td><br></td><td>biz_key6</td></tr>
		 * 	<tr><td><br></td><td>biz_key7</td></tr>
		 * 	<tr><td><br></td><td>biz_key8</td></tr>
		 * 	<tr><td><br></td><td>biz_key9</td></tr>
		 * 	<tr><td><br></td><td>biz_key10</td></tr>
		 * 	<tr><td><br></td><td>data_lno</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBC.MBBCL5020.Attach_Upd01_Dtl2R> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBC.MBBCL5020.Attach_Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBCL_AttachService)MBBCL_AttachService_MC_A.this).info;
		}


	}
	/**
	 * Attach_Del01オペレーション.<p>
	 *
	 * 添付ファイル情報を削除する<br>
	 */
	abstract public class Attach_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Attach_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBC.MBBCL5020.Attach_Chk02_DtlR> up0;
		
		
		// コンストラクタ
		protected Attach_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBC.MBBCL5020.Attach_Chk02_DtlR.class);

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
			invoke((MBBCL_AttachService)MBBCL_AttachService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Attach_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBC.MBBCL5020.Attach_Chk02_DtlR createAttach_Del01_DtlR(){
			return mcframe.serverMBBC.MBBCL5020.Attach_Chk02_DtlR.create();
		}

		/**
		 * Attach_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBC.MBBCL5020.Attach_Chk02_DtlR> createAttach_Del01_DtlL(){
			return MCList.create(mcframe.serverMBBC.MBBCL5020.Attach_Chk02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>biz_typ</td></tr>
		 * 	<tr><td><br></td><td>biz_key1</td></tr>
		 * 	<tr><td><br></td><td>biz_key2</td></tr>
		 * 	<tr><td><br></td><td>biz_key3</td></tr>
		 * 	<tr><td><br></td><td>biz_key4</td></tr>
		 * 	<tr><td><br></td><td>biz_key5</td></tr>
		 * 	<tr><td><br></td><td>biz_key6</td></tr>
		 * 	<tr><td><br></td><td>biz_key7</td></tr>
		 * 	<tr><td><br></td><td>biz_key8</td></tr>
		 * 	<tr><td><br></td><td>biz_key9</td></tr>
		 * 	<tr><td><br></td><td>biz_key10</td></tr>
		 * 	<tr><td><br></td><td>report_id</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBC.MBBCL5020.Attach_Chk02_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBCL_AttachService)MBBCL_AttachService_MC_A.this).info;
		}


	}
	/**
	 * Attach_Copy01オペレーション.<p>
	 *
	 * 添付ファイルを外部システムに保存する<br>
	 */
	abstract public class Attach_Copy01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Attach_Copy01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBC.MBBCL5020.Attach_Copy01_HdrR up0;
		
		
		// コンストラクタ
		protected Attach_Copy01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBC.MBBCL5020.Attach_Copy01_HdrR.create();

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
			invoke((MBBCL_AttachService)MBBCL_AttachService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Attach_Copy01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBC.MBBCL5020.Attach_Copy01_HdrR createAttach_Copy01_HdrR(){
			return mcframe.serverMBBC.MBBCL5020.Attach_Copy01_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>msg_queue_id</td></tr>
		 * 	<tr><td><br></td><td>retry_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBC.MBBCL5020.Attach_Copy01_HdrR
		 */
		public mcframe.serverMBBC.MBBCL5020.Attach_Copy01_HdrR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBCL_AttachService)MBBCL_AttachService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}