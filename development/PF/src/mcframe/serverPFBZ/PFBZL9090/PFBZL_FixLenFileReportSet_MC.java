package mcframe.serverPFBZ.PFBZL9090;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.report.container.MCReportMeta;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.sys.MCFactory;

/**
 * 固定長フォーマットのReportSet
 */
public class PFBZL_FixLenFileReportSet_MC extends MCReportSet {

	public static final String DEF_BLOCK = "0";

	public static final String REPORTSET_TYPE_CROW = "1";
	public static final String REPORTSET_TYPE_ROW = "2";
	public static final String REPORTSET_TYPE_OHER = "3";
	
	protected String _type = null;

	static public PFBZL_FixLenFileReportSet create(Class<? extends MCRow> rowc) {

		MCReportClass rc = new MCReportClass(DEF_BLOCK, rowc, MCList.class);
		MCReportClassList ls = new MCReportClassList(null);
		ls.add(rc);

		MCReportMetaMap map = new MCReportMetaMap(MCReportSet.reportMetaMap);
		Object obj = MCFactory.invokeStatic(rowc, "create", null, null);
		MCRow r = rowc.cast(obj);
		MCMeta[] metas = r.getMetaArray();
		MCReportMeta[] rms = new MCReportMeta[metas.length];
		for (int i = 0; i < metas.length; i++) {
			rms[i] = new MCReportMeta(metas[i], metas[i].name(), "", metas[i].name(),
					true);
		}
		map.add(DEF_BLOCK, rms);
		String type;

		if (rowc == MCRow.class) {
			type = REPORTSET_TYPE_ROW;
		}
		else {
			type = REPORTSET_TYPE_CROW;
		}

		PFBZL_FixLenFileReportSet rtn = new PFBZL_FixLenFileReportSet(ls, map, type);
		return rtn;
	}

	public PFBZL_FixLenFileReportSet_MC(MCReportClassList ls, MCReportMetaMap map,
			String type) {
		setRowClassList(ls);
		setReportMetaMap(map);
		_type = type;
	}

	public String getReportSetType() {
		return _type;
	}

	@Override
	public int addRow(MCRow r) {
		if (_type.equals(REPORTSET_TYPE_ROW)) {
			super.addRow(DEF_BLOCK, r);
			return super.size() - 1;
		}
		else {
			return super.addRow(r);
		}
	}
}
